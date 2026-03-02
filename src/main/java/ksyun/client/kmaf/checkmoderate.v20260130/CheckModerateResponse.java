package ksyun.client.kmaf.checkmoderate.v20260130;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CheckModerateResponse
* @Description CheckModerate 返回体
*/
@Data
@ToString
public class CheckModerateResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /***/
        @JsonProperty("Decision")
        private DataDecisionDto Decision;

        @Data
        @ToString
        public static class DataDecisionDto {
            /***/
            @JsonProperty("Action")
            private String Action;

            /***/
            @JsonProperty("Score")
            private Integer Score;

        }

        /***/
        @JsonProperty("RiskInfo")
        private DataRiskInfoDto RiskInfo;

        @Data
        @ToString
        public static class DataRiskInfoDto {
            /***/
            @JsonProperty("Risks")
            private List<DataRiskInfoRisksDto> Risks;

            @Data
            @ToString
            public static class DataRiskInfoRisksDto {
                /***/
                @JsonProperty("Category")
                private String Category;

                /***/
                @JsonProperty("Label")
                private String Label;

                /***/
                @JsonProperty("Score")
                private Integer Score;

                /***/
                @JsonProperty("Matches")
                private List<DataRiskInfoRisksMatchesDto> Matches;

                @Data
                @ToString
                public static class DataRiskInfoRisksMatchesDto {
                    /***/
                    @JsonProperty("Word")
                    private String Word;

                }

            }

        }

        /***/
        @JsonProperty("MsgId")
        private String MsgId;

    }

}
