package net.xsn.system.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import net.xsn.framework.mybatis.entity.BaseEntity;

/**
 * 角色数据权限
 *
 * @author zzq ziqiangytu@gmail.com
 */
@Data
@EqualsAndHashCode(callSuper=false)
@TableName("sys_role_data_scope")
public class SysRoleDataScopeEntity extends BaseEntity {
	/**
	 * 角色ID
	 */
	private Long roleId;
	/**
	 * 机构ID
	 */
	private Long orgId;

}