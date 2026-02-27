package ksyun.client.aicp.importdocuments.v20251114;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ImportDocumentsRequest
* @Description 请求参数
*/
@Data
public class ImportDocumentsRequest{
    /**知识库 ID*/
    @KsYunField(name="DatasetId")
    private String DatasetId;

    /**文档解析与索引配置*/
    @KsYunField(name="Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /**索引方式*/
        @KsYunField(name="IndexingTechnique")
        private String IndexingTechnique;

        /**分段清洗规则*/
        @KsYunField(name="ProcessRule")
        private DataProcessRuleDto ProcessRule;

        @Data
        @ToString
        public static class DataProcessRuleDto {
            /**清洗模式*/
            @KsYunField(name="Mode")
            private String Mode;

            /**具体规则*/
            @KsYunField(name="Rules")
            private DataProcessRuleRulesDto Rules;

            @Data
            @ToString
            public static class DataProcessRuleRulesDto {
                /**分段配置*/
                @KsYunField(name="Segmentation")
                private DataProcessRuleRulesSegmentationDto Segmentation;

                @Data
                @ToString
                public static class DataProcessRuleRulesSegmentationDto {
                    /**分隔符*/
                    @KsYunField(name="Delimiter")
                    private String Delimiter;

                    /**最大段长度*/
                    @KsYunField(name="MaxWords")
                    private Integer MaxWords;

                }

            }

        }

        /**文档类型：structured / unstructured*/
        @KsYunField(name="DataType")
        private String DataType;

        /**结构化文档的表头描述（DataType=structured 时必填）*/
        @KsYunField(name="Schema")
        private DataSchemaDto Schema;

        @Data
        @ToString
        public static class DataSchemaDto {
            /**文件名（展示用）*/
            @KsYunField(name="TableName")
            private String TableName;

            /**文件内容描述（≥8 字）*/
            @KsYunField(name="Description")
            private String Description;

            /**列描述列表*/
            @KsYunField(name="Columns",type=2)
            private List<DataSchemaColumnsDto> ColumnsList;

            @Data
            @ToString
            public static class DataSchemaColumnsDto {
                /**原始表头列名（必需）*/
                @KsYunField(name="OriginalColumnName")
                private String OriginalColumnName;

                /**语义化列名（展示/检索用）*/
                @KsYunField(name="ModifiedColumnName")
                private String ModifiedColumnName;

                /**列含义（≥2 字）*/
                @KsYunField(name="Description")
                private String Description;

                /**是否加入索引*/
                @KsYunField(name="IsIndex")
                private Boolean IsIndex;

                /**字段类型：text / number*/
                @KsYunField(name="CType")
                private String CType;

            }

        }

        /**图像/表格理解策略*/
        @KsYunField(name="AnalysisStrategy")
        private DataAnalysisStrategyDto AnalysisStrategy;

        @Data
        @ToString
        public static class DataAnalysisStrategyDto {
            /**图像理解配置*/
            @KsYunField(name="ImageUnderstanding")
            private DataAnalysisStrategyImageUnderstandingDto ImageUnderstanding;

            @Data
            @ToString
            public static class DataAnalysisStrategyImageUnderstandingDto {
                /**是否启用*/
                @KsYunField(name="Enable")
                private Boolean Enable;

                /**固定 vlm*/
                @KsYunField(name="Method")
                private String Method;

                /**模型配置*/
                @KsYunField(name="Vlm")
                private DataAnalysisStrategyImageUnderstandingVlmDto Vlm;

                @Data
                @ToString
                public static class DataAnalysisStrategyImageUnderstandingVlmDto {
                    /**多模态模型名称*/
                    @KsYunField(name="ModelName")
                    private String ModelName;

                    /**供应商*/
                    @KsYunField(name="ProviderName")
                    private String ProviderName;

                    /**提示词列表*/
                    @KsYunField(name="Prompt",type=2)
                    private List<DataAnalysisStrategyImageUnderstandingVlmPromptDto> PromptList;

                    @Data
                    @ToString
                    public static class DataAnalysisStrategyImageUnderstandingVlmPromptDto {
                        /**system / user*/
                        @KsYunField(name="Role")
                        private String Role;

                        /**提示内容*/
                        @KsYunField(name="Text")
                        private String Text;

                    }

                }

            }

            /**表格理解配置*/
            @KsYunField(name="TableUnderstanding")
            private DataAnalysisStrategyTableUnderstandingDto TableUnderstanding;

            @Data
            @ToString
            public static class DataAnalysisStrategyTableUnderstandingDto {
                /**是否启用*/
                @KsYunField(name="Enable")
                private Boolean Enable;

                /**固定 vlm*/
                @KsYunField(name="Method")
                private String Method;

                /**模型配置*/
                @KsYunField(name="Vlm")
                private DataAnalysisStrategyTableUnderstandingVlmDto Vlm;

                @Data
                @ToString
                public static class DataAnalysisStrategyTableUnderstandingVlmDto {
                    /**多模态模型名称*/
                    @KsYunField(name="ModelName")
                    private String ModelName;

                    /**供应商*/
                    @KsYunField(name="ProviderName")
                    private String ProviderName;

                    /**提示词列表*/
                    @KsYunField(name="Prompt",type=2)
                    private List<DataAnalysisStrategyTableUnderstandingVlmPromptDto> PromptList;

                    @Data
                    @ToString
                    public static class DataAnalysisStrategyTableUnderstandingVlmPromptDto {
                        /**system / user*/
                        @KsYunField(name="Role")
                        private String Role;

                        /**提示内容*/
                        @KsYunField(name="Text")
                        private String Text;

                    }

                }

            }

        }

        /**检索模型配置*/
        @KsYunField(name="RetrievalModel")
        private DataRetrievalModelDto RetrievalModel;

        @Data
        @ToString
        public static class DataRetrievalModelDto {
            /**检索方法：intelligence_search*/
            @KsYunField(name="SearchMethod")
            private String SearchMethod;

            /**是否启用重排序*/
            @KsYunField(name="RerankingEnable")
            private Boolean RerankingEnable;

            /**重排序模型配置*/
            @KsYunField(name="RerankingMode")
            private DataRetrievalModelRerankingModeDto RerankingMode;

            @Data
            @ToString
            public static class DataRetrievalModelRerankingModeDto {
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
            private DataRetrievalModelRetrieverDto Retriever;

            @Data
            @ToString
            public static class DataRetrievalModelRetrieverDto {
                /**向量检索参数*/
                @KsYunField(name="Vector")
                private DataRetrievalModelRetrieverVectorDto Vector;

                @Data
                @ToString
                public static class DataRetrievalModelRetrieverVectorDto {
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
                private DataRetrievalModelRetrieverInvertedDto Inverted;

                @Data
                @ToString
                public static class DataRetrievalModelRetrieverInvertedDto {
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

    /**上传方式：ks3*/
    @KsYunField(name="AddType")
    private String AddType;

    /**文件路径（AddType=ks3 时必填）*/
    @KsYunField(name="Ks3Path",type=2)
    private List<String> Ks3PathList;

}
