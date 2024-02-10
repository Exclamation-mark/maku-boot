package net.xsn.system.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import net.xsn.framework.common.utils.PageResult;
import net.xsn.framework.common.utils.Result;
import net.xsn.framework.operatelog.annotations.OperateLog;
import net.xsn.framework.operatelog.enums.OperateTypeEnum;
import net.xsn.system.convert.SysParamsConvert;
import net.xsn.system.entity.SysParamsEntity;
import net.xsn.system.query.SysParamsQuery;
import net.xsn.system.service.SysParamsService;
import net.xsn.system.vo.SysParamsVO;
import org.springdoc.core.annotations.ParameterObject;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 参数管理
 *
 * @author 阿沐 babamu@126.com
 * <a href="https://xsn.net">xsn</a>
 */
@RestController
@RequestMapping("sys/params")
@Tag(name = "参数管理")
@AllArgsConstructor
public class SysParamsController {
    private final SysParamsService sysParamsService;

    @GetMapping("page")
    @Operation(summary = "分页")
    @PreAuthorize("hasAuthority('sys:params:all')")
    public Result<PageResult<SysParamsVO>> page(@ParameterObject @Valid SysParamsQuery query) {
        PageResult<SysParamsVO> page = sysParamsService.page(query);

        return Result.ok(page);
    }

    @GetMapping("{id}")
    @Operation(summary = "信息")
    @PreAuthorize("hasAuthority('sys:params:all')")
    public Result<SysParamsVO> get(@PathVariable("id") Long id) {
        SysParamsEntity entity = sysParamsService.getById(id);

        return Result.ok(SysParamsConvert.INSTANCE.convert(entity));
    }

    @PostMapping
    @Operation(summary = "保存")
    @OperateLog(type = OperateTypeEnum.INSERT)
    @PreAuthorize("hasAuthority('sys:params:all')")
    public Result<String> save(@RequestBody SysParamsVO vo) {
        sysParamsService.save(vo);

        return Result.ok();
    }

    @PutMapping
    @Operation(summary = "修改")
    @OperateLog(type = OperateTypeEnum.UPDATE)
    @PreAuthorize("hasAuthority('sys:params:all')")
    public Result<String> update(@RequestBody @Valid SysParamsVO vo) {
        sysParamsService.update(vo);

        return Result.ok();
    }

    @DeleteMapping
    @Operation(summary = "删除")
    @OperateLog(type = OperateTypeEnum.DELETE)
    @PreAuthorize("hasAuthority('sys:params:all')")
    public Result<String> delete(@RequestBody List<Long> idList) {
        sysParamsService.delete(idList);

        return Result.ok();
    }
}