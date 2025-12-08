package ksyun.client.iam.listaccesskeys.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ListAccessKeysResponse
* @Description ListAccessKeys 返回体
*/
@Data
@ToString
public class ListAccessKeysResponse extends BaseResponseModel {
    /***/
    @JsonProperty("ListAccessKeyResult")
    private ListAccessKeyResultDto ListAccessKeyResult;

    @Data
    @ToString
    public static class ListAccessKeyResultDto {
        /***/
        @JsonProperty("AccessKeyMetadata")
        private AccessKeyMetadataDto AccessKeyMetadata;

        @Data
        @ToString
        public static class AccessKeyMetadataDto {
            /***/
            @JsonProperty("member")
            private List<MemberDto> Member;

            @Data
            @ToString
            public static class MemberDto {
                /***/
                @JsonProperty("UserName")
                private String UserName;

                /***/
                @JsonProperty("AccessKeyId")
                private String AccessKeyId;

                /***/
                @JsonProperty("Status")
                private String Status;

                /***/
                @JsonProperty("CreateDate")
                private String CreateDate;

                /***/
                @JsonProperty("AkLastUsedTime")
                private String AkLastUsedTime;

            }

        }

    }

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
