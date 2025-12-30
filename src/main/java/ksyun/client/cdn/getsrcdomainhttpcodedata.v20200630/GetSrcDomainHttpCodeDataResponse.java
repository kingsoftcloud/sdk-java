package ksyun.client.cdn.getsrcdomainhttpcodedata.v20200630;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname GetSrcDomainHttpCodeDataResponse
* @Description GetSrcDomainHttpCodeData 返回体
*/
@Data
@ToString
public class GetSrcDomainHttpCodeDataResponse extends BaseResponseModel {

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
            @JsonProperty("Domains")
            private String Domains;

        }

        /***/
        @JsonProperty("httpcodeData")
        private List<DatasHttpcodeDataDto> HttpcodeData;

        @Data
        @ToString
        public static class DatasHttpcodeDataDto {
            /***/
            @JsonProperty("CodeType")
            private String CodeType;

            /***/
            @JsonProperty("PV")
            private Integer PV;

            /***/
            @JsonProperty("Proportion")
            private Double Proportion;

        }

    }

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
