package ksyun.client.vpc.modifyflowlog.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ModifyFlowLogResponse
* @Description ModifyFlowLog 返回体
*/
@Data
@ToString
public class ModifyFlowLogResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**流日志的ID*/
    @JsonProperty("FlowLogId")
    private String FlowLogId;

    /**流日志的名称*/
    @JsonProperty("FlowLogName")
    private String FlowLogName;

    /**关联的资源类型,现版本只支持网卡*/
    @JsonProperty("ResourceType")
    private String ResourceType;

    /**关联的资源Id*/
    @JsonProperty("ResourceId")
    private String ResourceId;

    /**采集的流量类型,目前仅支持All*/
    @JsonProperty("TrafficType")
    private String TrafficType;

    /**管理捕获到的流量的 Project 名称*/
    @JsonProperty("ProjectName")
    private String ProjectName;

    /**存储捕获到的流量的 LogPool 名称*/
    @JsonProperty("LogPoolName")
    private String LogPoolName;

    /**采集窗口时间（60s~600s）*/
    @JsonProperty("WindowTime")
    private Integer WindowTime;

    /**流日志描述*/
    @JsonProperty("Description")
    private String Description;

    /**创建时间*/
    @JsonProperty("CreateTime")
    private String CreateTime;

}
