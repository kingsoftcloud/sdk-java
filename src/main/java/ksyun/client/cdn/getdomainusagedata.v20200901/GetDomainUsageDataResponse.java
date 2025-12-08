package ksyun.client.cdn.getdomainusagedata.v20200901;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname GetDomainUsageDataResponse
* @Description GetDomainUsageData 返回体
*/
@Data
@ToString
public class GetDomainUsageDataResponse extends BaseResponseModel {
    /***/
    @JsonProperty("StartTime")
    private String StartTime;

    /***/
    @JsonProperty("EndTime")
    private String EndTime;

    /***/
    @JsonProperty("CdnType")
    private String CdnType;

    /***/
    @JsonProperty("Domains")
    private String Domains;

    /***/
    @JsonProperty("Areas")
    private String Areas;

    /***/
    @JsonProperty("Interval")
    private Integer Interval;

    /***/
    @JsonProperty("Metric")
    private List<MetricDto> Metric;

    @Data
    @ToString
    public static class MetricDto {
        /***/
        @JsonProperty("Time")
        private String Time;

        /***/
        @JsonProperty("Value")
        private Integer Value;

    }

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("PeakTime")
    private String PeakTime;

}
