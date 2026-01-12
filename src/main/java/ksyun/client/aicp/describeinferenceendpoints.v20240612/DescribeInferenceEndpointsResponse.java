package ksyun.client.aicp.describeinferenceendpoints.v20240612;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeInferenceEndpointsResponse
* @Description DescribeInferenceEndpoints 返回体
*/
@Data
@ToString
public class DescribeInferenceEndpointsResponse extends BaseResponseModel {

    /**uuid*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**总数*/
    @JsonProperty("TotalCount")
    private Integer TotalCount;

    /***/
    @JsonProperty("Endpoints")
    private List<EndpointsDto> Endpoints;

    @Data
    @ToString
    public static class EndpointsDto {
        /**模型名称*/
        @JsonProperty("ModelName")
        private String ModelName;

        /**1*/
        @JsonProperty("ModelType")
        private Integer ModelType;

        /**模型来源*/
        @JsonProperty("ModelSource")
        private String ModelSource;

        /**状态： running stop*/
        @JsonProperty("Status")
        private String Status;

        /**是否开启限流*/
        @JsonProperty("RateLimitEnabled")
        private Boolean RateLimitEnabled;

        /**2025-12-31T12:00:00Z*/
        @JsonProperty("CreateTime")
        private String CreateTime;

        /**user-10001*/
        @JsonProperty("CreateUserId")
        private String CreateUserId;

        /**zhangsan*/
        @JsonProperty("CreateUserName")
        private String CreateUserName;

        /***/
        @JsonProperty("RateLimitConfig")
        private List<EndpointsRateLimitConfigDto> RateLimitConfig;

        @Data
        @ToString
        public static class EndpointsRateLimitConfigDto {
            /**500*/
            @JsonProperty("RPM")
            private Integer RPM;

            /**60000*/
            @JsonProperty("TPM")
            private Integer TPM;

        }

        /**ep-1234567890abcdef*/
        @JsonProperty("EndpointId")
        private String EndpointId;

        /**接入点名称*/
        @JsonProperty("EndpointName")
        private String EndpointName;

        /**接入点描述*/
        @JsonProperty("Description")
        private String Description;

        /**proj-xyz123*/
        @JsonProperty("ProjectId")
        private String ProjectId;

        /**项目名称*/
        @JsonProperty("ProjectName")
        private String ProjectName;

    }

    /**1*/
    @JsonProperty("Marker")
    private Integer Marker;

    /**1000*/
    @JsonProperty("MaxResults")
    private Integer MaxResults;

}
