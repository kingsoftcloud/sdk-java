package ksyun.client.aicp.retrieveknowledge.v20251114;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname RetrieveKnowledgeRequest
* @Description 请求参数
*/
@Data
public class RetrieveKnowledgeRequest{
    /**知识库 ID*/
    @KsYunField(name="DatasetId")
    private String DatasetId;

    /**检索关键词*/
    @KsYunField(name="Query")
    private String Query;

    /**检索模型配置*/
    @KsYunField(name="RetrievalModel")
    private RetrievalModelDto RetrievalModel;

    @Data
    @ToString
    public static class RetrievalModelDto {
        /**检索方法：intelligence_search*/
        @KsYunField(name="SearchMethod")
        private String SearchMethod;

        /**是否启用重排序，基于向量和倒排的检索结果进行重排序*/
        @KsYunField(name="RerankingEnable")
        private Boolean RerankingEnable;

        /**重排序模型配置*/
        @KsYunField(name="RerankingMode")
        private RetrievalModelRerankingModeDto RerankingMode;

        @Data
        @ToString
        public static class RetrievalModelRerankingModeDto {
            /**重排模型提供商*/
            @KsYunField(name="RerankingProviderName")
            private String RerankingProviderName;

            /**重排模型名称*/
            @KsYunField(name="RerankingModelName")
            private String RerankingModelName;

        }

        /**返回结果条数，1-50*/
        @KsYunField(name="TopK")
        private Integer TopK;

        /**是否开启 score 阈值过滤*/
        @KsYunField(name="ScoreThresholdEnabled")
        private Boolean ScoreThresholdEnabled;

        /**阈值分数，0-1*/
        @KsYunField(name="ScoreThreshold")
        private Double ScoreThreshold;

        /**各召回器单独设置*/
        @KsYunField(name="Retriever")
        private RetrievalModelRetrieverDto Retriever;

        @Data
        @ToString
        public static class RetrievalModelRetrieverDto {
            /**向量检索参数：从向量数据库中召回 topK 个向量*/
            @KsYunField(name="Vector")
            private RetrievalModelRetrieverVectorDto Vector;

            @Data
            @ToString
            public static class RetrievalModelRetrieverVectorDto {
                /**向量召回 topK，1-50*/
                @KsYunField(name="TopK")
                private Integer TopK;

                /**向量阈值，0-1*/
                @KsYunField(name="ScoreThreshold")
                private Double ScoreThreshold;

                /**是否启用向量阈值*/
                @KsYunField(name="ScoreThresholdEnabled")
                private Boolean ScoreThresholdEnabled;

            }

            /**倒排检索参数：从倒排索引中召回 topK 个向量*/
            @KsYunField(name="Inverted")
            private RetrievalModelRetrieverInvertedDto Inverted;

            @Data
            @ToString
            public static class RetrievalModelRetrieverInvertedDto {
                /**倒排召回 topK，1-50*/
                @KsYunField(name="TopK")
                private Integer TopK;

                /**倒排阈值，0-1*/
                @KsYunField(name="ScoreThreshold")
                private Double ScoreThreshold;

                /**是否启用倒排阈值*/
                @KsYunField(name="ScoreThresholdEnabled")
                private Boolean ScoreThresholdEnabled;

            }

        }

        /**元数据过滤表达式, 仅支持单表达式
- 字符类型
支持 ==, !=
如a == "12345" and b != "67890"
- 数字类型
支持 == , > , < , !=
- 时间戳类型
支持 ==, >, <
- 数组类型支持
contains_any 
是否有交集，如 d contains_any [1,2,3]*/
        @KsYunField(name="FilterExpression")
        private String FilterExpression;

    }

}
