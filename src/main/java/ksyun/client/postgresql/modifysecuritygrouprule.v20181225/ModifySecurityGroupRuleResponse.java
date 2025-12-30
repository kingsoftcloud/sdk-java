package ksyun.client.postgresql.modifysecuritygrouprule.v20181225;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ModifySecurityGroupRuleResponse
* @Description ModifySecurityGroupRule 返回体
*/
@Data
@ToString
public class ModifySecurityGroupRuleResponse extends BaseResponseModel {

    /***/
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
            @JsonProperty("Created")
            private String Created;

            /***/
            @JsonProperty("Instances")
            private List<String> Instances;

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
                @JsonProperty("Created")
                private String Created;

            }

        }

    }

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
