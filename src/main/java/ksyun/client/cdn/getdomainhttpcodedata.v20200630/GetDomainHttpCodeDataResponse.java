package ksyun.client.cdn.getdomainhttpcodedata.v20200630;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname GetDomainHttpCodeDataResponse
* @Description GetDomainHttpCodeData 返回体
*/
@Data
@ToString
public class GetDomainHttpCodeDataResponse extends BaseResponseModel {
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
        private ConditionDto Condition;

        @Data
        @ToString
        public static class ConditionDto {
            /***/
            @JsonProperty("Domains")
            private String Domains;

        }

        /***/
        @JsonProperty("httpcodeData")
        private List<HttpcodeDataDto> HttpcodeData;

        @Data
        @ToString
        public static class HttpcodeDataDto {
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
