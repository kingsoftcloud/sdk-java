package ksyun.client.kcs.analyzebigkeys.v20160701;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname AnalyzeBigKeysResponse
* @Description AnalyzeBigKeys 返回体
*/
@Data
@ToString
public class AnalyzeBigKeysResponse extends BaseResponseModel {
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
        @JsonProperty("totalKeys")
        private Integer TotalKeys;

        /***/
        @JsonProperty("STRING")
        private DataDtoSTRINGDto STRING;

        @Data
        @ToString
        public static class DataDtoSTRINGDto {
            /***/
            @JsonProperty("keyType")
            private String KeyType;

            /***/
            @JsonProperty("keyCount")
            private Integer KeyCount;

            /***/
            @JsonProperty("totalUsedMemory")
            private Integer TotalUsedMemory;

            /***/
            @JsonProperty("percent")
            private String Percent;

        }

        /***/
        @JsonProperty("LIST")
        private DataDtoLISTDto LIST;

        @Data
        @ToString
        public static class DataDtoLISTDto {
            /***/
            @JsonProperty("keyType")
            private String KeyType;

            /***/
            @JsonProperty("keyCount")
            private Integer KeyCount;

            /***/
            @JsonProperty("totalUsedMemory")
            private Integer TotalUsedMemory;

            /***/
            @JsonProperty("percent")
            private String Percent;

        }

        /***/
        @JsonProperty("SET")
        private DataDtoSETDto SET;

        @Data
        @ToString
        public static class DataDtoSETDto {
            /***/
            @JsonProperty("keyType")
            private String KeyType;

            /***/
            @JsonProperty("keyCount")
            private Integer KeyCount;

            /***/
            @JsonProperty("totalUsedMemory")
            private Integer TotalUsedMemory;

            /***/
            @JsonProperty("percent")
            private String Percent;

        }

        /***/
        @JsonProperty("HASH")
        private DataDtoHASHDto HASH;

        @Data
        @ToString
        public static class DataDtoHASHDto {
            /***/
            @JsonProperty("keyType")
            private String KeyType;

            /***/
            @JsonProperty("keyCount")
            private Integer KeyCount;

            /***/
            @JsonProperty("totalUsedMemory")
            private Integer TotalUsedMemory;

            /***/
            @JsonProperty("percent")
            private String Percent;

        }

        /***/
        @JsonProperty("SORT")
        private DataDtoSORTDto SORT;

        @Data
        @ToString
        public static class DataDtoSORTDto {
            /***/
            @JsonProperty("keyType")
            private String KeyType;

            /***/
            @JsonProperty("keyCount")
            private Integer KeyCount;

            /***/
            @JsonProperty("totalUsedMemory")
            private Integer TotalUsedMemory;

            /***/
            @JsonProperty("percent")
            private String Percent;

        }

        /***/
        @JsonProperty("<1k")
        private String Field1k;

        /***/
        @JsonProperty("1k~10k")
        private String Field1k10k;

        /***/
        @JsonProperty("10k~1000k")
        private String Field10k1000k;

        /***/
        @JsonProperty("1Mb~10Mb")
        private String Field1Mb10Mb;

        /***/
        @JsonProperty(">10Mb")
        private String Field10Mb;

    }

}
