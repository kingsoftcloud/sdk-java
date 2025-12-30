package ksyun.client.kcs.describebighotkeys.v20160701;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeBigHotKeysResponse
* @Description DescribeBigHotKeys 返回体
*/
@Data
@ToString
public class DescribeBigHotKeysResponse extends BaseResponseModel {

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
        @JsonProperty("KeyInfos")
        private List<DataKeyInfosDto> KeyInfos;

        @Data
        @ToString
        public static class DataKeyInfosDto {
            /***/
            @JsonProperty("KeyName")
            private String KeyName;

            /***/
            @JsonProperty("DB")
            private Integer DB;

            /***/
            @JsonProperty("DataType")
            private String DataType;

            /***/
            @JsonProperty("NodeId")
            private String NodeId;

            /***/
            @JsonProperty("StatisticValue")
            private Integer StatisticValue;

            /***/
            @JsonProperty("CreateTime")
            private String CreateTime;

        }

        /***/
        @JsonProperty("TotalCount")
        private Integer TotalCount;

        /***/
        @JsonProperty("TotalPage")
        private Integer TotalPage;

        /***/
        @JsonProperty("CurrentPage")
        private Integer CurrentPage;

        /***/
        @JsonProperty("PageSize")
        private Integer PageSize;

    }

}
