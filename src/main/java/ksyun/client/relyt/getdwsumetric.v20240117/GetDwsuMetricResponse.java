package ksyun.client.relyt.getdwsumetric.v20240117;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname GetDwsuMetricResponse
* @Description GetDwsuMetric 返回体
*/
@Data
@ToString
public class GetDwsuMetricResponse extends BaseResponseModel {

    /**监控指标数组*/
    @JsonProperty("Data")
    private List<DataDto> Data;

    @Data
    @ToString
    public static class DataDto {
        /**监控指标名称*/
        @JsonProperty("Name")
        private String Name;

        /**若为DPS监控指标，则该值为DPS ID，若为DWSU监控指标，则该值为DWSU ID*/
        @JsonProperty("ResourceId")
        private String ResourceId;

        /**监控指标数值*/
        @JsonProperty("Value")
        private String Value;

    }

}
