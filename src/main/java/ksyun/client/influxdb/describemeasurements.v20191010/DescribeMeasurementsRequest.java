package ksyun.client.influxdb.describemeasurements.v20191010;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribeMeasurementsRequest
 * @Description 请求参数
 */
@Data
public class DescribeMeasurementsRequest {
    /***/
    @KsYunField(name = "InstanceId")
    private String InstanceId;

    /***/
    @KsYunField(name = "DatabaseName")
    private String DatabaseName;

}