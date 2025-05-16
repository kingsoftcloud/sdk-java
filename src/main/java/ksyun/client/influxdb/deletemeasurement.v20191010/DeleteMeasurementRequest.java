package ksyun.client.influxdb.deletemeasurement.v20191010;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

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