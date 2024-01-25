package net.maku.module.query;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import net.maku.framework.common.query.Query;

/**
 * 资产 查询
 *
 * @author 阿沐 babamu@126.com
 * <a href="https://maku.net">MAKU</a>
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Schema(description = "附件管理查询")
public class PurchaseQuery extends Query {

    @Schema(description = "资产 名称")
    private String name;

    @Schema(description = "申请理由")
    private String reason;

}