package ksyun.client.epc.describeagent.v20151101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeAgentRequest
* @Description 请求参数
*/
@Data
public class DescribeAgentRequest{
    /**Agent名称*/
    @KsYunField(name="AgentName")
    private String AgentName;

    /**Agent的ID*/
    @KsYunField(name="AgentId")
    private String AgentId;

    /**Agent类型
CloudMoniter 云监控
Container 容器*/
    @KsYunField(name="AgentType")
    private String AgentType;

}
