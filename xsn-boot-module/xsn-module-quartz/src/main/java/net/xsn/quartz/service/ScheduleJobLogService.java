package net.xsn.quartz.service;

import net.xsn.framework.common.utils.PageResult;
import net.xsn.framework.mybatis.service.BaseService;
import net.xsn.quartz.entity.ScheduleJobLogEntity;
import net.xsn.quartz.query.ScheduleJobLogQuery;
import net.xsn.quartz.vo.ScheduleJobLogVO;

/**
 * 定时任务日志
 *
 * @author zzq ziqiangytu@gmail.com
 */
public interface ScheduleJobLogService extends BaseService<ScheduleJobLogEntity> {

    PageResult<ScheduleJobLogVO> page(ScheduleJobLogQuery query);

}