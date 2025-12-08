package ksyun.client.kce.describereponamespace.v20180314;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeRepoNamespaceResponse
* @Description DescribeRepoNamespace 返回体
*/
@Data
@ToString
public class DescribeRepoNamespaceResponse extends BaseResponseModel {
    /**请求id*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**分页标识，如果调用未返回全部实例，标记下次调用的返回值的起点，如果已返回全部实例，则其值为0*/
    @JsonProperty("Marker")
    private Integer Marker;

    /**单词调用返回的最大实例数*/
    @JsonProperty("MaxResults")
    private Integer MaxResults;

    /**6*/
    @JsonProperty("TotalCount")
    private Integer TotalCount;

    /***/
    @JsonProperty("NamespaceSet")
    private List<NamespaceSetDto> NamespaceSet;

    @Data
    @ToString
    public static class NamespaceSetDto {
        /**命名空间名称*/
        @JsonProperty("Namespace")
        private String Namespace;

        /**命名空间类属性*/
        @JsonProperty("Public")
        private Boolean PublicField;

        /**命名空间下的镜像仓库数量*/
        @JsonProperty("RepoCount")
        private Integer RepoCount;

        /**命名空间下的Helm Charts数目*/
        @JsonProperty("ChartCount")
        private Integer ChartCount;

        /**命名空间创建时间*/
        @JsonProperty("CreateTime")
        private String CreateTime;

    }

}
