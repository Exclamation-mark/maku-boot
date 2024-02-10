package net.xsn.system.service;

import net.xsn.framework.common.utils.PageResult;
import net.xsn.framework.mybatis.service.BaseService;
import net.xsn.system.entity.SysPostEntity;
import net.xsn.system.query.SysPostQuery;
import net.xsn.system.vo.SysPostVO;

import java.util.List;

/**
 * 岗位管理
 *
 * @author 阿沐 babamu@126.com
 * <a href="https://xsn.net">xsn</a>
 */
public interface SysPostService extends BaseService<SysPostEntity> {

    PageResult<SysPostVO> page(SysPostQuery query);

    List<SysPostVO> getList();

    void save(SysPostVO vo);

    void update(SysPostVO vo);

    void delete(List<Long> idList);
}