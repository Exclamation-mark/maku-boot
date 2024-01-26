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
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PurchaseServiceImpl extends BaseServiceImpl<PurchaseDao, PurchaseEntity> implements PurchaseService {
    @Override
    public PageResult<PurchaseVO> page(PurchaseQuery query) {
        IPage<PurchaseEntity> page = baseMapper.selectPage(getPage(query), getWrapper(query));

        return new PageResult<>(PurchaseConvert.INSTANCE.convertList(page.getRecords()), page.getTotal());

    }

    @Override
    public void saveVO(PurchaseVO vo) {
        PurchaseEntity entity = PurchaseConvert.INSTANCE.convert(vo);
        if (StringUtils.isEmpty(entity.getStatus())){
            entity.setStatus("1");
        }
        baseMapper.insert(entity);
    }

    @Override
    public void updateVo(PurchaseVO vo) {
        PurchaseEntity entity = PurchaseConvert.INSTANCE.convert(vo);
        if (StringUtils.isEmpty(entity.getStatus())){
            entity.setStatus("1");
        }
        baseMapper.updateById(entity);
    }


    private LambdaQueryWrapper<PurchaseEntity> getWrapper(PurchaseQuery query){
        LambdaQueryWrapper<PurchaseEntity> wrapper = Wrappers.lambdaQuery();
        if (StrUtil.isNotBlank(query.getReason())) {
            wrapper.or(i -> i.like(StrUtil.isNotBlank(query.getReason()), PurchaseEntity::getPurchaseReason, query.getReason()));
        }
        if (StrUtil.isNotBlank(query.getName())) {
            wrapper.like(StrUtil.isNotBlank(query.getName()), PurchaseEntity::getItemName, query.getName());
        }

        if (query.getStatus() != null && !query.getStatus().isEmpty()) {
            wrapper.in(PurchaseEntity::getStatus, query.getStatus());
        }
        return wrapper;
    }
}
