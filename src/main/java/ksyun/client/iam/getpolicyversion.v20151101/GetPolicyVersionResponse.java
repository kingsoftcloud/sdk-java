package ksyun.client.iam.getpolicyversion.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname GetPolicyVersionResponse
* @Description GetPolicyVersion 返回体
*/
@Data
@ToString
public class GetPolicyVersionResponse extends BaseResponseModel {

    /***/
    @JsonProperty("GetPolicyVersionResult")
    private GetPolicyVersionResultDto GetPolicyVersionResult;

    @Data
    @ToString
    public static class GetPolicyVersionResultDto {
        /***/
        @JsonProperty("PolicyVersion")
        private GetPolicyVersionResultPolicyVersionDto PolicyVersion;

        @Data
        @ToString
        public static class GetPolicyVersionResultPolicyVersionDto {
            /***/
            @JsonProperty("IsDefaultVersion")
            private String IsDefaultVersion;

            /***/
            @JsonProperty("VersionId")
            private String VersionId;

            /***/
            @JsonProperty("Document")
            private String Document;

            /***/
            @JsonProperty("PolicyStruct")
            private List<String> PolicyStruct;

            /***/
            @JsonProperty("CreateDate")
            private String CreateDate;

        }

    }

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
