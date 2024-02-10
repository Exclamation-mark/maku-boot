package net.xsn.message.dao;

import net.xsn.framework.mybatis.dao.BaseDao;
import net.xsn.message.entity.SmsLogEntity;
import org.apache.ibatis.annotations.Mapper;

/**
* 短信日志
*
* @author 阿沐 babamu@126.com
*/
@Mapper
public interface SmsLogDao extends BaseDao<SmsLogEntity> {
	
}