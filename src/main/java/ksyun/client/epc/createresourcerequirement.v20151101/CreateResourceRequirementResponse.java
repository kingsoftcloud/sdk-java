package ksyun.client.epc.createresourcerequirement.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateResourceRequirementResponse
* @Description CreateResourceRequirement 返回体
*/
@Data
@ToString
public class CreateResourceRequirementResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**资源需求信息*/
    @JsonProperty("ResourceRequirement")
    private ResourceRequirementDto ResourceRequirement;

    @Data
    @ToString
    public static class ResourceRequirementDto {
        /**资源需求ID*/
        @JsonProperty("ResourceRequirementId")
        private String ResourceRequirementId;

        /**云物理主机机型*/
        @JsonProperty("HostType")
        private String HostType;

        /**机房信息*/
        @JsonProperty("Region")
        private String Region;

        /**可用区*/
        @JsonProperty("AvailabilityZone")
        private String AvailabilityZone;

        /**服务器需求数量*/
        @JsonProperty("RequirementCount")
        private Integer RequirementCount;

        /**预留服务器数量*/
        @JsonProperty("ReserveCount")
        private Integer ReserveCount;

        /**项目名称*/
        @JsonProperty("ProjectName")
        private String ProjectName;

        /**期望交付时间*/
        @JsonProperty("UsageDate")
        private String UsageDate;

        /**备注*/
        @JsonProperty("Description")
        private String Description;

        /**创建时间*/
        @JsonProperty("CreateTime")
        private String CreateTime;

        /**工单进展*/
        @JsonProperty("Progress")
        private String Progress;

        /**价格信息*/
        @JsonProperty("ResourceRequirementCommunicationContentSet")
        private List<resourceRequirementCommunicationContentSetDto1> ResourceRequirementCommunicationContentSet;

        @Data
        @ToString
        public static class resourceRequirementCommunicationContentSetDto1 {
            /**评论或回复*/
            @JsonProperty("Remarks")
            private String Remarks;

            /**作者*/
            @JsonProperty("Author")
            private String Author;

            /**创建时间*/
            @JsonProperty("CreateTime")
            private String CreateTime;

        }

    }

}
