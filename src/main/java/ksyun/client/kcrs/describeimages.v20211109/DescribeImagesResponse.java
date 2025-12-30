package ksyun.client.kcrs.describeimages.v20211109;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeImagesResponse
* @Description DescribeImages 返回体
*/
@Data
@ToString
public class DescribeImagesResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**单次调用所返回的最大实例数目*/
    @JsonProperty("MaxResults")
    private Integer MaxResults;

    /**分页标识，单次调用未返回全部实例时，标记下次调用的返回值的起点，默认值是0*/
    @JsonProperty("Marker")
    private Integer Marker;

    /**镜像数量*/
    @JsonProperty("TotalCount")
    private Integer TotalCount;

    /**实体响应类*/
    @JsonProperty("ImageSet")
    private List<ImageSetDto> ImageSet;

    @Data
    @ToString
    public static class ImageSetDto {
        /**镜像Id*/
        @JsonProperty("ImageId")
        private String ImageId;

        /**镜像大小，单位为字节*/
        @JsonProperty("Size")
        private Integer Size;

        /**创建时间*/
        @JsonProperty("CreateTime")
        private String CreateTime;

        /**镜像版本*/
        @JsonProperty("TagNames")
        private List<String> TagNames;

    }

}
