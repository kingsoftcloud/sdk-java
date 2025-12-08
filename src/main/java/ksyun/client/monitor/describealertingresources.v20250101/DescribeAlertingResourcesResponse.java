package ksyun.client.monitor.describealertingresources.v20250101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeAlertingResourcesResponse
* @Description DescribeAlertingResources 返回体
*/
@Data
@ToString
public class DescribeAlertingResourcesResponse extends BaseResponseModel {
    /***/
    @JsonProperty("ResponseMetadata")
    private ResponseMetadataDto ResponseMetadata;

    @Data
    @ToString
    public static class ResponseMetadataDto {
        /**请求ID。*/
        @JsonProperty("RequestID")
        private String RequestID;

    }

    /***/
    @JsonProperty("AlertingProductSet")
    private List<AlertingProductSetDto> AlertingProductSet;

    @Data
    @ToString
    public static class AlertingProductSetDto {
        /**命名空间。*/
        @JsonProperty("Namespace")
        private String Namespace;

        /**告警产品类型。*/
        @JsonProperty("ProductType")
        private Integer ProductType;

        /**告警产品名称。*/
        @JsonProperty("ProductName")
        private String ProductName;

        /**正在告警资源列表。*/
        @JsonProperty("ResourceSet")
        private List<AlertingProductSetDtoResourceSetDto> ResourceSet;

        @Data
        @ToString
        public static class AlertingProductSetDtoResourceSetDto {
            /**实例ID。*/
            @JsonProperty("InstanceId")
            private String InstanceId;

            /**实例名称。*/
            @JsonProperty("InstanceName")
            private String InstanceName;

            /**实例IP。*/
            @JsonProperty("InstanceIP")
            private String InstanceIP;

            /**实例标签。*/
            @JsonProperty("InstanceTags")
            private List<AlertingProductSetDtoResourceSetDtoInstanceTagsDto> InstanceTags;

            @Data
            @ToString
            public static class AlertingProductSetDtoResourceSetDtoInstanceTagsDto {
                /**资源类型。*/
                @JsonProperty("ResourceType")
                private String ResourceType;

                /**资源ID。*/
                @JsonProperty("ResourceId")
                private String ResourceId;

                /**标签名称。*/
                @JsonProperty("Key")
                private String Key;

                /**标签值。*/
                @JsonProperty("Value")
                private String Value;

            }

            /**项目制ID。*/
            @JsonProperty("ProjectID")
            private Integer ProjectID;

            /**资源所在机房。*/
            @JsonProperty("Region")
            private String Region;

            /**正在告警策略列表。*/
            @JsonProperty("Policies")
            private List<AlertingProductSetDtoResourceSetDtoPoliciesDto> Policies;

            @Data
            @ToString
            public static class AlertingProductSetDtoResourceSetDtoPoliciesDto {
                /**策略ID。*/
                @JsonProperty("PolicyId")
                private Integer PolicyId;

                /**策略名称。*/
                @JsonProperty("PolicyName")
                private String PolicyName;

                /**告警规则说明。*/
                @JsonProperty("PolicyRule")
                private String PolicyRule;

                /**触发阈值。*/
                @JsonProperty("CurValue")
                private Integer CurValue;

                /**告警状态。

> 取值范围
> - **0**: 告警恢复;
> - **1**: 告警发生;*/
                @JsonProperty("AlarmState")
                private Integer AlarmState;

                /**告警触发时间。*/
                @JsonProperty("TriggerTime")
                private String TriggerTime;

                /**告警持续时间。*/
                @JsonProperty("Duration")
                private String Duration;

            }

            /**关联资源列表。*/
            @JsonProperty("RelatedResourceSet")
            private List<AlertingProductSetDtoResourceSetDtoRelatedResourceSetDto> RelatedResourceSet;

            @Data
            @ToString
            public static class AlertingProductSetDtoResourceSetDtoRelatedResourceSetDto {
                /**关联资源命名空间。*/
                @JsonProperty("Namespace")
                private String Namespace;

                /**关联资源实例ID。*/
                @JsonProperty("InstanceID")
                private String InstanceID;

            }

        }

    }

}
