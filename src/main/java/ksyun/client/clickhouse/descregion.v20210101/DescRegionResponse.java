package ksyun.client.clickhouse.descregion.v20210101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescRegionResponse
* @Description DescRegion 返回体
*/
@Data
@ToString
public class DescRegionResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Code")
    private String Code;

    /***/
    @JsonProperty("Message")
    private String Message;

    /***/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /***/
        @JsonProperty("RegionId")
        private String RegionId;

        /***/
        @JsonProperty("InnerCode")
        private String InnerCode;

        /***/
        @JsonProperty("RegionCode")
        private String RegionCode;

        /***/
        @JsonProperty("RegionName")
        private String RegionName;

        /***/
        @JsonProperty("RegionEnName")
        private String RegionEnName;

        /***/
        @JsonProperty("Active")
        private Boolean Active;

        /***/
        @JsonProperty("RegionType")
        private Integer RegionType;

        /***/
        @JsonProperty("Overseas")
        private Boolean Overseas;

        /***/
        @JsonProperty("AzList")
        private List<DataDtoAzListDto> AzList;

        @Data
        @ToString
        public static class DataDtoAzListDto {
            /***/
            @JsonProperty("AzCode")
            private String AzCode;

            /***/
            @JsonProperty("AzName")
            private String AzName;

        }

        /***/
        @JsonProperty("AreaCode")
        private String AreaCode;

        /***/
        @JsonProperty("AreaName")
        private String AreaName;

        /***/
        @JsonProperty("AreaEnName")
        private String AreaEnName;

    }

}
