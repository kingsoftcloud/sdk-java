package ksyun.client.kcrs.describenamespace.v20211109;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeNamespaceResponse
* @Description DescribeNamespace 返回体
*/
@Data
@ToString
public class DescribeNamespaceResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**每个分页的最大条目数*/
    @JsonProperty("MaxResults")
    private Integer MaxResults;

    /**当前页码*/
    @JsonProperty("Marker")
    private Integer Marker;

    /**条目总数*/
    @JsonProperty("TotalCount")
    private Integer TotalCount;

    /***/
    @JsonProperty("NamespaceSet")
    private List<NamespaceSetDto> NamespaceSet;

    @Data
    @ToString
    public static class NamespaceSetDto {
        /**命名空间*/
        @JsonProperty("Namespace")
        private String Namespace;

        /**是否是公开的*/
        @JsonProperty("Public")
        private Boolean PublicField;

        /**镜像仓库数量*/
        @JsonProperty("RepoCount")
        private String RepoCount;

        /**创建时间*/
        @JsonProperty("CreateTime")
        private String CreateTime;

    }

}
