package ksyun.client.aicp.getmodeldetail.v20240612;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname GetModelDetailResponse
* @Description GetModelDetail 返回体
*/
@Data
@ToString
public class GetModelDetailResponse extends BaseResponseModel {

    /***/
    @JsonProperty("ModelApiModelDataWebResp")
    private ModelApiModelDataWebRespDto ModelApiModelDataWebResp;

    @Data
    @ToString
    public static class ModelApiModelDataWebRespDto {
        /**ModelId*/
        @JsonProperty("ModelId")
        private String ModelId;

        /**模型名称*/
        @JsonProperty("ModelName")
        private String ModelName;

        /**模型描述*/
        @JsonProperty("Description")
        private String Description;

        /**模型图标资源链接*/
        @JsonProperty("IconUrl")
        private String IconUrl;

        /**模型的标签列表*/
        @JsonProperty("Tags")
        private List<String> Tags;

        /**模型更新时间，毫秒时间戳*/
        @JsonProperty("UpdateTime")
        private Long UpdateTime;

        /**调用示例*/
        @JsonProperty("CodeCase")
        private ModelApiModelDataWebRespCodeCaseDto CodeCase;

        @Data
        @ToString
        public static class ModelApiModelDataWebRespCodeCaseDto {
            /**调用示例的 baseUrl*/
            @JsonProperty("BaseUrl")
            private String BaseUrl;

            /**调用示例的model */
            @JsonProperty("Model")
            private String Model;

            /**RestApi 模式公网调用baseUrl*/
            @JsonProperty("RestApiExternalbaseUrl")
            private String RestApiExternalbaseUrl;

            /**RestApi内网调用baseUrl*/
            @JsonProperty("RestApiInternalbaseUrl")
            private String RestApiInternalbaseUrl;

            /**OpenSdk公网调用baseUrl*/
            @JsonProperty("OpenSdkExternalbaseUrl")
            private String OpenSdkExternalbaseUrl;

            /**OpenSdk内网调用baseUrl*/
            @JsonProperty("OpenSdkInternalbaseUrl")
            private String OpenSdkInternalbaseUrl;

            /**是否为视频模型*/
            @JsonProperty("VideoModel")
            private Boolean VideoModel;

            /**是否支持FunctionCall*/
            @JsonProperty("FunctionCall")
            private Boolean FunctionCall;

            /**结构化输出*/
            @JsonProperty("StructuredOutput")
            private Boolean StructuredOutput;

            /**联网搜索*/
            @JsonProperty("InternetSearch")
            private Boolean InternetSearch;

            /**深度思考*/
            @JsonProperty("DeepThinking")
            private Boolean DeepThinking;

            /**批量推理*/
            @JsonProperty("Batch")
            private Boolean Batch;

            /**上下文缓存*/
            @JsonProperty("CacheContext")
            private Boolean CacheContext;

            /**模型供应商*/
            @JsonProperty("ModelProvider")
            private String ModelProvider;

            /**未命中缓存输入价格（百万Token）（在线推理输入）*/
            @JsonProperty("OnlineCalculateInput")
            private String OnlineCalculateInput;

            /**输出价格（百万Token）（在线推理输出）*/
            @JsonProperty("OnlineCalculateOutput")
            private String OnlineCalculateOutput;

            /**批量推理未命中缓存输入价格（百万Token）（批量推理输入）*/
            @JsonProperty("BatchCalculateInput")
            private String BatchCalculateInput;

            /**批量推理输出价格（百万Token）（批量推理输出）*/
            @JsonProperty("BatchCalculateOutput")
            private String BatchCalculateOutput;

            /***/
            @JsonProperty("OnlineCalculateRight")
            private String OnlineCalculateRight;

            /***/
            @JsonProperty("BatchCalculateCacheRight")
            private String BatchCalculateCacheRight;

            /**RPM限流*/
            @JsonProperty("RpmLimit")
            private String RpmLimit;

