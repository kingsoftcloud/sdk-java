package ksyun.client.postgresql.releasedbinstanceeip.v20181225;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ReleaseDBInstanceEipRequest
 * @Description 请求参数
 */
@Data
public class ReleaseDBInstanceEipRequest {
    /**
     * 实例ID
     */
    @KsYunField(name = "DBInstanceIdentifier")
    private String DBInstanceIdentifier;


}