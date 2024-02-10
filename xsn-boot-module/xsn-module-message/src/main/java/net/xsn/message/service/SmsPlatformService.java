package net.xsn.message.service;

import net.xsn.framework.common.utils.PageResult;
import net.xsn.framework.mybatis.service.BaseService;
import net.xsn.message.entity.SmsPlatformEntity;
import net.xsn.message.query.SmsPlatformQuery;
import net.xsn.message.sms.config.SmsConfig;
import net.xsn.message.vo.SmsPlatformVO;

import java.util.List;

/**
 * 短信平台
 *
 * @author 阿沐 babamu@126.com
 * <a href="https://xsn.net">xsn</a>
 */
public interface SmsPlatformService extends BaseService<SmsPlatformEntity> {

    PageResult<SmsPlatformVO> page(SmsPlatformQuery query);

    /**
     * 启用的短信平台列表
     */
    List<SmsConfig> listByEnable();

    void save(SmsPlatformVO vo);

    void update(SmsPlatformVO vo);

    void delete(List<Long> idList);

}