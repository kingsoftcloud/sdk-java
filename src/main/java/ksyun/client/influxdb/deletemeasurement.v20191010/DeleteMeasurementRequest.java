package ksyun.client.influxdb.deletemeasurement.v20191010;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DeleteMeasurementRequest
 * @Description 请求参数
 */
@Data
public class DeleteMeasurementRequest {
    /***/
    @KsYunField(name = "InstanceId")
    private String InstanceId;

    /***/
    @KsYunField(name = "DatabaseName")
    private String DatabaseName;

    /***/
    @KsYunField(name = "MeasurementName")
    private String MeasurementName;

}