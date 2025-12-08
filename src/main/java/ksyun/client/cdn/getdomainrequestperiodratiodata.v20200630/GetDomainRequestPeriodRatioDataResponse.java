package ksyun.client.cdn.getdomainrequestperiodratiodata.v20200630;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname GetDomainRequestPeriodRatioDataResponse
* @Description GetDomainRequestPeriodRatioData 返回体
*/
@Data
@ToString
public class GetDomainRequestPeriodRatioDataResponse extends BaseResponseModel {
    /***/
    @JsonProperty("CurrentPeriodStartTime")
    private String CurrentPeriodStartTime;

    /***/
    @JsonProperty("CurrentPeriodEndTime")
    private String CurrentPeriodEndTime;

    /***/
    @JsonProperty("PriorPeriodStartTime")
    private String PriorPeriodStartTime;

    /***/
    @JsonProperty("PriorPeriodEndTime")
    private String PriorPeriodEndTime;

    /***/
    @JsonProperty("Metric")
    private String Metric;

    /***/
    @JsonProperty("Interval")
    private Integer Interval;

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
    @JsonProperty("Provinces")
    private String Provinces;

    /***/
    @JsonProperty("Isps")
    private String Isps;

    /***/
    @JsonProperty("IpType")
    private String IpType;

    /***/
    @JsonProperty("Schema")
    private String Schema;

    /***/
    @JsonProperty("ResultType")
    private String ResultType;

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Datas")
    private List<DatasDto> Datas;

    @Data
    @ToString
    public static class DatasDto {
        /***/
        @JsonProperty("Condition")
        private DatasDtoConditionDto Condition;

        @Data
        @ToString
        public static class DatasDtoConditionDto {
        }

        /***/
        @JsonProperty("Data")
        private List<DatasDtoDataDto> Data;

        @Data
        @ToString
        public static class DatasDtoDataDto {
            /***/
            @JsonProperty("CurrentPeriodTime")
            private String CurrentPeriodTime;

            /***/
            @JsonProperty("PriorPeriodTime")
            private String PriorPeriodTime;

            /***/
            @JsonProperty("CurrentPeriodValue")
            private Integer CurrentPeriodValue;

            /***/
            @JsonProperty("PriorPeriodValue")
            private Integer PriorPeriodValue;

            /***/
            @JsonProperty("PeriodRatio")
            private Double PeriodRatio;

        }

    }

}
