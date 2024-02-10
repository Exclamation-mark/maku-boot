package net.xsn.system.service;

import net.xsn.framework.common.utils.PageResult;
import net.xsn.framework.mybatis.service.BaseService;
import net.xsn.system.entity.SysLogOperateEntity;
import net.xsn.system.query.SysLogOperateQuery;
import net.xsn.system.vo.SysLogOperateVO;

/**
 * 操作日志
 *
 * @author 阿沐 babamu@126.com
 * <a href="https://xsn.net">xsn</a>
 */
public interface SysLogOperateService extends BaseService<SysLogOperateEntity> {

    PageResult<SysLogOperateVO> page(SysLogOperateQuery query);
}