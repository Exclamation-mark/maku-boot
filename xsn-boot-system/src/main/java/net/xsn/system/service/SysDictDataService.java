package net.xsn.system.service;

import net.xsn.framework.common.utils.PageResult;
import net.xsn.framework.mybatis.service.BaseService;
import net.xsn.system.entity.SysDictDataEntity;
import net.xsn.system.query.SysDictDataQuery;
import net.xsn.system.vo.SysDictDataVO;

import java.util.List;

/**
 * 数据字典
 *
 * @author zzq ziqiangytu@gmail.com
 */
public interface SysDictDataService extends BaseService<SysDictDataEntity> {

    PageResult<SysDictDataVO> page(SysDictDataQuery query);

    void save(SysDictDataVO vo);

    void update(SysDictDataVO vo);

    void delete(List<Long> idList);

}