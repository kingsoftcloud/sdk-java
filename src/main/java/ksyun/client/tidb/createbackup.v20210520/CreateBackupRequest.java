package ksyun.client.tidb.createbackup.v20210520;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname CreateBackupRequest
 * @Description 请求参数
 */
@Data
public class CreateBackupRequest {
    /**
     * 实例ID。
     */
    @KsYunField(name = "InstanceId")
    private String InstanceId;

    /**
     * 备份名称。
     */
    @KsYunField(name = "BackupName")
    private String BackupName;

}