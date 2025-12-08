package ksyun.client.kce.describeepcimage.v20190806;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeEpcImageResponse
* @Description DescribeEpcImage 返回体
*/
@Data
@ToString
public class DescribeEpcImageResponse extends BaseResponseModel {
    /***/
    @JsonProperty("ImageSet")
    private List<ImageSetDto> ImageSet;

    @Data
    @ToString
    public static class ImageSetDto {
        /**镜像id*/
        @JsonProperty("ImageId")
        private String ImageId;

        /**镜像名称*/
        @JsonProperty("ImageName")
        private String ImageName;

        /**镜像类型，枚举为base：标准镜像，private：自定义镜像*/
        @JsonProperty("ImageType")
        private String ImageType;

    }

    /**返回的镜像总数*/
    @JsonProperty("TotalCount")
    private Integer TotalCount;

    /**请求id*/
    @JsonProperty("RequestId")
    private String RequestId;

}
