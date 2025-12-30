package ksyun.client.epc.describeagentinstallstatus.v20151101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeAgentInstallStatusRequest
* @Description 请求参数
*/
@Data
public class DescribeAgentInstallStatusRequest{
    /**实例ID，最多支持100个ID。
• 参数 - N：表示实例的序号。
• 多个Host ID之间用&分隔。*/
    @KsYunField(name="HostId",type=1)
    private List<String> HostIdList;

    /**Agent的ID*/
    @KsYunField(name="AgentId")
    private String AgentId;

    /**Agent状态。取值：
• Installing：安装中
• InstallFinished：安装完成
• InstallFailed：安装失败*/
    @KsYunField(name="Status")
    private String Status;

    /**当前页码。
• 起始值：1。
• 默认值：1。*/
    @KsYunField(name="NextToken")
    private String NextToken;

    /**分页查询时设置的每页行数。
• 取值范围：1~100。
• 默认值：10。*/
    @KsYunField(name="MaxResults")
    private Integer MaxResults;

}
