package ksyun.client.kcrs.describerepository.v20211109;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeRepositoryResponse
* @Description DescribeRepository 返回体
*/
@Data
@ToString
public class DescribeRepositoryResponse extends BaseResponseModel {
    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**单次调用返回的最大实例数*/
    @JsonProperty("MaxResults")
    private Integer MaxResults;

    /**分页标识，如果调用未返回全部实例，标记下次调用的返回值的起点，如果已返回全部实例，则其值为0*/
    @JsonProperty("Marker")
    private Integer Marker;

    /**镜像仓库数量*/
    @JsonProperty("TotalCount")
    private Integer TotalCount;

    /**响应实体类*/
    @JsonProperty("RepoSet")
    private List<RepoSetDto> RepoSet;

    @Data
    @ToString
    public static class RepoSetDto {
        /**镜像仓库名字*/
        @JsonProperty("RepoName")
        private String RepoName;

        /**镜像仓库所属命名空间的属性，有效值：

True：公有
False：私有*/
        @JsonProperty("Public")
        private Boolean PublicField;

        /**创建时间*/
        @JsonProperty("CreateTime")
        private String CreateTime;

        /**更新时间*/
        @JsonProperty("UpdateTime")
        private String UpdateTime;

        /**镜像仓库描述信息*/
        @JsonProperty("Desc")
        private String Desc;

    }

}
