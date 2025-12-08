package ksyun.client.sqlserver.listslowlogs.v20190425;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ListSlowLogsResponse
* @Description ListSlowLogs 返回体
*/
@Data
@ToString
public class ListSlowLogsResponse extends BaseResponseModel {
    /***/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /***/
        @JsonProperty("SlowLogs")
        private List<SlowLogsDto> SlowLogs;

        @Data
        @ToString
        public static class SlowLogsDto {
            /**总运行时间*/
            @JsonProperty("TotalElapsedTime")
            private Integer TotalElapsedTime;

            /**总执行次数*/
            @JsonProperty("TotalExecutionCount")
            private Integer TotalExecutionCount;

            /**总逻辑读数*/
            @JsonProperty("TotalLogicalReads")
            private Integer TotalLogicalReads;

            /**物理总读数*/
            @JsonProperty("TotalPhysicalReads")
            private Integer TotalPhysicalReads;

            /**SQL语句*/
            @JsonProperty("SqlText")
            private String SqlText;

            /**收集时间*/
            @JsonProperty("CollectTime")
            private String CollectTime;

        }

        /***/
        @JsonProperty("TotalCount")
        private Integer TotalCount;

        /***/
        @JsonProperty("MaxRecords")
        private Integer MaxRecords;

        /***/
        @JsonProperty("Marker")
        private Integer Marker;

    }

}
