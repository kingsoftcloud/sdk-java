package ksyun.client.tidb.createbackup.v20210520;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

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