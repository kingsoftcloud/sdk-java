package ksyun.client.cdn.getrealtimehitratedata.v20200630;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname GetRealTimeHitRateDataResponse
* @Description GetRealTimeHitRateData 返回体
*/
@Data
@ToString
public class GetRealTimeHitRateDataResponse extends BaseResponseModel {
    /***/
    @JsonProperty("StartTime")
    private String StartTime;

    /***/
    @JsonProperty("EndTime")
    private String EndTime;

    /***/
    @JsonProperty("HitRatetype")
    private String HitRatetype;

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
        private ConditionDto Condition;

        @Data
        @ToString
        public static class ConditionDto {
        }

        /***/
        @JsonProperty("DetailData")
        private DetailDataDto DetailData;

        @Data
        @ToString
        public static class DetailDataDto {
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
