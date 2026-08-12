package ksyun.client.kpfs.createdatamigratetask.v20240930;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateDataMigrateTaskResponse
* @Description CreateDataMigrateTask 返回体
*/
@Data
@ToString
public class CreateDataMigrateTaskResponse extends BaseResponseModel {

    /**数据流动任务ID*/
    @JsonProperty("TaskId")
    private String TaskId;

    /**唯一请求ID，每次请求都会返回。*/
    @JsonProperty("RequestId")
    private String RequestId;

}
