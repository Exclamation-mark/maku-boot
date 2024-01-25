package net.maku.module.service.impl;

import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import lombok.AllArgsConstructor;
import net.maku.framework.common.utils.PageResult;
import net.maku.framework.mybatis.service.impl.BaseServiceImpl;
import net.maku.module.convert.PurchaseConvert;
import net.maku.module.dao.PurchaseDao;
import net.maku.module.entity.PurchaseEntity;
import net.maku.module.query.PurchaseQuery;
import net.maku.module.service.PurchaseService;
import net.maku.module.vo.PurchaseVO;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PurchaseServiceImpl extends BaseServiceImpl<PurchaseDao, PurchaseEntity> implements PurchaseService {
    @Override
    public PageResult<PurchaseVO> page(PurchaseQuery query) {
        IPage<PurchaseEntity> page = baseMapper.selectPage(getPage(query), getWrapper(query));

        return new PageResult<>(PurchaseConvert.INSTANCE.convertList(page.getRecords()), page.getTotal());

    }



    private LambdaQueryWrapper<PurchaseEntity> getWrapper(PurchaseQuery query){
        LambdaQueryWrapper<PurchaseEntity> wrapper = Wrappers.lambdaQuery();
        wrapper.like(StrUtil.isNotBlank(query.getName()), PurchaseEntity::getItemName, query.getName())
                .or(i -> i.like(StrUtil.isNotBlank(query.getReason()), PurchaseEntity::getPurchaseReason, query.getReason())
                        .and(ii->ii.apply("1=1")
                ));
        return wrapper;
    }
}
