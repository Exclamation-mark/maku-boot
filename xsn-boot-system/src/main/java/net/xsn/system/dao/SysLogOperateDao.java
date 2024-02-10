package net.xsn.system.dao;

import net.xsn.framework.mybatis.dao.BaseDao;
import net.xsn.system.entity.SysLogOperateEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 操作日志
 *
 * @author zzq ziqiangytu@gmail.com
 */
@Mapper
public interface SysLogOperateDao extends BaseDao<SysLogOperateEntity> {

}