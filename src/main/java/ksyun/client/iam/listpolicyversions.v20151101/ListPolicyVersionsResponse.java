package ksyun.client.iam.listpolicyversions.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ListPolicyVersionsResponse
* @Description ListPolicyVersions 返回体
*/
@Data
@ToString
public class ListPolicyVersionsResponse extends BaseResponseModel {

    /***/
    @JsonProperty("ListPolicyVersionsResult")
    private ListPolicyVersionsResultDto ListPolicyVersionsResult;

    @Data
    @ToString
    public static class ListPolicyVersionsResultDto {
        /***/
        @JsonProperty("Versions")
        private ListPolicyVersionsResultVersionsDto Versions;

        @Data
        @ToString
        public static class ListPolicyVersionsResultVersionsDto {
            /***/
            @JsonProperty("member")
            private List<ListPolicyVersionsResultVersionsMemberDto> Member;

            @Data
            @ToString
            public static class ListPolicyVersionsResultVersionsMemberDto {
                /**是否默认版本*/
                @JsonProperty("IsDefaultVersion")
                private String IsDefaultVersion;

                /**策略版本号*/
                @JsonProperty("VersionId")
                private String VersionId;

                /**策略内容*/
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

    }

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
