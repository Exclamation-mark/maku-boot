package net.maku.module.convert;

import net.maku.module.entity.PurchaseEntity;
import net.maku.module.vo.PurchaseVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface PurchaseConvert {
    PurchaseConvert INSTANCE = Mappers.getMapper(PurchaseConvert.class);

    PurchaseVO convert(PurchaseEntity entity);

    List<PurchaseVO> convertList(List<PurchaseEntity> list);
}
