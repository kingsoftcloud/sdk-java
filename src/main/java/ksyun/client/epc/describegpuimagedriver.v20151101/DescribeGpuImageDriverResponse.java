package ksyun.client.epc.describegpuimagedriver.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeGpuImageDriverResponse
* @Description DescribeGpuImageDriver 返回体
*/
@Data
@ToString
public class DescribeGpuImageDriverResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**获取另一页返回结果的 token.*/
    @JsonProperty("NextToken")
    private String NextToken;

    /**裸金属服务器总数*/
    @JsonProperty("TotalCount")
    private Long TotalCount;

    /**GPU镜像的信息*/
    @JsonProperty("GpuImagesDriverSet")
    private List<GpuImagesDriverSetDto> GpuImagesDriverSet;

    @Data
    @ToString
    public static class GpuImagesDriverSetDto {
        /**GPU镜像ID*/
        @JsonProperty("GpuImageDriverId")
        private String GpuImageDriverId;

        /**镜像名称*/
        @JsonProperty("ImageNameSet")
        private List<String> ImageNameSet;

        /**GPU模型*/
        @JsonProperty("GpuModel")
        private List<String> GpuModel;

    }

}
