package ksyun.client.mongodb.describeinstanceparams.v20170101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeInstanceParamsResponse
* @Description DescribeInstanceParams 返回体
*/
@Data
@ToString
public class DescribeInstanceParamsResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RuntimeParams")
    private RuntimeParamsDto RuntimeParams;

    @Data
    @ToString
    public static class RuntimeParamsDto {
        /***/
        @JsonProperty("SetParameter")
        private RuntimeParamsDtoSetParameterDto SetParameter;

        @Data
        @ToString
        public static class RuntimeParamsDtoSetParameterDto {
            /***/
            @JsonProperty("maxTransactionLockRequestTimeoutMillis")
            private Integer MaxTransactionLockRequestTimeoutMillis;

            /***/
            @JsonProperty("transactionLifetimeLimitSeconds")
            private Integer TransactionLifetimeLimitSeconds;

            /***/
            @JsonProperty("cursorTimeoutMillis")
            private Integer CursorTimeoutMillis;

        }

        /***/
        @JsonProperty("OperationProfiling")
        private RuntimeParamsDtoOperationProfilingDto OperationProfiling;

        @Data
        @ToString
        public static class RuntimeParamsDtoOperationProfilingDto {
            /***/
            @JsonProperty("slowOpThresholdMs")
            private Integer SlowOpThresholdMs;

            /***/
            @JsonProperty("mode")
            private String Mode;

        }

        /***/
        @JsonProperty("Replication")
        private RuntimeParamsDtoReplicationDto Replication;

        @Data
        @ToString
        public static class RuntimeParamsDtoReplicationDto {
            /***/
            @JsonProperty("oplogSizeMB")
            private String OplogSizeMB;

        }

    }

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
