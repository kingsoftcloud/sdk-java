package ksyun.client.kcrs.getretentionpolicylogs.v20211109;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname GetRetentionPolicyLogsResponse
* @Description GetRetentionPolicyLogs 返回体
*/
@Data
@ToString
public class GetRetentionPolicyLogsResponse extends BaseResponseModel {
    /**请求Id*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**响应实体类*/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /**logId
*/
        @JsonProperty("Id")
        private String Id;

        /**结束时间
*/
        @JsonProperty("EndTime")
        private String EndTime;

        /**开始时间*/
        @JsonProperty("StartTime")
        private String StartTime;

        /**状态*/
        @JsonProperty("Status")
        private String Status;

        /**触发器*/
        @JsonProperty("Trigger")
        private String Trigger;

        /**是否模拟运行*/
        @JsonProperty("DryRun")
        private Boolean DryRun;

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
