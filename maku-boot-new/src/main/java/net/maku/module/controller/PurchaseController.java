package net.maku.module.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.security.PermitAll;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import net.maku.framework.common.utils.PageResult;
import net.maku.framework.common.utils.Result;
import net.maku.framework.operatelog.annotations.OperateLog;
import net.maku.framework.operatelog.enums.OperateTypeEnum;
import net.maku.module.convert.PurchaseConvert;
import net.maku.module.entity.PurchaseEntity;
import net.maku.module.query.PurchaseQuery;
import net.maku.module.service.PurchaseService;
import net.maku.module.vo.PurchaseVO;
import org.springdoc.core.annotations.ParameterObject;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("ass/check")
@Tag(name = "资产管理")
@AllArgsConstructor
public class PurchaseController {
    private final PurchaseService purchaseService;

    @GetMapping("page")
    @Operation(summary = "分页")
    public Result<PageResult<PurchaseVO>> page(@ParameterObject @Valid PurchaseQuery query) {
        PageResult<PurchaseVO> page = purchaseService.page(query);

        return Result.ok(page);
    }

    @PostMapping
    @Operation(summary = "保存")
    @OperateLog(type = OperateTypeEnum.INSERT)
    public Result<String> save(@RequestBody @Valid PurchaseVO vo) {
        purchaseService.saveVO(vo);

        return Result.ok();
    }

    @PutMapping
    @Operation(summary = "更新")
    @OperateLog(type = OperateTypeEnum.INSERT)
    public Result<String> update(@RequestBody @Valid PurchaseVO vo) {
        purchaseService.updateVo(vo);

        return Result.ok();
    }

    @PutMapping("reSubmit")
    @Operation(summary = "更新")
    @OperateLog(type = OperateTypeEnum.INSERT)
    public Result<String> reSubmit(@RequestBody @Valid PurchaseVO vo) {
        vo.setStatus("1");
        purchaseService.updateVo(vo);

        return Result.ok();
    }


    @GetMapping("{id}")
    @Operation(summary = "信息")
    public Result<PurchaseVO> get(@PathVariable("id") Long id) {
        PurchaseEntity entity = purchaseService.getById(id);

        PurchaseVO vo = PurchaseConvert.INSTANCE.convert(entity);

        return Result.ok(vo);
    }



    @PostMapping("/attach/{id}")
    @Operation(summary = "信息")
    public Result<PurchaseVO> addAttach(@PathVariable("id") Long id,
                                        @RequestBody PurchaseVO oo) {
        PurchaseEntity entity = purchaseService.getById(id);

        PurchaseVO vo = PurchaseConvert.INSTANCE.convert(entity);

        vo.setApprovalStatus(oo.getApprovalStatus());
        purchaseService.updateVo(vo);
        return Result.ok(vo);
    }


    @GetMapping("/{id}/{status}")
    @Operation(summary = "更新状态")
    public Result<PurchaseVO> get(@PathVariable("id") Long id,
                                  @PathVariable("status") String status) {
        PurchaseEntity entity = purchaseService.getById(id);

        PurchaseVO vo = PurchaseConvert.INSTANCE.convert(entity);
        vo.setStatus(status);
        purchaseService.updateVo(vo);
        return Result.ok(vo);
    }
}
