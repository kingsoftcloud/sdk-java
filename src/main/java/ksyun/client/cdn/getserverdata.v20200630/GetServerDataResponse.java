package ksyun.client.cdn.getserverdata.v20200630;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname GetServerDataResponse
* @Description GetServerData 返回体
*/
@Data
@ToString
public class GetServerDataResponse extends BaseResponseModel {

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
    @JsonProperty("DataType")
    private String DataType;

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
    @JsonProperty("Regions")
    private String Regions;

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
            /***/
            @JsonProperty("DataType")
            private String DataType;

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
