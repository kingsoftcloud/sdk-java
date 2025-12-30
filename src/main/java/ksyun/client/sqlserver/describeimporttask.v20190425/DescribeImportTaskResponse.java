package ksyun.client.sqlserver.describeimporttask.v20190425;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeImportTaskResponse
* @Description DescribeImportTask 返回体
*/
@Data
@ToString
public class DescribeImportTaskResponse extends BaseResponseModel {

    /***/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /**导入任务列表*/
        @JsonProperty("ImportTasks")
        private List<DataImportTasksDto> ImportTasks;

        @Data
        @ToString
        public static class DataImportTasksDto {
            /**任务ID*/
            @JsonProperty("ImportTaskId")
            private String ImportTaskId;

            /**数据库名称*/
            @JsonProperty("DBName")
            private String DBName;

            /**任务创建时间*/
            @JsonProperty("Created")
            private String Created;

            /**开始时间*/
            @JsonProperty("StartTime")
            private String StartTime;

            /**结束时间*/
            @JsonProperty("EndTime")
            private String EndTime;

            /**导入状态：FAILED 失败，SUCCEED 成功,RUNNING 迁移中*/
            @JsonProperty("ImportTaskStatus")
            private String ImportTaskStatus;

        }

    }

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
