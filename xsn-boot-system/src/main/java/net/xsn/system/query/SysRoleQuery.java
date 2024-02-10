package net.xsn.system.query;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import net.xsn.framework.common.query.Query;

/**
 * 角色管理
 *
 * @author 阿沐 babamu@126.com
 * <a href="https://xsn.net">xsn</a>
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Schema(description = "角色查询")
public class SysRoleQuery extends Query {
    @Schema(description = "角色名称")
    private String name;

}
