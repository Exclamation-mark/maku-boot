package net.maku.module.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import net.maku.framework.mybatis.entity.BaseEntity;

import java.math.BigDecimal;

/**
 * 采购管理
 *
 * @author 阿沐 babamu@126.com
 * <a href="https://maku.net">MAKU</a>
 */
@Data
@EqualsAndHashCode(callSuper=false)
@TableName("purchase")
public class PurchaseEntity extends BaseEntity {

    /**
     * 采购物品名称
     */
    private String itemName;

    /**
     * 数量
     */
    private Integer quantity;

    /**
     * 单价
     */
    private BigDecimal unitPrice;

    /**
     * 总价
     */
    private BigDecimal totalPrice;

    /**
     * 备注
     */
    private String note;

    /**
     * 厂家
     */
    private String manufacturer;
    /**
     * 采购理由
     */
    private String purchaseReason;

    /**
     * 类目
     */
    private String category;

    /**
     * 采购状态
     * 待处理（Pending）： 表示采购单已创建但尚未处理。
     * 待审批（Pending Approval）： 表示采购单已提交，等待审批。
     * 已审批（Approved）： 表示采购单已经通过审批。
     * 拒绝（Rejected）： 表示采购单未通过审批。
     * 进行中（In Progress）： 表示采购流程正在进行中。
     * 已完成（Completed）： 表示采购已完成。
     * 取消（Canceled）： 表示采购单被取消。
     * 异常（Exception）： 表示采购过程中出现了异常情况。
     */
    private String status;

    /**
     * 审批状态
     */
    private String approvalStatus;

    /**
     * 审批备注
     */
    private String approvalComment;
}
