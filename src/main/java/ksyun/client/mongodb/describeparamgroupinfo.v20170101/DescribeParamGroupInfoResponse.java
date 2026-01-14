package ksyun.client.mongodb.describeparamgroupinfo.v20170101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeParamGroupInfoResponse
* @Description DescribeParamGroupInfo 返回体
*/
@Data
@ToString
public class DescribeParamGroupInfoResponse extends BaseResponseModel {

    /***/
    @JsonProperty("ParamGroupInfo")
    private ParamGroupInfoDto ParamGroupInfo;

    @Data
    @ToString
    public static class ParamGroupInfoDto {
        /***/
        @JsonProperty("Params")
        private ParamGroupInfoParamsDto Params;

        @Data
        @ToString
        public static class ParamGroupInfoParamsDto {
            /***/
            @JsonProperty("setParameter.failIndexKeyTooLong")
            private String SetParameterFailIndexKeyTooLong;

            /***/
            @JsonProperty("operationProfiling.slowOpThresholdMs")
            private Integer OperationProfilingSlowOpThresholdMs;

            /***/
            @JsonProperty("replication.oplogSizeMB")
            private String ReplicationOplogSizeMB;

            /***/
            @JsonProperty("operationProfiling.mode")
            private String OperationProfilingMode;

            /***/
            @JsonProperty("setParameter.cursorTimeoutMillis")
            private Integer SetParameterCursorTimeoutMillis;

        }

        /***/
        @JsonProperty("ParamGroupName")
        private String ParamGroupName;

        /***/
        @JsonProperty("Description")
        private String Description;

        /***/
        @JsonProperty("ParamGroupId")
        private String ParamGroupId;

    }

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
