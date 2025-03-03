package ksyun.client.influxdb.createdatabase.v20191010;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname CreateDatabaseRequest
 * @Description 请求参数
 */
@Data
public class CreateDatabaseRequest {
    /***/
    @KsYunField(name = "InstanceId")
    private String InstanceId;

    /***/
    @KsYunField(name = "DatabaseName")
    private String DatabaseName;

}