package ksyun.client.kce.describeinstanceimage.v20190806;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeInstanceImageResponse
* @Description DescribeInstanceImage 返回体
*/
@Data
@ToString
public class DescribeInstanceImageResponse extends BaseResponseModel {
    /***/
    @JsonProperty("ImageSet")
    private List<ImageSetDto> ImageSet;

    @Data
    @ToString
    public static class ImageSetDto {
        /**镜像id*/
        @JsonProperty("ImageId")
        private String ImageId;

        /**节点镜像名称*/
        @JsonProperty("ImageName")
        private String ImageName;

        /**镜像类型，枚举为public：标准镜像，private：自定义镜像*/
        @JsonProperty("ImageType")
        private String ImageType;

        /**该镜像支持的k8s版本列表，用于限制创建集群、添加节点、添加已有节点、创建节点池、修改节点池模板操作。
列表为空时，说明无限制。*/
        @JsonProperty("MatchedK8sVersions")
        private List<String> MatchedK8sVersions;

    }

    /**返回的镜像总数*/
    @JsonProperty("TotalCount")
    private Integer TotalCount;

    /**请求id*/
    @JsonProperty("RequestId")
    private String RequestId;

}
