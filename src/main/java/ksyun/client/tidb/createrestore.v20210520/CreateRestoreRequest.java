package ksyun.client.tidb.createrestore.v20210520;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname CreateRestoreRequest
 * @Description 请求参数
 */
@Data
public class CreateRestoreRequest {
    /**
     * 实例id
     */
    @KsYunField(name = "InstanceId")
    private String InstanceId;

    /**
     * 恢复关联的备份记录ID
     */
    @KsYunField(name = "BackupId")
    private String BackupId;

}