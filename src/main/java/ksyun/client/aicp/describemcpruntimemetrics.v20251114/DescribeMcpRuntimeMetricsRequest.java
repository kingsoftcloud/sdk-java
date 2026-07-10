package ksyun.client.aicp.describemcpruntimemetrics.v20251114;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeMcpRuntimeMetricsRequest
* @Description 请求参数
*/
@Data
public class DescribeMcpRuntimeMetricsRequest{
    /**MCP服务ID*/
    @KsYunField(name="McpServerId")
    private String McpServerId;

    /**开始时间（Unix时间戳，秒）*/
    @KsYunField(name="StartTime")
    private Long StartTime;

    /**结束时间（Unix时间戳，秒）*/
    @KsYunField(name="EndTime")
    private Long EndTime;

    /**聚合周期（秒），不传由后端自动计算*/
    @KsYunField(name="Interval")
    private Integer Interval;

}
