package ksyun.client.tidb.operationtasks.v20210520;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname OperationTasksResponse
* @Description OperationTasks 返回体
*/
@Data
@ToString
public class OperationTasksResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /**任务操作情况反馈列表。返回批量操作时，单条任务的执行情况。*/
    @JsonProperty("Data")
    private List<DataDto> Data;

    @Data
    @ToString
    public static class DataDto {
        /***/
        @JsonProperty("TaskName")
        private String TaskName;

        /***/
        @JsonProperty("OperStatus")
        private String OperStatus;

        /***/
        @JsonProperty("Msg")
        private String Msg;

    }

}
