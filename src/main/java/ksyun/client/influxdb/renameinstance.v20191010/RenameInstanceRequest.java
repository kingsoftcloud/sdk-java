package ksyun.client.influxdb.renameinstance.v20191010;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname RenameInstanceRequest
 * @Description 请求参数
 */
@Data
public class RenameInstanceRequest {
    /***/
    @KsYunField(name = "InstanceId")
    private String InstanceId;

    /***/
    @KsYunField(name = "InstanceName")
    private String InstanceName;

}