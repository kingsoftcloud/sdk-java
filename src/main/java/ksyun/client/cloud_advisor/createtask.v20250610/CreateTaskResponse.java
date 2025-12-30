package ksyun.client.cloud_advisor.createtask.v20250610;

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
    @JsonProperty("msg")
    private String Msg;

    /***/
    @JsonProperty("requestId")
    private String RequestId;

    /***/
    @JsonProperty("data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /***/
        @JsonProperty("taskId")
        private String TaskId;

    }

}
