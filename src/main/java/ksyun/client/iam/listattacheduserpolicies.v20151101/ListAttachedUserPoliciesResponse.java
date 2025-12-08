package ksyun.client.iam.listattacheduserpolicies.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ListAttachedUserPoliciesResponse
* @Description ListAttachedUserPolicies 返回体
*/
@Data
@ToString
public class ListAttachedUserPoliciesResponse extends BaseResponseModel {
    /***/
    @JsonProperty("ListAttachedUserPoliciesResult")
    private ListAttachedUserPoliciesResultDto ListAttachedUserPoliciesResult;

    @Data
    @ToString
    public static class ListAttachedUserPoliciesResultDto {
        /***/
        @JsonProperty("AttachedPolicies")
        private ListAttachedUserPoliciesResultDtoAttachedPoliciesDto AttachedPolicies;

        @Data
        @ToString
        public static class ListAttachedUserPoliciesResultDtoAttachedPoliciesDto {
            /***/
            @JsonProperty("member")
            private List<ListAttachedUserPoliciesResultDtoAttachedPoliciesDtoMemberDto> Member;

            @Data
            @ToString
            public static class ListAttachedUserPoliciesResultDtoAttachedPoliciesDtoMemberDto {
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
