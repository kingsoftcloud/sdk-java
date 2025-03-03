package ksyun.client.postgresql.overridedbinstance.v20181225;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname OverrideDBInstanceRequest
 * @Description 请求参数
 */
@Data
public class OverrideDBInstanceRequest {
    /**
     * 实例ID
     */
    @KsYunField(name = "DBInstanceIdentifier")
    private String DBInstanceIdentifier;

    /**
     * 备份ID
     */
    @KsYunField(name = "DBBackupIdentifier")
    private String DBBackupIdentifier;


}