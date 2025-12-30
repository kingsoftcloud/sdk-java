package ksyun.client.kmr.listclusterversions.v20210902;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ListClusterVersionsResponse
* @Description ListClusterVersions 返回体
*/
@Data
@ToString
public class ListClusterVersionsResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**版本信息*/
    @JsonProperty("Versions")
    private List<VersionsDto> Versions;

    @Data
    @ToString
    public static class VersionsDto {
        /**版本ID*/
        @JsonProperty("Id")
        private String Id;

        /**产品版本号*/
        @JsonProperty("Version")
        private String Version;

        /**服务信息*/
        @JsonProperty("Services")
        private List<VersionsServicesDto> Services;

        @Data
        @ToString
        public static class VersionsServicesDto {
            /**组件名称*/
            @JsonProperty("Name")
            private String Name;

            /**组件版本*/
            @JsonProperty("Version")
            private String Version;

            /**是否必选*/
            @JsonProperty("Essential")
            private Boolean Essential;

            /**是否是系统服务*/
            @JsonProperty("IsSystem")
            private Boolean IsSystem;

            /**依赖服务*/
            @JsonProperty("DependencyServices")
            private String DependencyServices;

        }

    }

    /***/
    @JsonProperty("InstanceGroupRequirements")
    private List<InstanceGroupRequirementsDto> InstanceGroupRequirements;

    @Data
    @ToString
    public static class InstanceGroupRequirementsDto {
        /**节点组名称*/
        @JsonProperty("Name")
        private String Name;

        /**是否必选*/
        @JsonProperty("Essential")
        private Boolean Essential;

        /**是否是主节点组*/
        @JsonProperty("IsPrimary")
        private Boolean IsPrimary;

        /**是否支持异构*/
        @JsonProperty("Isomerism")
        private Boolean Isomerism;

        /**最大节点数*/
        @JsonProperty("Max")
        private Integer Max;

        /**最小节点数*/
        @JsonProperty("Min")
        private Integer Min;

        /**扩容步长*/
        @JsonProperty("Step")
        private Integer Step;

    }

    /**状态码*/
    @JsonProperty("StatusCode")
    private Integer StatusCode;

}
