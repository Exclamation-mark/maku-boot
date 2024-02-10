package net.xsn.system.convert;

import net.xsn.system.entity.SysUserTokenEntity;
import net.xsn.system.vo.SysUserTokenVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * 用户Token
 *
 * @author 阿沐 babamu@126.com
 */
@Mapper
public interface SysUserTokenConvert {
    SysUserTokenConvert INSTANCE = Mappers.getMapper(SysUserTokenConvert.class);

    SysUserTokenEntity convert(SysUserTokenVO vo);

    SysUserTokenVO convert(SysUserTokenEntity entity);

}