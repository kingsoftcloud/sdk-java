package ksyun.client.waf.createaccesscontrolrule.v20200707;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateAccessControlRuleResponse
* @Description CreateAccessControlRule 返回体
*/
@Data
@ToString
public class CreateAccessControlRuleResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("AccessControlRule")
    private AccessControlRuleDto AccessControlRule;

    @Data
    @ToString
    public static class AccessControlRuleDto {
        /***/
        @JsonProperty("RuleType")
        private String RuleType;

        /***/
        @JsonProperty("MatchRule")
        private Integer MatchRule;

        /***/
        @JsonProperty("ArgName")
        private String ArgName;

        /***/
        @JsonProperty("RuleData")
        private String RuleData;

        /***/
        @JsonProperty("Status")
        private Boolean Status;

        /***/
        @JsonProperty("Priority")
        private Integer Priority;

        /***/
        @JsonProperty("RuleAction")
        private Integer RuleAction;

        /***/
        @JsonProperty("MatchRuleInfo")
        private String MatchRuleInfo;

        /***/
        @JsonProperty("Level")
        private Integer Level;

        /***/
        @JsonProperty("ResourceRecordId")
        private String ResourceRecordId;

        /***/
        @JsonProperty("RuleName")
        private String RuleName;

        /***/
        @JsonProperty("RuleId")
        private String RuleId;

    }

}
