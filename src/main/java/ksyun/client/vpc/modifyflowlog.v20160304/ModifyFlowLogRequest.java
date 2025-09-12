package ksyun.client.vpc.modifyflowlog.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ModifyFlowLogRequest
* @Description 请求参数
*/
@Data
public class ModifyFlowLogRequest{
    /**流日志的ID*/
    @KsYunField(name="FlowLogId")
    private String FlowLogId;

    /**流日志的名称*/
    @KsYunField(name="FlowLogName")
    private String FlowLogName;

    /**采集窗口时间（60s~600s）*/
    @KsYunField(name="WindowTime")
    private Integer WindowTime;

    /**流日志描述*/
    @KsYunField(name="Description")
    private String Description;

}