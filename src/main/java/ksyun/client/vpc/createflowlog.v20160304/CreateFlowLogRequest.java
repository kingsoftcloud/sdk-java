package ksyun.client.vpc.createflowlog.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreateFlowLogRequest
* @Description 请求参数
*/
@Data
public class CreateFlowLogRequest{
    /**流日志名称*/
    @KsYunField(name="FlowLogName")
    private String FlowLogName;

    /**要捕获流量的资源类型,可选值
 -NetworkInterface 弹性网卡 */
    @KsYunField(name="ResourceType")
    private String ResourceType;

    /**要捕获流量的资源 ID*/
    @KsYunField(name="ResourceId")
    private String ResourceId;

    /**采集的流量类型,可选值
 - All 全部流量*/
    @KsYunField(name="TrafficType")
    private String TrafficType;

    /**管理捕获到的流量的 Project 名称*/
    @KsYunField(name="ProjectName")
    private String ProjectName;

    /**存储捕获到的流量的 LogPool 名称*/
    @KsYunField(name="LogPoolName")
    private String LogPoolName;

    /**采集窗口时间（60s~600s）*/
    @KsYunField(name="WindowTime")
    private Integer WindowTime;

    /**流日志描述*/
    @KsYunField(name="Description")
    private String Description;

}
