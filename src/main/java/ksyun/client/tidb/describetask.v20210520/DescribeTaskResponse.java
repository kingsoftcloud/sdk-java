package ksyun.client.tidb.describetask.v20210520;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeTaskResponse
* @Description DescribeTask 返回体
*/
@Data
@ToString
public class DescribeTaskResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Code")
    private String Code;

    /***/
    @JsonProperty("Message")
    private String Message;

    /***/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /***/
        @JsonProperty("tiCDCTaskBaseInfo")
        private DataDtoTiCDCTaskBaseInfoDto TiCDCTaskBaseInfo;

        @Data
        @ToString
        public static class DataDtoTiCDCTaskBaseInfoDto {
            /**实例ID*/
            @JsonProperty("InstanceId")
            private String InstanceId;

            /**任务名称*/
            @JsonProperty("TaskName")
            private String TaskName;

            /**任务状态*/
            @JsonProperty("TaskStatus")
            private String TaskStatus;

            /**创建时间*/
            @JsonProperty("CreateTime")
            private String CreateTime;

            /**检查点时间*/
            @JsonProperty("CheckPointTs")
            private String CheckPointTs;

            /**完成时间点*/
            @JsonProperty("ResolvedTs")
            private String ResolvedTs;

            /**延迟时间*/
            @JsonProperty("DelayTime")
            private String DelayTime;

            /**暂停时间*/
            @JsonProperty("PauseTime")
            private String PauseTime;

            /**完成时间*/
            @JsonProperty("FinishTime")
            private String FinishTime;

            /**任务失败信息*/
            @JsonProperty("TaskFailInfo")
            private String TaskFailInfo;

        }

        /**任务具体细节*/
        @JsonProperty("tiCDCTaskTargetInfo")
        private DataDtoTiCDCTaskTargetInfoDto TiCDCTaskTargetInfo;

        @Data
        @ToString
        public static class DataDtoTiCDCTaskTargetInfoDto {
            /**目标实例ID*/
            @JsonProperty("TargetId")
            private String TargetId;

            /**目标端连接信息*/
            @JsonProperty("SinkUri")
            private String SinkUri;

        }

    }

}
