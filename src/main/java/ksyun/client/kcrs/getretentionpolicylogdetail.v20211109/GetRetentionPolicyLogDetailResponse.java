package ksyun.client.kcrs.getretentionpolicylogdetail.v20211109;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname GetRetentionPolicyLogDetailResponse
* @Description GetRetentionPolicyLogDetail 返回体
*/
@Data
@ToString
public class GetRetentionPolicyLogDetailResponse extends BaseResponseModel {
    /**请求Id*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**响应实体类*/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /**响应实体类*/
        @JsonProperty("LogDetail")
        private LogDetailDto LogDetail;

        @Data
        @ToString
        public static class LogDetailDto {
            /***/
            @JsonProperty("ExecutionId")
            private String ExecutionId;

            /**taskId*/
            @JsonProperty("Id")
            private Integer Id;

            /**结束时间*/
            @JsonProperty("EndTime")
            private String EndTime;

            /**开始时间*/
            @JsonProperty("StartTime")
            private String StartTime;

            /**状态*/
            @JsonProperty("Status")
            private String Status;

            /**触发器*/
            @JsonProperty("StatusCode")
            private String StatusCode;

            /**仓库*/
            @JsonProperty("Repository")
            private String Repository;

            /**保留数目*/
            @JsonProperty("Rentained")
            private Integer Rentained;

            /**总数*/
            @JsonProperty("Total")
            private Integer Total;

            /**耗时*/
            @JsonProperty("TakeTime")
            private Integer TakeTime;

        }

        /***/
        @JsonProperty("Page")
        private Integer Page;

        /***/
        @JsonProperty("PageSize")
        private Integer PageSize;

        /***/
        @JsonProperty("Total")
        private Integer Total;

    }

}
