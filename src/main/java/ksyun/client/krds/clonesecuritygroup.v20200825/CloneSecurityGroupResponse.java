package ksyun.client.krds.clonesecuritygroup.v20200825;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CloneSecurityGroupResponse
* @Description CloneSecurityGroup 返回体
*/
@Data
@ToString
public class CloneSecurityGroupResponse extends BaseResponseModel {
    /**	安全组列表
返回安全组详细信息*/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /**	安全组列表
返回安全组详细信息*/
        @JsonProperty("SecurityGroups")
        private List<SecurityGroupsDto> SecurityGroups;

        @Data
        @ToString
        public static class SecurityGroupsDto {
            /**安全组ID	
*/
            @JsonProperty("SecurityGroupId")
            private String SecurityGroupId;

            /**安全组名称	
*/
            @JsonProperty("SecurityGroupName")
            private String SecurityGroupName;

            /**安全组描述
*/
            @JsonProperty("SecurityGroupDescription")
            private String SecurityGroupDescription;

            /**安全组类型
*/
            @JsonProperty("SecurityGroupType")
            private String SecurityGroupType;

            /**创建时间	
*/
            @JsonProperty("Created")
            private String Created;

            /**绑定实例列表	
*/
            @JsonProperty("Instances")
            private InstancesDto Instances;

            @Data
            @ToString
            public static class InstancesDto {
            }

            /**绑定规则列表
*/
            @JsonProperty("SecurityGroupRules")
            private List<SecurityGroupRulesDto> SecurityGroupRules;

            @Data
            @ToString
            public static class SecurityGroupRulesDto {
                /**规则ID	
*/
                @JsonProperty("SecurityGroupRuleId")
                private String SecurityGroupRuleId;

                /**规则协议	
*/
                @JsonProperty("SecurityGroupRuleProtocol")
                private String SecurityGroupRuleProtocol;

                /**规则CIDR	
*/
                @JsonProperty("SecurityGroupRuleCidr")
                private String SecurityGroupRuleCidr;

                /**创建时间	
*/
                @JsonProperty("Created")
                private String Created;

            }

        }

    }

    /**请求ID	
–*/
    @JsonProperty("RequestId")
    private String RequestId;

}
