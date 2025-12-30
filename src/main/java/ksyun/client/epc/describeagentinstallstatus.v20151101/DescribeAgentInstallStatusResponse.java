package ksyun.client.epc.describeagentinstallstatus.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeAgentInstallStatusResponse
* @Description DescribeAgentInstallStatus 返回体
*/
@Data
@ToString
public class DescribeAgentInstallStatusResponse extends BaseResponseModel {

    /***/
    @JsonProperty("AgentSet")
    private List<AgentSetDto> AgentSet;

    @Data
    @ToString
    public static class AgentSetDto {
        /**实例ID*/
        @JsonProperty("HostId")
        private String HostId;

        /**实例名称*/
        @JsonProperty("HostName")
        private String HostName;

        /**agent ID*/
        @JsonProperty("AgentId")
        private String AgentId;

        /**Agent状态。取值：
• Installing：安装中
• InstallFinished：安装完成
• InstallFailed：安装失败*/
        @JsonProperty("Status")
        private String Status;

        /**创建时间*/
        @JsonProperty("CreateTime")
        private String CreateTime;

        /**更新时间*/
        @JsonProperty("UpdateTime")
        private String UpdateTime;

    }

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("TotalCount")
    private Integer TotalCount;

    /***/
    @JsonProperty("NextToken")
    private String NextToken;

}
