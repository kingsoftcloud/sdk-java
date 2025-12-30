package ksyun.client.cdn.getdomainlogs.v3;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname GetDomainLogsResponse
* @Description GetDomainLogs 返回体
*/
@Data
@ToString
public class GetDomainLogsResponse extends BaseResponseModel {

    /**域名ID*/
    @JsonProperty("DomainId")
    private String DomainId;

    /**整页大小*/
    @JsonProperty("PageSize")
    private Integer PageSize;

    /**页码*/
    @JsonProperty("PageNumber")
    private Integer PageNumber;

    /**日志总条数*/
    @JsonProperty("TotalCount")
    private Integer TotalCount;

    /***/
    @JsonProperty("DomainLogs")
    private List<DomainLogsDto> DomainLogs;

    @Data
    @ToString
    public static class DomainLogsDto {
        /**日志开始时间*/
        @JsonProperty("StartTime")
        private String StartTime;

        /**日志结束时间*/
        @JsonProperty("EndTime")
        private String EndTime;

        /**日志名称*/
        @JsonProperty("LogName")
        private String LogName;

        /**日志下载地址，33天后过期*/
        @JsonProperty("LogUrl")
        private String LogUrl;

        /**日志大小，单位Byte*/
        @JsonProperty("LogSize")
        private String LogSize;

    }

}
