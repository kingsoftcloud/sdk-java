package ksyun.client.monitor.queryrange.v20250101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname QueryRangeRequest
* @Description 请求参数
*/
@Data
public class QueryRangeRequest{
    /**MetricsQL 表达式。*/
    @KsYunField(name="Query")
    private String Query;

    /**开始时间。
> 用于 Query 评估的时间范围的起始时间戳*/
    @KsYunField(name="Start")
    private Integer Start;

    /**结束时间。

> 用于 Query 评估的时间范围的结束时间戳，如果未设置 end，则 end 会自动设置为当前时间*/
    @KsYunField(name="End")
    private Integer End;

    /**区间查询必须返回的数据点之间的间隔。*/
    @KsYunField(name="Step")
    private Integer Step;

}
