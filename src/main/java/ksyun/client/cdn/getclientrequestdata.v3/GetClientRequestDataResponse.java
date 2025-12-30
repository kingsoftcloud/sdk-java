package ksyun.client.cdn.getclientrequestdata.v3;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname GetClientRequestDataResponse
* @Description GetClientRequestData 返回体
*/
@Data
@ToString
public class GetClientRequestDataResponse extends BaseResponseModel {

    /***/
    @JsonProperty("StartTime")
    private String StartTime;

    /***/
    @JsonProperty("EndTime")
    private String EndTime;

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
    @JsonProperty("Datas")
    private List<DatasDto> Datas;

    @Data
    @ToString
    public static class DatasDto {
        /***/
        @JsonProperty("Condition")
        private DatasConditionDto Condition;

        @Data
        @ToString
        public static class DatasConditionDto {
        }

        /***/
        @JsonProperty("Data")
        private List<DatasDataDto> Data;

        @Data
        @ToString
        public static class DatasDataDto {
            /***/
            @JsonProperty("Time")
            private String Time;

            /***/
            @JsonProperty("Flow")
            private Double Flow;

        }

    }

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
