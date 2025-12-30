package ksyun.client.krds.clonesecuritygroup.v20160701;

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

    /**返回源端安全组信息*/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /***/
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
