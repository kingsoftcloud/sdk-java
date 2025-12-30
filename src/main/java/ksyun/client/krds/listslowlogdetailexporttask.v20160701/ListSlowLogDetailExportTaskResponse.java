package ksyun.client.krds.listslowlogdetailexporttask.v20160701;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ListSlowLogDetailExportTaskResponse
* @Description ListSlowLogDetailExportTask 返回体
*/
@Data
@ToString
public class ListSlowLogDetailExportTaskResponse extends BaseResponseModel {

    /**任务列表*/
    @JsonProperty("taskResps")
    private List<TaskRespsDto> TaskResps;

    @Data
    @ToString
    public static class TaskRespsDto {
        /**审计日志起始时间*/
        @JsonProperty("startTime")
        private String StartTime;

        /**审计日志结束时间*/
        @JsonProperty("endTime")
        private String EndTime;

        /**导出任务状态*/
        @JsonProperty("status")
        private Integer Status;

        /**导出时间*/
        @JsonProperty("createTime")
        private Integer CreateTime;

        /**SQL条数*/
        @JsonProperty("recordNumber")
        private Integer RecordNumber;

        /**下载链接*/
        @JsonProperty("s3FileNames")
        private List<String> S3FileNames;

    }

    /**总条数*/
    @JsonProperty("totalCount")
    private Integer TotalCount;

    /**请求id*/
    @JsonProperty("RequestId")
    private String RequestId;

}
