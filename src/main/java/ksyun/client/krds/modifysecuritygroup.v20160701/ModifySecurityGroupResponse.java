package ksyun.client.krds.modifysecuritygroup.v20160701;

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
    /**返回操作安全组详情*/
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
            /***/
            @JsonProperty("SecurityGroupId")
            private String SecurityGroupId;

            /***/
            @JsonProperty("SecurityGroupName")
            private String SecurityGroupName;

            /***/
            @JsonProperty("SecurityGroupDescription")
            private String SecurityGroupDescription;

            /***/
            @JsonProperty("SecurityGroupType")
            private String SecurityGroupType;

            /***/
            @JsonProperty("Created")
            private String Created;

            /***/
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

            }

            /***/
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
