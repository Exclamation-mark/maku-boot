package net.maku.module.dao;

import net.maku.framework.mybatis.dao.BaseDao;
import net.maku.module.entity.PurchaseEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PurchaseDao extends BaseDao<PurchaseEntity> {
}
