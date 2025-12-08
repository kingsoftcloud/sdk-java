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
        private STRINGDto STRING;

        @Data
        @ToString
        public static class STRINGDto {
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
        private LISTDto LIST;

        @Data
        @ToString
        public static class LISTDto {
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
        private SETDto SET;

        @Data
        @ToString
        public static class SETDto {
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
        private HASHDto HASH;

        @Data
        @ToString
        public static class HASHDto {
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
        private SORTDto SORT;

        @Data
        @ToString
        public static class SORTDto {
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
        private String <1k;

        /***/
        @JsonProperty("1k~10k")
        private String Field1k~10k;

        /***/
        @JsonProperty("10k~1000k")
        private String Field10k~1000k;

        /***/
        @JsonProperty("1Mb~10Mb")
        private String Field1Mb~10Mb;

        /***/
        @JsonProperty(">10Mb")
        private String >10Mb;

    }

}
