package ksyun.client.epc.querybuckets.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname QueryBucketsResponse
* @Description QueryBuckets 返回体
*/
@Data
@ToString
public class QueryBucketsResponse extends BaseResponseModel {
    /***/
    @JsonProperty("BucketSet")
    private List<BucketSetDto> BucketSet;

    @Data
    @ToString
    public static class BucketSetDto {
        /***/
        @JsonProperty("BucketName")
        private String BucketName;

        /***/
        @JsonProperty("BucketHost")
        private String BucketHost;

        /***/
        @JsonProperty("BucketHostCompatible")
        private String BucketHostCompatible;

        /***/
        @JsonProperty("BucketInnerHost")
        private String BucketInnerHost;

        /***/
        @JsonProperty("Endpoint")
        private String Endpoint;

    }

    /***/
    @JsonProperty("Code")
    private Integer Code;

}
