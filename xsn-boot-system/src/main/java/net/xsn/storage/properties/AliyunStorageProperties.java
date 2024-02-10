package net.xsn.storage.properties;

import lombok.Data;

/**
 * 阿里云存储配置项
 *
 * @author 阿沐 babamu@126.com
 * <a href="https://xsn.net">xsn</a>
 */
@Data
public class AliyunStorageProperties {
    private String endPoint;
    private String accessKeyId;
    private String accessKeySecret;
    private String bucketName;
}
