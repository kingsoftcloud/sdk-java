package ksyun.client.iam.getpolicy.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname GetPolicyResponse
* @Description GetPolicy 返回体
*/
@Data
@ToString
public class GetPolicyResponse extends BaseResponseModel {
    /***/
    @JsonProperty("GetPolicyResult")
    private GetPolicyResultDto GetPolicyResult;

    @Data
    @ToString
    public static class GetPolicyResultDto {
        /***/
        @JsonProperty("Policy")
        private PolicyDto Policy;

        @Data
        @ToString
        public static class PolicyDto {
            /***/
            @JsonProperty("CreateDate")
            private String CreateDate;

            /**策略默认版本*/
            @JsonProperty("DefaultVersionId")
            private String DefaultVersionId;

            /***/
            @JsonProperty("Description")
            private String Description;

            /**策略krn*/
            @JsonProperty("Krn")
            private String Krn;

            /***/
            @JsonProperty("Path")
            private String Path;

            /***/
            @JsonProperty("PolicyId")
            private String PolicyId;

            /***/
            @JsonProperty("PolicyName")
            private String PolicyName;

            /**策略类型：1系统策略，2自定义策略
*/
            @JsonProperty("PolicyType")
            private Integer PolicyType;

            /***/
            @JsonProperty("CreateMode")
            private Integer CreateMode;

            /***/
            @JsonProperty("UpdateDate")
            private String UpdateDate;

        }

    }

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
