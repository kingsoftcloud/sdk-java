package ksyun.client.sqlserver.listerrorlogs.v20190425;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ListErrorLogsResponse
* @Description ListErrorLogs 返回体
*/
@Data
@ToString
public class ListErrorLogsResponse extends BaseResponseModel {

    /***/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /**错误日志列表*/
        @JsonProperty("ErrorLogs")
        private List<DataErrorLogsDto> ErrorLogs;

        @Data
        @ToString
        public static class DataErrorLogsDto {
            /**日志信息*/
            @JsonProperty("SqlText")
            private String SqlText;

            /**日志收集时间*/
            @JsonProperty("CollectTime")
            private String CollectTime;

        }

        /**总条数*/
        @JsonProperty("TotalCount")
        private Integer TotalCount;

        /**展示条数*/
        @JsonProperty("MaxRecords")
        private Integer MaxRecords;

        /**开始条数*/
        @JsonProperty("Marker")
        private Integer Marker;

    }

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
