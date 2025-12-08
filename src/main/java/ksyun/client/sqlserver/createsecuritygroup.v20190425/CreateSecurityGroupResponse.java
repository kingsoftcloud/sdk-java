package ksyun.client.sqlserver.createsecuritygroup.v20190425;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateSecurityGroupResponse
* @Description CreateSecurityGroup 返回体
*/
@Data
@ToString
public class CreateSecurityGroupResponse extends BaseResponseModel {
    /***/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /***/
        @JsonProperty("SecurityGroups")
        private List<SecurityGroupsDto> SecurityGroups;

        @Data
        @ToString
        public static class SecurityGroupsDto {
            /**安全组ID*/
            @JsonProperty("SecurityGroupId")
            private String SecurityGroupId;

            /**安全组名称*/
            @JsonProperty("SecurityGroupName")
            private String SecurityGroupName;

            /**安全组描述*/
            @JsonProperty("SecurityGroupDescription")
            private String SecurityGroupDescription;

            /**创建时间*/
            @JsonProperty("Created")
            private String Created;

            /**绑定实例列表信息*/
            @JsonProperty("Instances")
            private List<InstancesDto> Instances;

            @Data
            @ToString
            public static class InstancesDto {
                /**实例ID*/
                @JsonProperty("DBInstanceIdentifier")
                private String DBInstanceIdentifier;

                /**实例名称*/
                @JsonProperty("DBInstanceName")
                private String DBInstanceName;

                /**vip*/
                @JsonProperty("Vip")
                private String Vip;

                /**创建时间*/
                @JsonProperty("Created")
                private String Created;

                /**实例类型*/
                @JsonProperty("DBInstanceType")
                private String DBInstanceType;

            }

            /**绑定安全组规则列表*/
            @JsonProperty("SecurityGroupRules")
            private List<SecurityGroupRulesDto> SecurityGroupRules;

            @Data
            @ToString
            public static class SecurityGroupRulesDto {
                /**规则ID*/
                @JsonProperty("SecurityGroupRuleId")
                private String SecurityGroupRuleId;

                /**规则名称*/
                @JsonProperty("SecurityGroupRuleName")
                private String SecurityGroupRuleName;

                /**规则细节(CIDR规则)*/
                @JsonProperty("SecurityGroupRuleProtocol")
                private String SecurityGroupRuleProtocol;

                /**创建时间*/
                @JsonProperty("Created")
                private String Created;

            }

        }

    }

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
