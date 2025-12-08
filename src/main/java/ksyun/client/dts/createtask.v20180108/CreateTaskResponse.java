package ksyun.client.dts.createtask.v20180108;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateTaskResponse
* @Description CreateTask 返回体
*/
@Data
@ToString
public class CreateTaskResponse extends BaseResponseModel {
    /***/
    @JsonProperty("requestId")
    private String RequestId;

    /***/
    @JsonProperty("code")
    private String Code;

    /***/
    @JsonProperty("message")
    private String Message;

    /***/
    @JsonProperty("data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /***/
        @JsonProperty("TaskId")
        private String TaskId;

        /***/
        @JsonProperty("TaskName")
        private String TaskName;

        /***/
        @JsonProperty("TaskType")
        private String TaskType;

        /***/
        @JsonProperty("OrderId")
        private String OrderId;

    }

}
