package ksyun.client.postgresql.rebootdbinstance.v20181225;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname RebootDBInstanceRequest
 * @Description 请求参数
 */
@Data
public class RebootDBInstanceRequest {
    /**
     * 实例ID
     */
    @KsYunField(name = "DBInstanceIdentifier")
    private String DBInstanceIdentifier;

}