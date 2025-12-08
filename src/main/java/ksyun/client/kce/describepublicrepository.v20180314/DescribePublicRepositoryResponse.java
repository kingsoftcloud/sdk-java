package ksyun.client.kce.describepublicrepository.v20180314;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribePublicRepositoryResponse
* @Description DescribePublicRepository 返回体
*/
@Data
@ToString
public class DescribePublicRepositoryResponse extends BaseResponseModel {
    /**请求id*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**分页标识，如果调用未返回全部实例，标记下次调用的返回值的起点，如果已返回全部实例，则其值为0。*/
    @JsonProperty("Marker")
    private Integer Marker;

    /**单词调用返回的最大实例数*/
    @JsonProperty("MaxResults")
    private Integer MaxResults;

    /**返回的仓库数目*/
    @JsonProperty("TotalCount")
    private Integer TotalCount;

    /***/
    @JsonProperty("RepoSet")
    private List<RepoSetDto> RepoSet;

    @Data
    @ToString
    public static class RepoSetDto {
        /**镜像仓库名称*/
        @JsonProperty("RepoName")
        private String RepoName;

        /**镜像仓库属性*/
        @JsonProperty("Public")
        private Boolean PublicField;

        /**收藏次数*/
        @JsonProperty("FavorCount")
        private Integer FavorCount;

        /**下载次数*/
        @JsonProperty("PullCount")
        private Integer PullCount;

        /**仓库描述信息*/
        @JsonProperty("Description")
        private String Description;

        /**仓库创建时间*/
        @JsonProperty("CreateTime")
        private String CreateTime;

    }

}
