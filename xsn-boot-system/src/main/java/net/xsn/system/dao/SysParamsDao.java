package net.xsn.system.dao;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import net.xsn.framework.mybatis.dao.BaseDao;
import net.xsn.system.entity.SysParamsEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 参数管理
 *
 * @author 阿沐 babamu@126.com
 * <a href="https://xsn.net">xsn</a>
 */
@Mapper
public interface SysParamsDao extends BaseDao<SysParamsEntity> {

    default boolean isExist(String paramKey) {
        return this.exists(new QueryWrapper<SysParamsEntity>().eq("param_key", paramKey));
    }

    default SysParamsEntity get(String paramKey) {
        return this.selectOne(new QueryWrapper<SysParamsEntity>().eq("param_key", paramKey));
    }
}