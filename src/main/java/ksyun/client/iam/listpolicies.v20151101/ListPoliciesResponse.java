package ksyun.client.iam.listpolicies.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ListPoliciesResponse
* @Description ListPolicies 返回体
*/
@Data
@ToString
public class ListPoliciesResponse extends BaseResponseModel {

    /***/
    @JsonProperty("ListPoliciesResult")
    private ListPoliciesResultDto ListPoliciesResult;

    @Data
    @ToString
    public static class ListPoliciesResultDto {
        /***/
        @JsonProperty("Policies")
        private ListPoliciesResultPoliciesDto Policies;

        @Data
        @ToString
        public static class ListPoliciesResultPoliciesDto {
            /***/
            @JsonProperty("member")
            private List<ListPoliciesResultPoliciesMemberDto> Member;

            @Data
            @ToString
            public static class ListPoliciesResultPoliciesMemberDto {
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
                @JsonProperty("ServiceId")
                private Integer ServiceId;

                /***/
                @JsonProperty("ServiceName")
                private String ServiceName;

                /***/
                @JsonProperty("ServiceViewName")
                private String ServiceViewName;

                /***/
                @JsonProperty("PolicyType")
                private Integer PolicyType;

                /***/
                @JsonProperty("CreateMode")
                private Integer CreateMode;

                /***/
                @JsonProperty("UpdateDate")
                private String UpdateDate;

                /***/
                @JsonProperty("AttachmentCount")
                private Integer AttachmentCount;

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
