package net.xsn.system.query;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import net.xsn.framework.common.query.Query;

/**
 * 参数管理查询
 *
 * @author 阿沐 babamu@126.com
 * <a href="https://xsn.net">xsn</a>
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Schema(description = "参数管理查询")
public class SysParamsQuery extends Query {
    @Schema(description = "系统参数")
    private Integer paramType;

    @Schema(description = "参数键")
    private String paramKey;

    @Schema(description = "参数值")
    private String paramValue;

}