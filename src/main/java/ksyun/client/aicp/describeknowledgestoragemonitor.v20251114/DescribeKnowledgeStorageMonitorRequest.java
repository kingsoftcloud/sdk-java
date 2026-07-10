package ksyun.client.aicp.describeknowledgestoragemonitor.v20251114;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeKnowledgeStorageMonitorRequest
* @Description 请求参数
*/
@Data
public class DescribeKnowledgeStorageMonitorRequest{
    /**知识库 ID*/
    @KsYunField(name="DatasetId")
    private String DatasetId;

    /**开始时间戳（秒）*/
    @KsYunField(name="StartTime")
    private Long StartTime;

    /**结束时间戳（秒）*/
    @KsYunField(name="EndTime")
    private Long EndTime;

    /**聚合粒度：minute / hour / day*/
    @KsYunField(name="Granularity")
    private String Granularity;

}
