package ksyun.client.iam.createpolicyversion.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreatePolicyVersionResponse
* @Description CreatePolicyVersion 返回体
*/
@Data
@ToString
public class CreatePolicyVersionResponse extends BaseResponseModel {

    /***/
    @JsonProperty("CreatePolicyVersionResult")
    private CreatePolicyVersionResultDto CreatePolicyVersionResult;

    @Data
    @ToString
    public static class CreatePolicyVersionResultDto {
        /***/
        @JsonProperty("PolicyVersion")
        private CreatePolicyVersionResultPolicyVersionDto PolicyVersion;

        @Data
        @ToString
        public static class CreatePolicyVersionResultPolicyVersionDto {
            /**是否默认策略版本*/
            @JsonProperty("IsDefaultVersion")
            private String IsDefaultVersion;

            /**策略版本号*/
            @JsonProperty("VersionId")
            private String VersionId;

            /**创建时间*/
            @JsonProperty("CreateDate")
            private String CreateDate;

        }

    }

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
