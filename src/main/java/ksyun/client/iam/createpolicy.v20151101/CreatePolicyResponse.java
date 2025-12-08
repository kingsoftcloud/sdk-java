package ksyun.client.iam.createpolicy.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreatePolicyResponse
* @Description CreatePolicy 返回体
*/
@Data
@ToString
public class CreatePolicyResponse extends BaseResponseModel {
    /***/
    @JsonProperty("CreatePolicyResult")
    private CreatePolicyResultDto CreatePolicyResult;

    @Data
    @ToString
    public static class CreatePolicyResultDto {
        /***/
        @JsonProperty("Policy")
        private CreatePolicyResultDtoPolicyDto Policy;

        @Data
        @ToString
        public static class CreatePolicyResultDtoPolicyDto {
            /***/
            @JsonProperty("AttachmentCount")
            private String AttachmentCount;

            /***/
            @JsonProperty("CreateDate")
            private String CreateDate;

            /***/
            @JsonProperty("DefaultVersionId")
            private String DefaultVersionId;

            /***/
            @JsonProperty("Description")
            private String Description;

            /***/
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

            /***/
            @JsonProperty("UpdateDate")
            private String UpdateDate;

        }

    }

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
