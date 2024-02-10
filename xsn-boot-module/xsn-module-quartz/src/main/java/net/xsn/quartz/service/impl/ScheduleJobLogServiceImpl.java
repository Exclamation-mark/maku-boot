package net.xsn.quartz.service.impl;

import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import lombok.AllArgsConstructor;
import net.xsn.framework.common.utils.PageResult;
import net.xsn.framework.mybatis.service.impl.BaseServiceImpl;
import net.xsn.quartz.convert.ScheduleJobLogConvert;
import net.xsn.quartz.dao.ScheduleJobLogDao;
import net.xsn.quartz.entity.ScheduleJobLogEntity;
import net.xsn.quartz.query.ScheduleJobLogQuery;
import net.xsn.quartz.service.ScheduleJobLogService;
import net.xsn.quartz.vo.ScheduleJobLogVO;
import org.springframework.stereotype.Service;

/**
 * 定时任务日志
 *
 * @author 阿沐 babamu@126.com
 * <a href="https://xsn.net">xsn</a>
 */
@Service
@AllArgsConstructor
public class ScheduleJobLogServiceImpl extends BaseServiceImpl<ScheduleJobLogDao, ScheduleJobLogEntity> implements ScheduleJobLogService {

    @Override
    public PageResult<ScheduleJobLogVO> page(ScheduleJobLogQuery query) {
        IPage<ScheduleJobLogEntity> page = baseMapper.selectPage(getPage(query), getWrapper(query));

        return new PageResult<>(ScheduleJobLogConvert.INSTANCE.convertList(page.getRecords()), page.getTotal());
    }

    private LambdaQueryWrapper<ScheduleJobLogEntity> getWrapper(ScheduleJobLogQuery query){
        LambdaQueryWrapper<ScheduleJobLogEntity> wrapper = Wrappers.lambdaQuery();
        wrapper.like(StrUtil.isNotBlank(query.getJobName()), ScheduleJobLogEntity::getJobName, query.getJobName());
        wrapper.like(StrUtil.isNotBlank(query.getJobGroup()), ScheduleJobLogEntity::getJobGroup, query.getJobGroup());
        wrapper.eq(query.getJobId() != null, ScheduleJobLogEntity::getJobId, query.getJobId());
        wrapper.orderByDesc(ScheduleJobLogEntity::getId);
        return wrapper;
    }

}