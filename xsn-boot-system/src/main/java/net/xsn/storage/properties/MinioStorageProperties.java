package net.xsn.storage.properties;

import lombok.Data;

/**
 * Minio存储配置项
 *
 * @author zzq ziqiangytu@gmail.com
 */
@Data
public class MinioStorageProperties {
    private String endPoint;
    private String accessKey;
    private String secretKey;
    private String bucketName;
}
