package ksyun.client.cdn.getdomainpiddimensionusagedata.v20160901;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname GetDomainPidDimensionUsageDataResponse
* @Description GetDomainPidDimensionUsageData 返回体
*/
@Data
@ToString
public class GetDomainPidDimensionUsageDataResponse extends BaseResponseModel {

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

        /***/
        @JsonProperty("projects")
        private List<MetricProjectsDto> Projects;

        @Data
        @ToString
        public static class MetricProjectsDto {
            /***/
            @JsonProperty("project")
            private String Project;

            /***/
            @JsonProperty("Value")
            private Integer Value;

        }

    }

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("PeakTime")
    private String PeakTime;

}
