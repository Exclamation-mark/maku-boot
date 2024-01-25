package net.maku.module.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.security.PermitAll;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import net.maku.framework.common.utils.PageResult;
import net.maku.framework.common.utils.Result;
import net.maku.module.query.PurchaseQuery;
import net.maku.module.service.PurchaseService;
import net.maku.module.vo.PurchaseVO;
import org.springdoc.core.annotations.ParameterObject;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
