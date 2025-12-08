package ksyun.client.influxdb.deletemeasurement.v20191010;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeleteMeasurementResponse
* @Description DeleteMeasurement 返回体
*/
@Data
@ToString
public class DeleteMeasurementResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
