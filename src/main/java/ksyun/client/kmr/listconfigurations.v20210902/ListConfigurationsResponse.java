package ksyun.client.kmr.listconfigurations.v20210902;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ListConfigurationsResponse
* @Description ListConfigurations 返回体
*/
@Data
@ToString
public class ListConfigurationsResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**集群ID*/
    @JsonProperty("ClusterId")
    private String ClusterId;

    /**服务名称*/
    @JsonProperty("ServiceName")
    private String ServiceName;

    /**配置组*/
    @JsonProperty("ConfigGroups")
    private List<ConfigGroupsDto> ConfigGroups;

    @Data
    @ToString
    public static class ConfigGroupsDto {
        /**配置组ID*/
        @JsonProperty("Id")
        private String Id;

        /**配置所属节点组ID*/
        @JsonProperty("InstanceGroupId")
        private String InstanceGroupId;

        /**配置信息*/
        @JsonProperty("ConfigTags")
        private List<ConfigGroupsConfigTagsDto> ConfigTags;

        @Data
        @ToString
        public static class ConfigGroupsConfigTagsDto {
            /**配置文件名*/
            @JsonProperty("Tag")
            private String Tag;

            /**配置文件具体配置项*/
            @JsonProperty("Configurations")
            private List<ConfigGroupsConfigTagsConfigurationsDto> Configurations;

            @Data
            @ToString
            public static class ConfigGroupsConfigTagsConfigurationsDto {
                /**配置项名*/
                @JsonProperty("Key")
                private String Key;

                /**配置项值*/
                @JsonProperty("Value")
                private String Value;

                /**是否为通用配置*/
                @JsonProperty("Custom")
                private Boolean Custom;

                /**描述*/
                @JsonProperty("Description")
                private String Description;

                /**关联配置项*/
                @JsonProperty("RelatedKey")
                private String RelatedKey;

                /**更新时间*/
                @JsonProperty("UpdateTime")
                private String UpdateTime;

            }

        }

    }

    /**状态码*/
    @JsonProperty("StatusCode")
    private Integer StatusCode;

}
