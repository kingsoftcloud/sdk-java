package ksyun.client.epc.describeshareimage.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeShareImageResponse
* @Description DescribeShareImage 返回体
*/
@Data
@ToString
public class DescribeShareImageResponse extends BaseResponseModel {
    /***/
    @JsonProperty("SharePermissionSet")
    private List<SharePermissionSetDto> SharePermissionSet;

    @Data
    @ToString
    public static class SharePermissionSetDto {
        /***/
        @JsonProperty("ImageName")
        private String ImageName;

        /***/
        @JsonProperty("System")
        private String System;

        /***/
        @JsonProperty("CreateTime")
        private String CreateTime;

        /***/
        @JsonProperty("FromId")
        private String FromId;

        /***/
        @JsonProperty("ImageId")
        private String ImageId;

        /***/
        @JsonProperty("ShareTime")
        private String ShareTime;

        /***/
        @JsonProperty("ImageInitialization")
        private String ImageInitialization;

        /***/
        @JsonProperty("Status")
        private String Status;

    }

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("TotalCount")
    private Integer TotalCount;

    /***/
    @JsonProperty("NextToken")
    private String NextToken;

}