            /**TPM限流*/
            @JsonProperty("TpmLimit")
            private String TpmLimit;

            /**上下文长度*/
            @JsonProperty("ContextLength")
            private String ContextLength;

            /**输入最大长度*/
            @JsonProperty("InputMaxLength")
            private String InputMaxLength;

            /**输出最大长度*/
            @JsonProperty("OutputMaxLength")
            private String OutputMaxLength;

            /**深度思考最大长度*/
            @JsonProperty("DeepThinkMaxLength")
            private String DeepThinkMaxLength;

            /**文生视频*/
            @JsonProperty("VideoGeneration")
            private Boolean VideoGeneration;

            /**图生视频*/
            @JsonProperty("ImageToVideo")
            private Boolean ImageToVideo;

            /**视频模型属性*/
            @JsonProperty("VideoModelModeSet")
            private List<ModelApiModelDataWebRespCodeCaseVideoModelModeSetDto> VideoModelModeSet;

            @Data
            @ToString
            public static class ModelApiModelDataWebRespCodeCaseVideoModelModeSetDto {
                /**模式*/
                @JsonProperty("VideoModelMode")
                private String VideoModelMode;

                /**单价/5s*/
                @JsonProperty("VideoModelPrice")
                private String VideoModelPrice;

                /**分辨率*/
                @JsonProperty("Resolution")
                private String Resolution;

                /**帧率*/
                @JsonProperty("FrameRate")
                private String FrameRate;

                /**时长*/
                @JsonProperty("Duration")
                private String Duration;

                /**并发数*/
                @JsonProperty("Concurrency")
                private String Concurrency;

            }

            /***/
            @JsonProperty("SingleExternalUrl")
            private String SingleExternalUrl;

            /***/
            @JsonProperty("SingleInternalUrl")
            private String SingleInternalUrl;

            /**是否可以切换深度思考。*/
            @JsonProperty("DeepThinkingSwitch")
            private Boolean DeepThinkingSwitch;

            /**生图模型的参数信息，：
{
      "textToImagePrice": "0.25",
      "imageToImagePrice": "0.25",
      "resolution": "2K-4K",
      "IPM": "100",
      "textToImage": "true",
      "imageToImage": "true",
      "inAndOutPut": "1"
    }*/
            @JsonProperty("ImageModelModeMap")
            private String ImageModelModeMap;

            /**模型支持的输入类型：1-文本，2-图片，3-视频*/
            @JsonProperty("InputType")
            private List<String> InputType;

            /**模型支持的输出类型：1-文本，2-图片，3-视频*/
            @JsonProperty("OutputType")
            private List<String> OutputType;

            /**支持模型体验类型：0-不支持，1-支持。*/
            @JsonProperty("SupportTryout")
            private String SupportTryout;

            /**true 表示 文字转语音。*/
            @JsonProperty("TextToSpeech")
            private Boolean TextToSpeech;

            /**文本转语音定价*/
            @JsonProperty("VoicePrice")
            private String VoicePrice;

            /**阶梯计费规则*/
            @JsonProperty("PricingRules")
            private ModelApiModelDataWebRespCodeCasePricingRulesDto PricingRules;

            @Data
            @ToString
            public static class ModelApiModelDataWebRespCodeCasePricingRulesDto {
                /***/
                @JsonProperty("OnlineCalculateDisplayCache")
                private List<onlineCalculateDisplayCacheDto1> OnlineCalculateDisplayCache;

                @Data
                @ToString
                public static class onlineCalculateDisplayCacheDto1 {
                }

            }

        }

        /***/
        @JsonProperty("RequestId")
        private String RequestId;

        /**模型开通状态：1-已开通，2-未开通。*/
        @JsonProperty("ActiveStatus")
        private Integer ActiveStatus;

        /***/
        @JsonProperty("ExtraFields")
        private String ExtraFields;

    }

}
