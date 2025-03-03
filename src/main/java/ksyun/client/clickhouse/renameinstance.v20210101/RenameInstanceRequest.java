package ksyun.client.clickhouse.renameinstance.v20210101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname RenameInstanceRequest
 * @Description 请求参数
 */
@Data
public class RenameInstanceRequest {
    /**
     * 实例ID。
     */
    @KsYunField(name = "InstanceId")
    private String InstanceId;

    /**
     * 实例新名称。
     */
    @KsYunField(name = "InstanceName")
    private String InstanceName;

}