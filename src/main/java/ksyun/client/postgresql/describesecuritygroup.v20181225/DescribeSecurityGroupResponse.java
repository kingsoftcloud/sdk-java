package ksyun.client.postgresql.describesecuritygroup.v20181225;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeSecurityGroupResponse
* @Description DescribeSecurityGroup 返回体
*/
@Data
@ToString
public class DescribeSecurityGroupResponse extends BaseResponseModel {
    /***/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /**安全组列表*/
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

            /**安全组说明*/
            @JsonProperty("SecurityGroupDescription")
            private String SecurityGroupDescription;

            /**创建时间*/
            @JsonProperty("Created")
            private String Created;

            /**安全组绑定实例信息*/
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

                /**Vip*/
                @JsonProperty("Vip")
                private String Vip;

                /**创建时间*/
                @JsonProperty("Created")
                private String Created;

                /**实例类型*/
                @JsonProperty("DBInstanceType")
                private String DBInstanceType;

            }

            /**安全组绑定规则列表*/
            @JsonProperty("SecurityGroupRules")
            private List<SecurityGroupRulesDto> SecurityGroupRules;

            @Data
            @ToString
            public static class SecurityGroupRulesDto {
                /**安全组规则ID*/
                @JsonProperty("SecurityGroupRuleId")
                private String SecurityGroupRuleId;

                /**安全组规则协议(cidr规则)*/
                @JsonProperty("SecurityGroupRuleProtocol")
                private String SecurityGroupRuleProtocol;

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
