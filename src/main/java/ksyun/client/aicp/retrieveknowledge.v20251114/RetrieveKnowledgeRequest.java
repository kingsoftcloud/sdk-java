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

        /**是否启用重排序*/
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

        /**返回结果条数*/
        @KsYunField(name="TopK")
        private Integer TopK;

        /**是否开启 score 阈值过滤*/
        @KsYunField(name="ScoreThresholdEnabled")
        private Boolean ScoreThresholdEnabled;

        /**阈值分数*/
        @KsYunField(name="ScoreThreshold")
        private Double ScoreThreshold;

        /**各召回器单独设置*/
        @KsYunField(name="Retriever")
        private RetrievalModelRetrieverDto Retriever;

        @Data
        @ToString
        public static class RetrievalModelRetrieverDto {
            /**向量检索参数*/
            @KsYunField(name="Vector")
            private RetrievalModelRetrieverVectorDto Vector;

            @Data
            @ToString
            public static class RetrievalModelRetrieverVectorDto {
                /**向量召回 topK*/
                @KsYunField(name="TopK")
                private Integer TopK;

                /**向量阈值*/
                @KsYunField(name="ScoreThreshold")
                private Double ScoreThreshold;

                /**是否启用向量阈值*/
                @KsYunField(name="ScoreThresholdEnabled")
                private Boolean ScoreThresholdEnabled;

            }

            /**倒排检索参数*/
            @KsYunField(name="Inverted")
            private RetrievalModelRetrieverInvertedDto Inverted;

            @Data
            @ToString
            public static class RetrievalModelRetrieverInvertedDto {
                /**倒排召回 topK*/
                @KsYunField(name="TopK")
                private Integer TopK;

                /**倒排阈值*/
                @KsYunField(name="ScoreThreshold")
                private Double ScoreThreshold;

                /**是否启用倒排阈值*/
                @KsYunField(name="ScoreThresholdEnabled")
                private Boolean ScoreThresholdEnabled;

            }

        }

    }

}
