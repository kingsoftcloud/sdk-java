package ksyun.client.cdn.createusagedetaildataexporttask.v20200901;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateUsageDetailDataExportTaskResponse
* @Description CreateUsageDetailDataExportTask 返回体
*/
@Data
@ToString
public class CreateUsageDetailDataExportTaskResponse extends BaseResponseModel {
    /***/
    @JsonProperty("StartTime")
    private String StartTime;

    /***/
    @JsonProperty("EndTime")
    private String EndTime;

    /***/
    @JsonProperty("TaskId")
    private Integer TaskId;

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
