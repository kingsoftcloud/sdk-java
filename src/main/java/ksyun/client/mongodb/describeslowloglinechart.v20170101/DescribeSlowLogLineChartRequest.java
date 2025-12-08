package ksyun.client.mongodb.describeslowloglinechart.v20170101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeSlowLogLineChartRequest
* @Description 请求参数
*/
@Data
public class DescribeSlowLogLineChartRequest{
    /**实例id*/
    @KsYunField(name="InstanceId")
    private String InstanceId;

    /**加上节点id择查询该节点下的慢SQL折线图数据*/
    @KsYunField(name="NodeId")
    private String NodeId;

    /**节点类型。节点类型 ：HighIO（副本集）、Cluster（分片集群）*/
    @KsYunField(name="InstanceType")
    private String InstanceType;

    /**yyyy-MM-dd HH:mm:ss 格式*/
    @KsYunField(name="StartTime")
    private String StartTime;

    /**结束时间	。yyyy-MM-dd HH:mm:ss 格式*/
    @KsYunField(name="EndTime")
    private String EndTime;

}
