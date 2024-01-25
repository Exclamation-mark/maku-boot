package net.maku.module.service;

import net.maku.framework.common.utils.PageResult;
import net.maku.framework.mybatis.service.BaseService;
import net.maku.module.entity.PurchaseEntity;
import net.maku.module.query.PurchaseQuery;
import net.maku.module.vo.PurchaseVO;

public interface PurchaseService extends BaseService<PurchaseEntity> {



    PageResult<PurchaseVO> page(PurchaseQuery query);

    void saveVO(PurchaseVO vo);

    void updateVo(PurchaseVO vo);
}
