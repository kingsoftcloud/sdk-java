package ksyun.client.aicp.querymcpmetrics.v20251114;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname QueryMcpMetricsRequest
* @Description 请求参数
*/
@Data
public class QueryMcpMetricsRequest{
    /**开始时间（Unix时间戳，秒）*/
    @KsYunField(name="StartTime")
    private Long StartTime;

    /**结束时间（Unix时间戳，秒）*/
    @KsYunField(name="EndTime")
    private Long EndTime;

    /**聚合步长（秒），允许值：30, 60, 300, 600, 1800, 3600*/
    @KsYunField(name="Interval")
    private Integer Interval;

    /**MCP类型：Official / Custom*/
    @KsYunField(name="McpType")
    private String McpType;

    /**MCP服务ID*/
    @KsYunField(name="McpServerId")
    private String McpServerId;

}
