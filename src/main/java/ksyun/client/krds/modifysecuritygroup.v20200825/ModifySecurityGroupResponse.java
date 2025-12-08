package ksyun.client.krds.modifysecuritygroup.v20200825;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ModifySecurityGroupResponse
* @Description ModifySecurityGroup 返回体
*/
@Data
@ToString
public class ModifySecurityGroupResponse extends BaseResponseModel {
    /***/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /**安全组信息*/
        @JsonProperty("SecurityGroups")
        private List<SecurityGroupsDto> SecurityGroups;

        @Data
        @ToString
        public static class SecurityGroupsDto {
            /**安全组id*/
            @JsonProperty("SecurityGroupId")
            private String SecurityGroupId;

            /**安全组名称*/
            @JsonProperty("SecurityGroupName")
            private String SecurityGroupName;

            /**安全组描述*/
            @JsonProperty("SecurityGroupDescription")
            private String SecurityGroupDescription;

            /**安全组类型*/
            @JsonProperty("SecurityGroupType")
            private String SecurityGroupType;

            /**创建时间*/
            @JsonProperty("Created")
            private String Created;

            /**绑定该安全组的实例信息，实例支持多安全组*/
            @JsonProperty("Instances")
            private List<InstancesDto> Instances;

            @Data
            @ToString
            public static class InstancesDto {
                /***/
                @JsonProperty("DBInstanceIdentifier")
                private String DBInstanceIdentifier;

                /***/
                @JsonProperty("DBInstanceName")
                private String DBInstanceName;

                /***/
                @JsonProperty("Vip")
                private String Vip;

                /***/
                @JsonProperty("Created")
                private String Created;

                /***/
                @JsonProperty("DBInstanceType")
                private String DBInstanceType;

            }

            /**安全组规则列表*/
            @JsonProperty("SecurityGroupRules")
            private List<SecurityGroupRulesDto> SecurityGroupRules;

            @Data
            @ToString
            public static class SecurityGroupRulesDto {
                /***/
                @JsonProperty("SecurityGroupRuleId")
                private String SecurityGroupRuleId;

                /***/
                @JsonProperty("SecurityGroupRuleName")
                private String SecurityGroupRuleName;

                /***/
                @JsonProperty("SecurityGroupRuleProtocol")
                private String SecurityGroupRuleProtocol;

                /***/
                @JsonProperty("SecurityGroupRuleCidr")
                private String SecurityGroupRuleCidr;

                /***/
                @JsonProperty("Created")
                private String Created;

            }

        }

    }

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
