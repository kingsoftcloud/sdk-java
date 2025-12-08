package ksyun.client.tidb.createtask.v20210520;

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
    @JsonProperty("TaskName")
    private String TaskName;

    /***/
    @JsonProperty("OperStatus")
    private String OperStatus;

    /***/
    @JsonProperty("Msg")
    private MsgDto Msg;

    @Data
    @ToString
    public static class MsgDto {
    }

}
