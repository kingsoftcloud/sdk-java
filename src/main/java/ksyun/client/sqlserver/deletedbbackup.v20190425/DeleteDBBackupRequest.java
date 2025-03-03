package ksyun.client.sqlserver.deletedbbackup.v20190425;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DeleteDBBackupRequest
 * @Description 请求参数
 */
@Data
public class DeleteDBBackupRequest {
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