package net.maku.module.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fhs.core.trans.vo.TransPojo;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import net.maku.framework.common.utils.DateUtils;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 采购信息
 *
 * @author 阿沐 babamu@126.com
 * <a href="https://maku.net">MAKU</a>
 */
@Data
@Schema(description = "采购信息")
public class PurchaseVO implements Serializable, TransPojo {
    private static final long serialVersionUID = 1L;

    @Schema(description = "采购单ID")
    private Long id;

    @Schema(description = "版本号")
    private Integer version;

    @Schema(description = "删除标志")
    private Integer deleted;

    @Schema(description = "创建者ID")
    private Long creator;

    @Schema(description = "创建时间")
    @JsonFormat(pattern = DateUtils.DATE_TIME_PATTERN)
    private Date createTime;

    @Schema(description = "更新者ID")
    private Long updater;

    @Schema(description = "更新时间")
    @JsonFormat(pattern = DateUtils.DATE_TIME_PATTERN)
    private Date updateTime;

    @Schema(description = "采购物品名称")
    private String itemName;

    @Schema(description = "数量")
    private Integer quantity;

    @Schema(description = "单价")
    private BigDecimal unitPrice;

    @Schema(description = "总价")
    private BigDecimal totalPrice;

    @Schema(description = "备注")
    private String note;

    @Schema(description = "厂家")
    private String manufacturer;

    @Schema(description = "采购理由")
    private String purchaseReason;

    @Schema(description = "类目")
    private String category;

    @Schema(description = "采购状态")
    private String status;

    @Schema(description = "审批状态")
    private String approvalStatus;

    @Schema(description = "审批备注")
    private String approvalComment;
}
