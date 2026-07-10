package ksyun.client.aicp.describemcpruntimelogs.v20251114;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeMcpRuntimeLogsResponse
* @Description DescribeMcpRuntimeLogs 返回体
*/
@Data
@ToString
public class DescribeMcpRuntimeLogsResponse extends BaseResponseModel {

    /**请求唯一标识*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**MCP服务ID*/
    @JsonProperty("McpServerId")
    private String McpServerId;

    /**开始时间（Unix时间戳，秒）*/
    @JsonProperty("StartTime")
    private Long StartTime;

    /**结束时间（Unix时间戳，秒）*/
    @JsonProperty("EndTime")
    private Long EndTime;

    /**日志类型*/
    @JsonProperty("LogType")
    private String LogType;

    /**日志内容列表*/
    @JsonProperty("Logs")
    private List<String> Logs;

    /**总条数*/
    @JsonProperty("Total")
    private Long Total;

    /**页码*/
    @JsonProperty("Page")
    private Integer Page;

    /**每页条数*/
    @JsonProperty("Limit")
    private Integer Limit;

}
