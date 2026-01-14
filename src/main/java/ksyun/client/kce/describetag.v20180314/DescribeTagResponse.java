package ksyun.client.kce.describetag.v20180314;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeTagResponse
* @Description DescribeTag 返回体
*/
@Data
@ToString
public class DescribeTagResponse extends BaseResponseModel {

    /**请求id*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**分页标识，单次调用未返回全部实例时，标记下次调用的返回值的起点，默认值是0。*/
    @JsonProperty("Marker")
    private Integer Marker;

    /**单次调用所返回的最大实例数目*/
    @JsonProperty("MaxResults")
    private Integer MaxResults;

    /**返回的仓库tag数目*/
    @JsonProperty("TotalCount")
    private Integer TotalCount;

    /***/
    @JsonProperty("TagSet")
    private List<TagSetDto> TagSet;

    @Data
    @ToString
    public static class TagSetDto {
        /**镜像仓库名称*/
        @JsonProperty("RepoName")
        private String RepoName;

        /**tag名称*/
        @JsonProperty("TagName")
        private String TagName;

        /**镜像id*/
        @JsonProperty("ImageId")
        private String ImageId;

        /**仓库创建时间*/
        @JsonProperty("CreateTime")
        private String CreateTime;

        /**镜像大小，单位为字节*/
        @JsonProperty("SizeByte")
        private Long SizeByte;

        /**镜像制作者*/
        @JsonProperty("Author")
        private String Author;

        /**docker客户端版本*/
        @JsonProperty("DockerVersion")
        private String DockerVersion;

        /**cpu架构*/
        @JsonProperty("Architecture")
        private String Architecture;

        /**操作系统*/
        @JsonProperty("Os")
        private String Os;

    }

}
