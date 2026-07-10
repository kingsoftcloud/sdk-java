package ksyun.client.aicp.describemcpruntimelogs.v20251114;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeMcpRuntimeLogsRequest
* @Description 请求参数
*/
@Data
public class DescribeMcpRuntimeLogsRequest{
    /**MCP服务ID*/
    @KsYunField(name="McpServerId")
    private String McpServerId;

    /**开始时间（Unix时间戳，秒）*/
    @KsYunField(name="StartTime")
    private Long StartTime;

    /**结束时间（Unix时间戳，秒）*/
    @KsYunField(name="EndTime")
    private Long EndTime;

    /**关键词搜索*/
    @KsYunField(name="Keyword")
    private String Keyword;

    /**页码，默认1*/
    @KsYunField(name="Page")
    private Integer Page;

    /**每页条数，默认100，最大5000*/
    @KsYunField(name="Limit")
    private Integer Limit;

}
