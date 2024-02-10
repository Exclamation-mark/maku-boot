package net.xsn.system.service;

import net.xsn.framework.common.utils.PageResult;
import net.xsn.framework.mybatis.service.BaseService;
import net.xsn.system.entity.SysDictTypeEntity;
import net.xsn.system.query.SysDictTypeQuery;
import net.xsn.system.vo.SysDictTypeVO;
import net.xsn.system.vo.SysDictVO;

import java.util.List;

/**
 * 数据字典
 *
 * @author 阿沐 babamu@126.com
 * <a href="https://xsn.net">xsn</a>
 */
public interface SysDictTypeService extends BaseService<SysDictTypeEntity> {

    PageResult<SysDictTypeVO> page(SysDictTypeQuery query);

    void save(SysDictTypeVO vo);

    void update(SysDictTypeVO vo);

    void delete(List<Long> idList);

    /**
     * 获取动态SQL数据
     */
    List<SysDictVO.DictData> getDictSql(Long id);

    /**
     * 获取全部字典列表
     */
    List<SysDictVO> getDictList();

    /**
     * 刷新字典缓存
     */
    void refreshTransCache();

}