package ksyun.client.tidb.listtasks.v20210520;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ListTasksResponse
* @Description ListTasks 返回体
*/
@Data
@ToString
public class ListTasksResponse extends BaseResponseModel {
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
    private List<DataDto> Data;

    @Data
    @ToString
    public static class DataDto {
        /**任务名称*/
        @JsonProperty("TaskName")
        private String TaskName;

        /**任务状态*/
        @JsonProperty("TaskStatus")
        private String TaskStatus;

        /**任务类型*/
        @JsonProperty("TargetType")
        private String TargetType;

        /**目标ID*/
        @JsonProperty("TargetId")
        private String TargetId;

        /**目标地址*/
        @JsonProperty("TargetAddress")
        private String TargetAddress;

        /**目标端口*/
        @JsonProperty("TargetPort")
        private String TargetPort;

        /**VPC ID*/
        @JsonProperty("VpcId")
        private String VpcId;

    }

}
