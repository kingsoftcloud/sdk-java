package ksyun.client.cdn.getareaispdata.v20200630;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname GetAreaIspDataResponse
* @Description GetAreaIspData 返回体
*/
@Data
@ToString
public class GetAreaIspDataResponse extends BaseResponseModel {

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
    @JsonProperty("Datas")
    private List<DatasDto> Datas;

    @Data
    @ToString
    public static class DatasDto {
        /***/
        @JsonProperty("Area")
        private String Area;

        /***/
        @JsonProperty("Flow")
        private Integer Flow;

        /***/
        @JsonProperty("Pv")
        private Integer Pv;

        /***/
        @JsonProperty("FlowProportion")
        private Double FlowProportion;

        /***/
        @JsonProperty("PvProportion")
        private Double PvProportion;

        /***/
        @JsonProperty("Isps")
        private List<DatasIspsDto> Isps;

        @Data
        @ToString
        public static class DatasIspsDto {
            /***/
            @JsonProperty("Isp")
            private String Isp;

            /***/
            @JsonProperty("Flow")
            private Integer Flow;

            /***/
            @JsonProperty("Pv")
            private Integer Pv;

            /***/
            @JsonProperty("FlowProportion")
            private Double FlowProportion;

            /***/
            @JsonProperty("PvProportion")
            private Double PvProportion;

        }

    }

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
