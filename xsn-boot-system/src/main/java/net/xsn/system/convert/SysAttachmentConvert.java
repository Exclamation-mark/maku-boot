package net.xsn.system.convert;

import net.xsn.system.entity.SysAttachmentEntity;
import net.xsn.system.vo.SysAttachmentVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * 附件管理
 *
 * @author zzq ziqiangytu@gmail.com
 */
@Mapper
public interface SysAttachmentConvert {
    SysAttachmentConvert INSTANCE = Mappers.getMapper(SysAttachmentConvert.class);

    SysAttachmentEntity convert(SysAttachmentVO vo);

    SysAttachmentVO convert(SysAttachmentEntity entity);

    List<SysAttachmentVO> convertList(List<SysAttachmentEntity> list);

}