package ksyun.client.tidb.deletebackup.v20210520;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname DeleteBackupRequest
 * @Description 请求参数
 */
@Data
public class DeleteBackupRequest {
    /**
     * 实例ID。
     */
    @KsYunField(name = "InstanceId")
    private String InstanceId;

    /**
     * 备份ID列表。多个备份ID请用英文逗号隔开。
     */
    @KsYunField(name = "BackupIds")
    private String BackupIds;

}