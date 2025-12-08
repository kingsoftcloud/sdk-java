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
        private ParamsDto Params;

        @Data
        @ToString
        public static class ParamsDto {
            /***/
            @JsonProperty("setParameter.failIndexKeyTooInt")
            private String SetParameterfailIndexKeyTooInt;

            /***/
            @JsonProperty("operationProfiling.slowOpThresholdMs")
            private Integer OperationProfilingslowOpThresholdMs;

            /***/
            @JsonProperty("replication.oplogSizeMB")
            private String ReplicationoplogSizeMB;

            /***/
            @JsonProperty("operationProfiling.mode")
            private String OperationProfilingmode;

            /***/
            @JsonProperty("setParameter.cursorTimeoutMillis")
            private Integer SetParametercursorTimeoutMillis;

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
