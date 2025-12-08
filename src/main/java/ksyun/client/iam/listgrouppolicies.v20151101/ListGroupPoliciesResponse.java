package ksyun.client.iam.listgrouppolicies.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ListGroupPoliciesResponse
* @Description ListGroupPolicies 返回体
*/
@Data
@ToString
public class ListGroupPoliciesResponse extends BaseResponseModel {
    /***/
    @JsonProperty("ListGroupPoliciesResult")
    private ListGroupPoliciesResultDto ListGroupPoliciesResult;

    @Data
    @ToString
    public static class ListGroupPoliciesResultDto {
        /***/
        @JsonProperty("AttachedPolicies")
        private ListGroupPoliciesResultDtoAttachedPoliciesDto AttachedPolicies;

        @Data
        @ToString
        public static class ListGroupPoliciesResultDtoAttachedPoliciesDto {
            /***/
            @JsonProperty("member")
            private List<ListGroupPoliciesResultDtoAttachedPoliciesDtoMemberDto> Member;

            @Data
            @ToString
            public static class ListGroupPoliciesResultDtoAttachedPoliciesDtoMemberDto {
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
