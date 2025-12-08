package ksyun.client.kmr.querymetrics.v20240814;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname QueryMetricsRequest
* @Description 请求参数
*/
@Data
public class QueryMetricsRequest{
    /**工作空间ID*/
    @KsYunField(name="WorkspaceId")
    private String WorkspaceId;

    /**作业类型：flink，spark，ray*/
    @KsYunField(name="ProductType")
    private String ProductType;

    /**查询指标的详细信息*/
    private QueryDataDto QueryDataList;

    @Data
    @ToString
    public static class QueryDataDto {
        /**promql,查询表达式,其中的双引号 "，需要用 \ 转义，或用 ' 单引号替代；*/
        @KsYunField(name="Query")
        private String Query;

        /**起始时间戳
为UNIX时间戳，单位为秒级，示例值1741050780 表示的是秒级时间戳（对应北京时间 2025-03-02 21:13:00)
*/
        @KsYunField(name="Start")
        private String Start;

        /**结束时间戳
为UNIX时间戳，单位为秒级，示例值 1741050780 表示的是秒级时间戳（对应北京时间 2025-03-04 09:13:00)
*/
        @KsYunField(name="End")
        private String End;

        /**数据点之间的间隔，必须从范围查询中返回。 query 在 start 、 start+step 、 start+2*step 、…、 start+N*step 时间戳处执行。如果未设置 step，则默认为 5m （5分钟）*/
        @KsYunField(name="Step")
        private String Step;

    }

}
