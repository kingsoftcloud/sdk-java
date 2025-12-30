package ksyun.client.iam.geteffectivepolicies.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname GetEffectivePoliciesResponse
* @Description GetEffectivePolicies 返回体
*/
@Data
@ToString
public class GetEffectivePoliciesResponse extends BaseResponseModel {

    /***/
    @JsonProperty("ListPoliciesResult")
    private ListPoliciesResultDto ListPoliciesResult;

    @Data
    @ToString
    public static class ListPoliciesResultDto {
        /***/
        @JsonProperty("Policies")
        private List<ListPoliciesResultPoliciesDto> Policies;

        @Data
        @ToString
        public static class ListPoliciesResultPoliciesDto {
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

            /**策略文档*/
            @JsonProperty("PolicyDocument")
            private String PolicyDocument;

        }

    }

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
