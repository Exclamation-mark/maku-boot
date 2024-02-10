package net.xsn.system.dao;

import net.xsn.framework.mybatis.dao.BaseDao;
import net.xsn.system.entity.SysLogLoginEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 登录日志
 *
 * @author 阿沐 babamu@126.com
 * <a href="https://xsn.net">xsn</a>
 */
@Mapper
public interface SysLogLoginDao extends BaseDao<SysLogLoginEntity> {

}