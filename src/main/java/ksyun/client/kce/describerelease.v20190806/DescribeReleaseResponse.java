package ksyun.client.kce.describerelease.v20190806;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeReleaseResponse
* @Description DescribeRelease 返回体
*/
@Data
@ToString
public class DescribeReleaseResponse extends BaseResponseModel {
    /**请求 Id*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**Helm3应用实体*/
    @JsonProperty("Releases")
    private List<ReleasesDto> Releases;

    @Data
    @ToString
    public static class ReleasesDto {
        /**Helm3 应用名称*/
        @JsonProperty("ReleaseName")
        private String ReleaseName;

        /**Helm3应用状态*/
        @JsonProperty("StatusCode")
        private String StatusCode;

        /**命名空间*/
        @JsonProperty("Namespace")
        private String Namespace;

        /**创建时间*/
        @JsonProperty("CreateTime")
        private String CreateTime;

        /**Chart 仓库名称*/
        @JsonProperty("ChartName")
        private String ChartName;

        /**Chart 版本*/
        @JsonProperty("ChartVersion")
        private String ChartVersion;

        /**Chart 来源*/
        @JsonProperty("ChartSource")
        private String ChartSource;

        /**Chart 命名空间*/
        @JsonProperty("ChartNamespace")
        private String ChartNamespace;

    }

    /**版本号*/
    @JsonProperty("ReleaseVersion")
    private Integer ReleaseVersion;

}
