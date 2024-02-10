package net.xsn.system.service;

import net.xsn.framework.common.utils.PageResult;
import net.xsn.framework.mybatis.service.BaseService;
import net.xsn.system.entity.SysRoleEntity;
import net.xsn.system.query.SysRoleQuery;
import net.xsn.system.vo.SysRoleDataScopeVO;
import net.xsn.system.vo.SysRoleVO;

import java.util.List;

/**
 * 角色
 * 
 * @author 阿沐 babamu@126.com
 * <a href="https://xsn.net">xsn</a>
 */
public interface SysRoleService extends BaseService<SysRoleEntity> {

	PageResult<SysRoleVO> page(SysRoleQuery query);

	List<SysRoleVO> getList(SysRoleQuery query);

	void save(SysRoleVO vo);

	void update(SysRoleVO vo);

	void dataScope(SysRoleDataScopeVO vo);

	void delete(List<Long> idList);
}
