package ksyun.client.mongodb.describeslowlogdatabase.v20170101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribeSlowLogDatabaseRequest
 * @Description 请求参数
 */
@Data
public class DescribeSlowLogDatabaseRequest {
    /**
     * 实例ID。
     */
    @KsYunField(name = "InstanceId")
    private String InstanceId;

    /**
     * 节点ID。加上节点ID则查询该节点下的慢SQL数据库信息。
     */
    @KsYunField(name = "NodeId")
    private String NodeId;

    /**
     * 节点类型 ：HighIO（副本集）、Cluster（分片集群）
     */
    @KsYunField(name = "InstanceType")
    private String InstanceType;

    /**
     * 开始查询时间。yyyy-MM-dd HH:mm:ss 格式。
     */
    @KsYunField(name = "StartTime")
    private String StartTime;

    /**
     * 结束时间。yyyy-MM-dd HH:mm:ss 格式。
     */
    @KsYunField(name = "EndTime")
    private String EndTime;


}