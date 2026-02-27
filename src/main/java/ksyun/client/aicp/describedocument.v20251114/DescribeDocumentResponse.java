package ksyun.client.aicp.describedocument.v20251114;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeDocumentResponse
* @Description DescribeDocument 返回体
*/
@Data
@ToString
public class DescribeDocumentResponse extends BaseResponseModel {

    /**请求唯一标识*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**文档 ID*/
    @JsonProperty("Id")
    private String Id;

    /**在知识库中的位置*/
    @JsonProperty("Position")
    private Integer Position;

    /**数据源类型：upload_file*/
    @JsonProperty("DataSourceType")
    private String DataSourceType;

    /**数据源详情*/
    @JsonProperty("DataSourceInfo")
    private DataSourceInfoDto DataSourceInfo;

    @Data
    @ToString
    public static class DataSourceInfoDto {
        /**上传文件信息*/
        @JsonProperty("UploadFile")
        private DataSourceInfoUploadFileDto UploadFile;

        @Data
        @ToString
        public static class DataSourceInfoUploadFileDto {
            /**文件 ID*/
            @JsonProperty("Id")
            private String Id;

            /**文件名称*/
            @JsonProperty("Name")
            private String Name;

            /**文件大小（字节）*/
            @JsonProperty("Size")
            private Long Size;

        }

    }

    /**知识库级处理规则 ID*/
    @JsonProperty("DatasetProcessRuleId")
    private String DatasetProcessRuleId;

    /**知识库级处理规则*/
    @JsonProperty("DatasetProcessRule")
    private DatasetProcessRuleDto DatasetProcessRule;

    @Data
    @ToString
    public static class DatasetProcessRuleDto {
        /**清洗模式*/
        @JsonProperty("Mode")
        private String Mode;

        /**具体规则*/
        @JsonProperty("Rules")
        private DatasetProcessRuleRulesDto Rules;

        @Data
        @ToString
        public static class DatasetProcessRuleRulesDto {
            /**分段配置*/
            @JsonProperty("Segmentation")
            private DatasetProcessRuleRulesSegmentationDto Segmentation;

            @Data
            @ToString
            public static class DatasetProcessRuleRulesSegmentationDto {
                /**分隔符*/
                @JsonProperty("Delimiter")
                private String Delimiter;

                /**最大段长度*/
                @JsonProperty("MaxWords")
                private Integer MaxWords;

            }

        }

    }

    /**文档级处理规则*/
    @JsonProperty("DocumentProcessRule")
    private DocumentProcessRuleDto DocumentProcessRule;

    @Data
    @ToString
    public static class DocumentProcessRuleDto {
        /**清洗模式*/
        @JsonProperty("Mode")
        private String Mode;

        /**具体规则*/
        @JsonProperty("Rules")
        private DocumentProcessRuleRulesDto Rules;

        @Data
        @ToString
        public static class DocumentProcessRuleRulesDto {
            /**分段配置*/
            @JsonProperty("Segmentation")
            private DocumentProcessRuleRulesSegmentationDto Segmentation;

            @Data
            @ToString
            public static class DocumentProcessRuleRulesSegmentationDto {
                /**分隔符*/
                @JsonProperty("Delimiter")
                private String Delimiter;

                /**最大段长度*/
                @JsonProperty("MaxWords")
                private Integer MaxWords;

            }

        }

    }

    /**文档名称*/
    @JsonProperty("Name")
    private String Name;

    /**创建时间戳*/
    @JsonProperty("CreatedAt")
    private Long CreatedAt;

    /**token 数*/
    @JsonProperty("Tokens")
    private Integer Tokens;

    /**索引状态：waiting / parsing / cleaning / splitting / indexing / completed / error …*/
    @JsonProperty("IndexingStatus")
    private String IndexingStatus;

    /**完成时间戳*/
    @JsonProperty("CompletedAt")
    private Long CompletedAt;

    /**更新时间戳*/
    @JsonProperty("UpdatedAt")
    private Long UpdatedAt;

    /**索引耗时（秒）*/
    @JsonProperty("IndexingLatency")
    private Double IndexingLatency;

    /**是否启用*/
    @JsonProperty("Enabled")
    private Boolean Enabled;

    /**禁用时间戳*/
    @JsonProperty("DisabledAt")
    private Long DisabledAt;

    /**是否已归档*/
    @JsonProperty("Archived")
    private Boolean Archived;

    /**分片数*/
    @JsonProperty("SegmentCount")
    private Integer SegmentCount;

    /**平均分片长度*/
    @JsonProperty("AverageSegmentLength")
    private Integer AverageSegmentLength;

    /**命中次数*/
    @JsonProperty("HitCount")
    private Integer HitCount;

    /**展示状态：queuing / indexing / available / error*/
    @JsonProperty("DisplayStatus")
    private String DisplayStatus;

    /**文档形态：hierarchical_model / qa_model …*/
    @JsonProperty("DocForm")
    private String DocForm;

    /**文档语言*/
    @JsonProperty("DocLanguage")
    private String DocLanguage;

}
