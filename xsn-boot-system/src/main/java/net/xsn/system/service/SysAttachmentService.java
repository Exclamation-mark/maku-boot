package net.xsn.system.service;

import net.xsn.framework.common.utils.PageResult;
import net.xsn.framework.mybatis.service.BaseService;
import net.xsn.system.entity.SysAttachmentEntity;
import net.xsn.system.query.SysAttachmentQuery;
import net.xsn.system.vo.SysAttachmentVO;

import java.util.List;

/**
 * 附件管理
 *
 * @author zzq ziqiangytu@gmail.com
 */
public interface SysAttachmentService extends BaseService<SysAttachmentEntity> {

    PageResult<SysAttachmentVO> page(SysAttachmentQuery query);

    void save(SysAttachmentVO vo);

    void update(SysAttachmentVO vo);

    void delete(List<Long> idList);
}