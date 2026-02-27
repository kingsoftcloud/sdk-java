package ksyun.client.aicp.getinferencemodels.v20240612;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname GetInferenceModelsResponse
* @Description GetInferenceModels 返回体
*/
@Data
@ToString
public class GetInferenceModelsResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**总数*/
    @JsonProperty("TotalCount")
    private Integer TotalCount;

    /**内置大模型列表*/
    @JsonProperty("InferenceModels")
    private List<InferenceModelsDto> InferenceModels;

    @Data
    @ToString
    public static class InferenceModelsDto {
        /**模型名称*/
        @JsonProperty("Name")
        private String Name;

        /**分组信息*/
        @JsonProperty("Group")
        private String Group;

        /**存储类型*/
        @JsonProperty("StorageType")
        private String StorageType;

        /**描述信息*/
        @JsonProperty("Description")
        private String Description;

        /**模型推理参数配置*/
        @JsonProperty("PassParams")
        private InferenceModelsPassParamsDto PassParams;

        @Data
        @ToString
        public static class InferenceModelsPassParamsDto {
            /**GPU卡数量*/
            @JsonProperty("GPUNum")
            private String GPUNum;

            /**CPU核心数*/
            @JsonProperty("CPUCore")
            private Integer CPUCore;

            /**内存大小(Gi)*/
            @JsonProperty("Memory")
            private Integer Memory;

            /**支持的GPU卡数列表*/
            @JsonProperty("SupportGPUNumList")
            private String SupportGPUNumList;

            /**是否支持单节点*/
            @JsonProperty("SupportSingleNode")
            private Boolean SupportSingleNode;

            /**是否支持多节点*/
            @JsonProperty("SupportMultiNode")
            private Boolean SupportMultiNode;

            /**是否支持VLLM引擎*/
            @JsonProperty("SupportVLLM")
            private Boolean SupportVLLM;

            /**是否支持SGLang引擎*/
            @JsonProperty("SupportSGLang")
            private Boolean SupportSGLang;

            /**是否支持SGLangPD引擎*/
            @JsonProperty("SupportSGLangPD")
            private Boolean SupportSGLangPD;

            /**是否支持OpenPi引擎*/
            @JsonProperty("SupportOpenPi")
            private Boolean SupportOpenPi;

        }

        /**创建时间*/
        @JsonProperty("CreateTime")
        private String CreateTime;

        /**更新时间*/
        @JsonProperty("UpdateTime")
        private String UpdateTime;

    }

}
