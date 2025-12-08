package ksyun.client.cdn.createuserusagedataexporttask.v20200901;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateUserUsageDataExportTaskResponse
* @Description CreateUserUsageDataExportTask 返回体
*/
@Data
@ToString
public class CreateUserUsageDataExportTaskResponse extends BaseResponseModel {
    /***/
    @JsonProperty("StartTime")
    private String StartTime;

    /***/
    @JsonProperty("EndTime")
    private String EndTime;

    /***/
    @JsonProperty("CdnType")
    private String CdnType;

    /***/
    @JsonProperty("TaskId")
    private String TaskId;

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
