package ksyun.client.mongodb.describeinstancestatistic.v20170101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeInstanceStatisticResponse
* @Description DescribeInstanceStatistic 返回体
*/
@Data
@ToString
public class DescribeInstanceStatisticResponse extends BaseResponseModel {
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
        @JsonProperty("total")
        private DataDtoTotalDto Total;

        @Data
        @ToString
        public static class DataDtoTotalDto {
            /***/
            @JsonProperty("code")
            private String Code;

            /***/
            @JsonProperty("name")
            private String Name;

            /***/
            @JsonProperty("count")
            private Integer Count;

            /***/
            @JsonProperty("items")
            private List<DataDtoTotalDtoItemsDto> Items;

            @Data
            @ToString
            public static class DataDtoTotalDtoItemsDto {
                /***/
                @JsonProperty("code")
                private String Code;

                /***/
                @JsonProperty("name")
                private String Name;

                /***/
                @JsonProperty("count")
                private Integer Count;

            }

        }

        /***/
        @JsonProperty("details")
        private List<DataDtoDetailsDto> Details;

        @Data
        @ToString
        public static class DataDtoDetailsDto {
            /***/
            @JsonProperty("code")
            private String Code;

            /***/
            @JsonProperty("name")
            private String Name;

            /***/
            @JsonProperty("count")
            private Integer Count;

            /***/
            @JsonProperty("items")
            private List<DataDtoDetailsDtoItemsDto> Items;

            @Data
            @ToString
            public static class DataDtoDetailsDtoItemsDto {
                /***/
                @JsonProperty("code")
                private String Code;

                /***/
                @JsonProperty("name")
                private String Name;

                /***/
                @JsonProperty("count")
                private Integer Count;

            }

        }

    }

}
