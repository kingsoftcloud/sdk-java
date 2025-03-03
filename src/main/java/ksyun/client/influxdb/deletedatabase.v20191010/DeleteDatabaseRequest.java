package ksyun.client.influxdb.deletedatabase.v20191010;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DeleteDatabaseRequest
 * @Description 请求参数
 */
@Data
public class DeleteDatabaseRequest {
    /***/
    @KsYunField(name = "InstanceId")
    private String InstanceId;

    /***/
    @KsYunField(name = "DatabaseName")
    private String DatabaseName;

}