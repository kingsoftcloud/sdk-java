package ksyun.client.kpfs.createmigratetask.v20240930;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateMigrateTaskResponse
* @Description CreateMigrateTask 返回体
*/
@Data
@ToString
public class CreateMigrateTaskResponse extends BaseResponseModel {

    /**数据迁移任务ID。*/
    @JsonProperty("TaskId")
    private String TaskId;

    /**唯一请求ID，每次请求都会返回。*/
    @JsonProperty("RequestId")
    private String RequestId;

}
