package ksyun.client.epc.describeagent.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeAgentResponse
* @Description DescribeAgent 返回体
*/
@Data
@ToString
public class DescribeAgentResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("AgentInfo")
    private List<AgentInfoDto> AgentInfo;

    @Data
    @ToString
    public static class AgentInfoDto {
        /**agent名称*/
        @JsonProperty("AgentName")
        private String AgentName;

        /**agentID*/
        @JsonProperty("AgentId")
        private String AgentId;

        /**agent类型
CloudMonitor | Container*/
        @JsonProperty("AgentType")
        private String AgentType;

        /**版本*/
        @JsonProperty("Version")
        private String Version;

    }

}
