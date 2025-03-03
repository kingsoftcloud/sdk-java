package ksyun.client.postgresql.deletedbbackup.v20181225;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DeleteDBBackupRequest
 * @Description 请求参数
 */
@Data
public class DeleteDBBackupRequest {
    /**
     * 备份ID
     */
    @KsYunField(name = "DBBackupIdentifier")
    private String DBBackupIdentifier;

}