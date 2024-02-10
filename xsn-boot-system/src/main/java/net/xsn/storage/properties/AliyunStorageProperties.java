package net.xsn.storage.properties;

import lombok.Data;

/**
 * 阿里云存储配置项
 *
 * @author zzq ziqiangytu@gmail.com
 */
@Data
public class AliyunStorageProperties {
    private String endPoint;
    private String accessKeyId;
    private String accessKeySecret;
    private String bucketName;
}
