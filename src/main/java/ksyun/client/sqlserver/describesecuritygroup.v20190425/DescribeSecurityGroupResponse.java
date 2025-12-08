package ksyun.client.sqlserver.describesecuritygroup.v20190425;

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
        /***/
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

            /**安全组创建时间*/
            @JsonProperty("Created")
            private String Created;

            /**绑定实例列表*/
            @JsonProperty("Instances")
            private List<InstancesDto> Instances;

            @Data
            @ToString
            public static class InstancesDto {
                /**实例id*/
                @JsonProperty("DBInstanceIdentifier")
                private String DBInstanceIdentifier;

                /**实例名称*/
                @JsonProperty("DBInstanceName")
                private String DBInstanceName;

                /**实例VIP*/
                @JsonProperty("Vip")
                private String Vip;

                /**实例创建时间*/
                @JsonProperty("Created")
                private String Created;

                /**实例类型*/
                @JsonProperty("DBInstanceType")
                private String DBInstanceType;

            }

            /**安全组规则列表*/
            @JsonProperty("SecurityGroupRules")
            private List<SecurityGroupRulesDto> SecurityGroupRules;

            @Data
            @ToString
            public static class SecurityGroupRulesDto {
                /**规则id*/
                @JsonProperty("SecurityGroupRuleId")
                private String SecurityGroupRuleId;

                /**规则描述*/
                @JsonProperty("SecurityGroupRuleName")
                private String SecurityGroupRuleName;

                /**规则详情*/
                @JsonProperty("SecurityGroupRuleProtocol")
                private String SecurityGroupRuleProtocol;

                /**创建时间*/
                @JsonProperty("Created")
                private String Created;

            }

        }

    }

    /**请求id*/
    @JsonProperty("RequestId")
    private String RequestId;

}
