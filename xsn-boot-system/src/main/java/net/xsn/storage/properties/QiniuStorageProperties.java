package net.xsn.storage.properties;

import lombok.Data;

/**
 * 七牛云存储配置项
 *
 * @author 阿沐 babamu@126.com
 * <a href="https://xsn.net">xsn</a>
 */
@Data
public class QiniuStorageProperties {
    private String accessKey;
    private String secretKey;
    private String bucketName;
}
