package ksyun.client.aicp.describeknowledgebase.v20251114;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeKnowledgeBaseResponse
* @Description DescribeKnowledgeBase 返回体
*/
@Data
@ToString
public class DescribeKnowledgeBaseResponse extends BaseResponseModel {

    /**请求唯一标识*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**知识库 ID*/
    @JsonProperty("Id")
    private String Id;

    /**知识库名称*/
    @JsonProperty("Name")
    private String Name;

    /**描述*/
    @JsonProperty("Description")
    private String Description;

    /**提供商*/
    @JsonProperty("Provider")
    private String Provider;

    /**数据源类型*/
    @JsonProperty("DataSourceType")
    private String DataSourceType;

    /**索引方式*/
    @JsonProperty("IndexingTechnique")
    private String IndexingTechnique;

    /**关联应用数*/
    @JsonProperty("AppCount")
    private Integer AppCount;

    /**文档数*/
    @JsonProperty("DocumentCount")
    private Integer DocumentCount;

    /**总词数*/
    @JsonProperty("WordCount")
    private Integer WordCount;

    /**创建人*/
    @JsonProperty("CreatedBy")
    private String CreatedBy;

    /**创建时间戳*/
    @JsonProperty("CreatedAt")
    private Long CreatedAt;

    /**更新人*/
    @JsonProperty("UpdatedBy")
    private String UpdatedBy;

    /**更新时间戳*/
    @JsonProperty("UpdatedAt")
    private Long UpdatedAt;

    /**嵌入模型*/
    @JsonProperty("EmbeddingModel")
    private String EmbeddingModel;

    /**嵌入模型提供商*/
    @JsonProperty("EmbeddingModelProvider")
    private String EmbeddingModelProvider;

    /**模型是否可用*/
    @JsonProperty("EmbeddingAvailable")
    private Boolean EmbeddingAvailable;

    /**检索模型配置*/
    @JsonProperty("RetrievalModelDict")
    private RetrievalModelDictDto RetrievalModelDict;

    @Data
    @ToString
    public static class RetrievalModelDictDto {
        /**检索方法：intelligence_search*/
        @JsonProperty("SearchMethod")
        private String SearchMethod;

        /**是否启用重排序*/
        @JsonProperty("RerankingEnable")
        private Boolean RerankingEnable;

        /**重排序模型配置*/
        @JsonProperty("RerankingMode")
        private RetrievalModelDictRerankingModeDto RerankingMode;

        @Data
        @ToString
        public static class RetrievalModelDictRerankingModeDto {
            /**重排模型提供商*/
            @JsonProperty("RerankingProviderName")
            private String RerankingProviderName;

            /**重排模型名称*/
            @JsonProperty("RerankingModelName")
            private String RerankingModelName;

        }

        /**返回结果条数*/
        @JsonProperty("TopK")
        private Integer TopK;

        /**是否开启 score 阈值过滤*/
        @JsonProperty("ScoreThresholdEnabled")
        private Boolean ScoreThresholdEnabled;

        /**阈值分数*/
        @JsonProperty("ScoreThreshold")
        private Double ScoreThreshold;

        /**各召回器单独设置*/
        @JsonProperty("Retriever")
        private RetrievalModelDictRetrieverDto Retriever;

        @Data
        @ToString
        public static class RetrievalModelDictRetrieverDto {
            /**向量检索参数*/
            @JsonProperty("Vector")
            private RetrievalModelDictRetrieverVectorDto Vector;

            @Data
            @ToString
            public static class RetrievalModelDictRetrieverVectorDto {
                /**向量召回 topK*/
                @JsonProperty("TopK")
                private Integer TopK;

                /**向量阈值*/
                @JsonProperty("ScoreThreshold")
                private Double ScoreThreshold;

                /**是否启用向量阈值*/
                @JsonProperty("ScoreThresholdEnabled")
                private Boolean ScoreThresholdEnabled;

            }

            /**倒排检索参数*/
            @JsonProperty("Inverted")
            private RetrievalModelDictRetrieverInvertedDto Inverted;

            @Data
            @ToString
            public static class RetrievalModelDictRetrieverInvertedDto {
                /**倒排召回 topK*/
                @JsonProperty("TopK")
                private Integer TopK;

                /**倒排阈值*/
                @JsonProperty("ScoreThreshold")
                private Double ScoreThreshold;

                /**是否启用倒排阈值*/
                @JsonProperty("ScoreThresholdEnabled")
                private Boolean ScoreThresholdEnabled;

            }

        }

    }

    /**标签列表*/
    @JsonProperty("Tags")
    private List<String> Tags;

    /**文档形态*/
    @JsonProperty("DocForm")
    private String DocForm;

    /**外部知识库信息*/
    @JsonProperty("ExternalKnowledgeInfo")
    private ExternalKnowledgeInfoDto ExternalKnowledgeInfo;

    @Data
    @ToString
    public static class ExternalKnowledgeInfoDto {
        /**外部知识库 ID*/
        @JsonProperty("ExternalKnowledgeId")
        private String ExternalKnowledgeId;

        /**外部知识库 API ID*/
        @JsonProperty("ExternalKnowledgeApiId")
        private String ExternalKnowledgeApiId;

        /**外部知识库 API 名称*/
        @JsonProperty("ExternalKnowledgeApiName")
        private String ExternalKnowledgeApiName;

        /**外部知识库 API 端点*/
        @JsonProperty("ExternalKnowledgeApiEndpoint")
        private String ExternalKnowledgeApiEndpoint;

    }

    /**外部检索参数*/
    @JsonProperty("ExternalRetrievalModel")
    private ExternalRetrievalModelDto ExternalRetrievalModel;

    @Data
    @ToString
    public static class ExternalRetrievalModelDto {
        /**外部召回 topK*/
        @JsonProperty("TopK")
        private Integer TopK;

        /**外部阈值*/
        @JsonProperty("ScoreThreshold")
        private Double ScoreThreshold;

        /**是否启用外部阈值*/
        @JsonProperty("ScoreThresholdEnabled")
        private Boolean ScoreThresholdEnabled;

    }

}
