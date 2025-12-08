package ksyun.client.postgresql.clonesecuritygroup.v20181225;

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
    /***/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /***/
        @JsonProperty("SecurityGroups")
        private List<DataDtoSecurityGroupsDto> SecurityGroups;

        @Data
        @ToString
        public static class DataDtoSecurityGroupsDto {
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

            /**绑定实例信息*/
            @JsonProperty("Instances")
            private List<String> Instances;

            /**安全组规则列表*/
            @JsonProperty("SecurityGroupRules")
            private List<DataDtoSecurityGroupsDtoSecurityGroupRulesDto> SecurityGroupRules;

            @Data
            @ToString
            public static class DataDtoSecurityGroupsDtoSecurityGroupRulesDto {
                /**安全组规则ID*/
                @JsonProperty("SecurityGroupRuleId")
                private String SecurityGroupRuleId;

                /**安全组规则协议(cidr规则)*/
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
