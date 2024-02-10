package net.xsn.system.query;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import net.xsn.framework.common.query.Query;

/**
 * 操作日志查询
 *
 * @author zzq ziqiangytu@gmail.com
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Schema(description = "操作日志查询")
public class SysLogOperateQuery extends Query {
    @Schema(description = "用户")
    private String realName;

    @Schema(description = "模块名")
    private String module;

    @Schema(description = "请求URI")
    private String reqUri;

    @Schema(description = "操作状态")
    private Integer status;

}