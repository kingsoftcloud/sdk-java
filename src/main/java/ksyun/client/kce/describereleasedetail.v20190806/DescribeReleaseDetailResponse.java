package ksyun.client.kce.describereleasedetail.v20190806;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeReleaseDetailResponse
* @Description DescribeReleaseDetail 返回体
*/
@Data
@ToString
public class DescribeReleaseDetailResponse extends BaseResponseModel {

    /**请求 Id*/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("ReleaseDetail")
    private ReleaseDetailDto ReleaseDetail;

    @Data
    @ToString
    public static class ReleaseDetailDto {
        /**Helm应用名称*/
        @JsonProperty("ReleaseName")
        private String ReleaseName;

        /**应用状态*/
        @JsonProperty("StatusCode")
        private String StatusCode;

        /**命名空间*/
        @JsonProperty("Namespace")
        private String Namespace;

        /**版本号*/
        @JsonProperty("ReleaseVersion")
        private Integer ReleaseVersion;

        /**创建时间*/
        @JsonProperty("CreateTime")
        private String CreateTime;

        /**上一次部署时间*/
        @JsonProperty("LastDeployTime")
        private String LastDeployTime;

        /**Chart 名称*/
        @JsonProperty("ChartName")
        private String ChartName;

        /**Chart 版本*/
        @JsonProperty("ChartVersion")
        private String ChartVersion;

        /**Chart 命名空间*/
        @JsonProperty("ChartNamespace")
        private String ChartNamespace;

        /**Chart 来源*/
        @JsonProperty("ChartSource")
        private String ChartSource;

        /***/
        @JsonProperty("DeployResources")
        private List<ReleaseDetailDeployResourcesDto> DeployResources;

        @Data
        @ToString
        public static class ReleaseDetailDeployResourcesDto {
            /**资源类型*/
            @JsonProperty("Kind")
            private String Kind;

            /**yaml内容*/
            @JsonProperty("Content")
            private String Content;

            /**资源名称*/
            @JsonProperty("Name")
            private String Name;

            /**资源命名空间*/
            @JsonProperty("Namespace")
            private String Namespace;

        }

        /**Values.yaml内容*/
        @JsonProperty("Values")
        private String Values;

        /**自定义Values.yaml内容*/
        @JsonProperty("CustomValues")
        private String CustomValues;

        /**描述*/
        @JsonProperty("Description")
        private String Description;

        /**Chart仓库地址*/
        @JsonProperty("ChartUrl")
        private String ChartUrl;

    }

}
