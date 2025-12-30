package ksyun.client.krds.deletesecuritygroup.v20200825;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeleteSecurityGroupResponse
* @Description DeleteSecurityGroup 返回体
*/
@Data
@ToString
public class DeleteSecurityGroupResponse extends BaseResponseModel {

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
        private List<DataSecurityGroupsDto> SecurityGroups;

        @Data
        @ToString
        public static class DataSecurityGroupsDto {
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
            private List<DataSecurityGroupsInstancesDto> Instances;

            @Data
            @ToString
            public static class DataSecurityGroupsInstancesDto {
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
            private List<DataSecurityGroupsSecurityGroupRulesDto> SecurityGroupRules;

            @Data
            @ToString
            public static class DataSecurityGroupsSecurityGroupRulesDto {
                /***/
                @JsonProperty("SecurityGroupRuleId")
                private String SecurityGroupRuleId;

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

    /**请求ID	
–*/
    @JsonProperty("RequestId")
    private String RequestId;

}
