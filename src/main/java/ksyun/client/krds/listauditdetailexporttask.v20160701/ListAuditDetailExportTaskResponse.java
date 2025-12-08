package ksyun.client.krds.listauditdetailexporttask.v20160701;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ListAuditDetailExportTaskResponse
* @Description ListAuditDetailExportTask 返回体
*/
@Data
@ToString
public class ListAuditDetailExportTaskResponse extends BaseResponseModel {
    /**结果导出列表	
*/
    @JsonProperty("taskResps")
    private List<TaskRespsDto> TaskResps;

    @Data
    @ToString
    public static class TaskRespsDto {
        /**审计日志开始时间	
例如：2021-08-31 14:14:55*/
        @JsonProperty("startTime")
        private String StartTime;

        /**审计日志结束时间	
例如：2021-08-31 15:14:55*/
        @JsonProperty("endTime")
        private String EndTime;

        /**导出状态	
默认返回成功；<br>0开始导出<br>1导出成功<br>2导出失败*/
        @JsonProperty("status")
        private Integer Status;

        /**导出时间	
返回的毫秒级别的时间戳*/
        @JsonProperty("createTime")
        private Integer CreateTime;

        /**SQL条数	
*/
        @JsonProperty("recordNumber")
        private Integer RecordNumber;

        /**下载URL	
*/
        @JsonProperty("s3FileNames")
        private List<String> S3FileNames;

    }

    /**结果导出列表总条数	
*/
    @JsonProperty("totalCount")
    private Integer TotalCount;

    /**请求ID	
–*/
    @JsonProperty("RequestId")
    private String RequestId;

}
