package ksyun.client.klog.getlogs.v20200731;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname GetLogsResponse
* @Description GetLogs 返回体
*/
@Data
@ToString
public class GetLogsResponse extends BaseResponseModel {
    /**满足条件的数据总量*/
    @JsonProperty("Total")
    private Integer Total;

    /**当前返回的数据条数*/
    @JsonProperty("Count")
    private Integer Count;

    /**查询语句是否为sql*/
    @JsonProperty("HasSql")
    private Boolean HasSql;

    /**日志列表*/
    @JsonProperty("Logs")
    private List<LogsDto> Logs;

    @Data
    @ToString
    public static class LogsDto {
        /**同一节点上的日志唯一自增id*/
        @JsonProperty("__id__")
        private String __id__;

        /**日志源节点名称*/
        @JsonProperty("__source__")
        private String __source__;

        /**日志路径*/
        @JsonProperty("__path__")
        private String __path__;

        /**日志采集时间*/
        @JsonProperty("timestamp")
        private String Timestamp;

    }

    /**按时间间隔统计的数据条数*/
    @JsonProperty("Histogram")
    private List<HistogramDto> Histogram;

    @Data
    @ToString
    public static class HistogramDto {
        /**时间*/
        @JsonProperty("Key")
        private String Key;

        /**数据行数*/
        @JsonProperty("LogCount")
        private Integer LogCount;

    }

    /**返回数据的字段名称列表*/
    @JsonProperty("Keys")
    private List<String> Keys;

}
