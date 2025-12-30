package ksyun.client.iam.listattachedrolepolicies.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ListAttachedRolePoliciesResponse
* @Description ListAttachedRolePolicies 返回体
*/
@Data
@ToString
public class ListAttachedRolePoliciesResponse extends BaseResponseModel {

    /***/
    @JsonProperty("ListAttachedRolePoliciesResult")
    private ListAttachedRolePoliciesResultDto ListAttachedRolePoliciesResult;

    @Data
    @ToString
    public static class ListAttachedRolePoliciesResultDto {
        /***/
        @JsonProperty("AttachedPolicies")
        private ListAttachedRolePoliciesResultAttachedPoliciesDto AttachedPolicies;

        @Data
        @ToString
        public static class ListAttachedRolePoliciesResultAttachedPoliciesDto {
            /***/
            @JsonProperty("member")
            private List<ListAttachedRolePoliciesResultAttachedPoliciesMemberDto> Member;

            @Data
            @ToString
            public static class ListAttachedRolePoliciesResultAttachedPoliciesMemberDto {
                /***/
                @JsonProperty("PolicyKrn")
                private String PolicyKrn;

                /***/
                @JsonProperty("PolicyName")
                private String PolicyName;

                /***/
                @JsonProperty("CreateTime")
                private String CreateTime;

                /***/
                @JsonProperty("Description")
                private String Description;

                /***/
                @JsonProperty("Description_en")
                private String Description_en;

                /***/
                @JsonProperty("Type")
                private Integer Type;

            }

        }

        /***/
        @JsonProperty("IsTruncated")
        private Boolean IsTruncated;

        /***/
        @JsonProperty("Marker")
        private String Marker;

    }

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
