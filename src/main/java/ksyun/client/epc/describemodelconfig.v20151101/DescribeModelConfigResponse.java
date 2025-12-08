package ksyun.client.epc.describemodelconfig.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeModelConfigResponse
* @Description DescribeModelConfig 返回体
*/
@Data
@ToString
public class DescribeModelConfigResponse extends BaseResponseModel {
    /**总数*/
    @JsonProperty("TotalCount")
    private Integer TotalCount;

    /**获取另一页返回结果的 token.
类型: String
是否必填：否*/
    @JsonProperty("NextToken")
    private String NextToken;

    /**模型配置集合*/
    @JsonProperty("ModelConfigSet")
    private List<ModelConfigSetDto> ModelConfigSet;

    @Data
    @ToString
    public static class ModelConfigSetDto {
        /**gpu驱动ID*/
        @JsonProperty("GpuImageDriverId")
        private String GpuImageDriverId;

        /**镜像名称*/
        @JsonProperty("ImageName")
        private String ImageName;

        /**GPU型号*/
        @JsonProperty("GpuModel")
        private String GpuModel;

        /**Anaconda*/
        @JsonProperty("Anaconda")
        private String Anaconda;

        /**训练框架*/
        @JsonProperty("Framework")
        private String Framework;

        /**推理引擎*/
        @JsonProperty("Engine")
        private String Engine;

        /**ai模型*/
        @JsonProperty("AiModel")
        private String AiModel;

    }

}
