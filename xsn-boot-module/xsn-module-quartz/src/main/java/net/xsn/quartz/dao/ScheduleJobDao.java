package net.xsn.quartz.dao;

import net.xsn.framework.mybatis.dao.BaseDao;
import net.xsn.quartz.entity.ScheduleJobEntity;
import org.apache.ibatis.annotations.Mapper;

/**
* 定时任务
*
* @author 阿沐 babamu@126.com
*/
@Mapper
public interface ScheduleJobDao extends BaseDao<ScheduleJobEntity> {
	
}