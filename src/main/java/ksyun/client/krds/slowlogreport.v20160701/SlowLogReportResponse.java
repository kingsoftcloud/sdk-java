package ksyun.client.krds.slowlogreport.v20160701;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname SlowLogReportResponse
* @Description SlowLogReport 返回体
*/
@Data
@ToString
public class SlowLogReportResponse extends BaseResponseModel {

    /***/
    @JsonProperty("data")
    private List<DataDto> Data;

    @Data
    @ToString
    public static class DataDto {
        /**处理时间*/
        @JsonProperty("processingTime")
        private Integer ProcessingTime;

        /***/
        @JsonProperty("id")
        private Integer Id;

        /**标识*/
        @JsonProperty("checksum")
        private String Checksum;

        /**SQL模版*/
        @JsonProperty("fingerprint")
        private String Fingerprint;

        /**执行次数*/
        @JsonProperty("queryCount")
        private Integer QueryCount;

        /**平均执行时间*/
        @JsonProperty("queryTimeAvg")
        private Integer QueryTimeAvg;

        /**最大执行时间*/
        @JsonProperty("queryTimeMax")
        private Integer QueryTimeMax;

        /**总执行时间*/
        @JsonProperty("queryTimeSum")
        private Integer QueryTimeSum;

        /**平均锁等待时间*/
        @JsonProperty("lockTimeAvg")
        private Integer LockTimeAvg;

        /**最大锁等待时间*/
        @JsonProperty("lockTimeMax")
        private Integer LockTimeMax;

        /**总锁等待时间*/
        @JsonProperty("lockTimeSum")
        private Integer LockTimeSum;

        /**平均扫描行*/
        @JsonProperty("rowsExaminedAvg")
        private Integer RowsExaminedAvg;

        /**最大扫描行*/
        @JsonProperty("rowsExaminedMax")
        private Integer RowsExaminedMax;

        /**总扫描行*/
        @JsonProperty("rowsExaminedSum")
        private Integer RowsExaminedSum;

        /**平均返回行*/
        @JsonProperty("rowsSentAvg")
        private Integer RowsSentAvg;

        /**最大返回行*/
        @JsonProperty("rowsSentMax")
        private Integer RowsSentMax;

        /**最大返回行*/
        @JsonProperty("rowsSentSum")
        private Integer RowsSentSum;

    }

    /***/
    @JsonProperty("TotalCount")
    private Integer TotalCount;

    /***/
    @JsonProperty("Marker")
    private Integer Marker;

}
