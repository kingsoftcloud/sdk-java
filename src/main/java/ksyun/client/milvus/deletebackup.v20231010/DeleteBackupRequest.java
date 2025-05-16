package ksyun.client.milvus.deletebackup.v20231010;

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
     * 实例id
     */
    @KsYunField(name = "InstanceId")
    private String InstanceId;

    /**
     * 需要删除的备份id列表
     * <p>
     * ```json
     * 需要指定多个备份id，也用英文','间隔传入
     * ```
     */
    @KsYunField(name = "BackupIds")
    private String BackupIds;

}