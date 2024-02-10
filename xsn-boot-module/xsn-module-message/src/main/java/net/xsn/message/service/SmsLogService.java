package net.xsn.message.service;

import net.xsn.framework.common.utils.PageResult;
import net.xsn.framework.mybatis.service.BaseService;
import net.xsn.message.entity.SmsLogEntity;
import net.xsn.message.query.SmsLogQuery;
import net.xsn.message.vo.SmsLogVO;

/**
 * 短信日志
 *
 * @author 阿沐 babamu@126.com
 * <a href="https://xsn.net">xsn</a>
 */
public interface SmsLogService extends BaseService<SmsLogEntity> {

    PageResult<SmsLogVO> page(SmsLogQuery query);

}