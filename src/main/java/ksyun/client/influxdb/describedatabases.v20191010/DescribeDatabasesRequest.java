package ksyun.client.influxdb.describedatabases.v20191010;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribeDatabasesRequest
 * @Description 请求参数
 */
@Data
public class DescribeDatabasesRequest {
    /***/
    @KsYunField(name = "InstanceId")
    private String InstanceId;

    /***/
    @KsYunField(name = "Offset")
    private Integer Offset;

    /***/
    @KsYunField(name = "Limit")
    private Integer Limit;

}