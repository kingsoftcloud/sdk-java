package ksyun.client.cdn.getflowhitratedata.v20200630;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname GetFlowHitRateDataResponse
* @Description GetFlowHitRateData 返回体
*/
@Data
@ToString
public class GetFlowHitRateDataResponse extends BaseResponseModel {
    /***/
    @JsonProperty("StartTime")
    private String StartTime;

    /***/
    @JsonProperty("EndTime")
    private String EndTime;

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
        @JsonProperty("DetailData")
        private List<DatasDtoDetailDataDto> DetailData;

        @Data
        @ToString
        public static class DatasDtoDetailDataDto {
            /***/
            @JsonProperty("Time")
            private String Time;

            /***/
            @JsonProperty("HitFlow")
            private Integer HitFlow;

            /***/
            @JsonProperty("MissFlow")
            private Integer MissFlow;

            /***/
            @JsonProperty("MissFlowProportion")
            private Double MissFlowProportion;

            /***/
            @JsonProperty("HitFlowProportion")
            private Double HitFlowProportion;

        }

    }

}
