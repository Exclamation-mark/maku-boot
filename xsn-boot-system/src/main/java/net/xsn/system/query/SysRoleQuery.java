package net.xsn.system.query;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import net.xsn.framework.common.query.Query;

/**
 * 角色管理
 *
 * @author zzq ziqiangytu@gmail.com
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Schema(description = "角色查询")
public class SysRoleQuery extends Query {
    @Schema(description = "角色名称")
    private String name;

}
