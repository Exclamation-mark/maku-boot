package net.xsn.message.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import lombok.AllArgsConstructor;
import net.xsn.framework.common.utils.PageResult;
import net.xsn.framework.mybatis.service.impl.BaseServiceImpl;
import net.xsn.message.convert.SmsLogConvert;
import net.xsn.message.dao.SmsLogDao;
import net.xsn.message.entity.SmsLogEntity;
import net.xsn.message.query.SmsLogQuery;
import net.xsn.message.service.SmsLogService;
import net.xsn.message.vo.SmsLogVO;
import org.springframework.stereotype.Service;

/**
 * 短信日志
 *
 * @author 阿沐 babamu@126.com
 * <a href="https://xsn.net">xsn</a>
 */
@Service
@AllArgsConstructor
public class SmsLogServiceImpl extends BaseServiceImpl<SmsLogDao, SmsLogEntity> implements SmsLogService {

    @Override
    public PageResult<SmsLogVO> page(SmsLogQuery query) {
        IPage<SmsLogEntity> page = baseMapper.selectPage(getPage(query), getWrapper(query));

        return new PageResult<>(SmsLogConvert.INSTANCE.convertList(page.getRecords()), page.getTotal());
    }

    private LambdaQueryWrapper<SmsLogEntity> getWrapper(SmsLogQuery query){
        LambdaQueryWrapper<SmsLogEntity> wrapper = Wrappers.lambdaQuery();
        wrapper.eq(query.getPlatform() != null, SmsLogEntity::getPlatform, query.getPlatform());
        wrapper.like(query.getPlatformId() != null, SmsLogEntity::getPlatformId, query.getPlatformId());
        wrapper.orderByDesc(SmsLogEntity::getId);
        return wrapper;
    }

}