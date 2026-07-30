package ksyun.client.aicp.createusagedownloadtask.v20240612;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateUsageDownloadTaskResponse
* @Description CreateUsageDownloadTask 返回体
*/
@Data
@ToString
public class CreateUsageDownloadTaskResponse extends BaseResponseModel {

    /**导出任务ID*/
    @JsonProperty("TaskId")
    private String TaskId;

    /**导出任务创建时间*/
    @JsonProperty("CreateTimestamp")
    private Long CreateTimestamp;

}
