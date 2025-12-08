package ksyun.client.kcs.analyzedaily.v20160701;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname AnalyzeDailyRequest
* @Description 请求参数
*/
@Data
public class AnalyzeDailyRequest{
    /**缓存服务ID（实例ID）*/
    @KsYunField(name="CacheId")
    private String CacheId;

    /**运行日志采集开始时间      	 yyyy-MM-dd HH:mm:ss格式*/
    @KsYunField(name="StartQueryTime")
    private String StartQueryTime;

    /**运行日志采集结束时间      	 yyyy-MM-dd HH:mm:ss格式*/
    @KsYunField(name="EndQueryTime")
    private String EndQueryTime;

    /**记录开始偏移量  	 位移量（查询数据的开始位置，默认为1）*/
    @KsYunField(name="PageNum")
    private String PageNum;

    /**每页记录大小     	 每页记录大小, 默认10*/
    @KsYunField(name="PageSize")
    private String PageSize;

    /**实例节点ID   	 实例为集群架构可选填写，加上查询实例下节点的日志，不传默认查询全部*/
    @KsYunField(name="ShardId")
    private String ShardId;

    /**操作类型   	 筛选不同操作类型的日志数据，如LATENCY GET STATS ALL 等*/
    @KsYunField(name="OperationType")
    private String OperationType;

}
