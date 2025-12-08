package ksyun.client.cdn.getuvdata.v20200630;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname GetUvDataResponse
* @Description GetUvData 返回体
*/
@Data
@ToString
public class GetUvDataResponse extends BaseResponseModel {
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
    @JsonProperty("Interval")
    private Integer Interval;

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
        @JsonProperty("Time")
        private String Time;

        /***/
        @JsonProperty("Uv")
        private Integer Uv;

        /***/
        @JsonProperty("Domains")
        private List<DatasDtoDomainsDto> Domains;

        @Data
        @ToString
        public static class DatasDtoDomainsDto {
            /***/
            @JsonProperty("Domain")
            private String Domain;

            /***/
            @JsonProperty("Uv")
            private Integer Uv;

        }

    }

}
