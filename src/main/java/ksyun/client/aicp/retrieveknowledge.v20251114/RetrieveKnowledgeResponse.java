package ksyun.client.aicp.retrieveknowledge.v20251114;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname RetrieveKnowledgeResponse
* @Description RetrieveKnowledge 返回体
*/
@Data
@ToString
public class RetrieveKnowledgeResponse extends BaseResponseModel {

    /**请求唯一标识*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**检索语句*/
    @JsonProperty("Query")
    private QueryDto Query;

    @Data
    @ToString
    public static class QueryDto {
        /**检索内容*/
        @JsonProperty("Content")
        private String Content;

    }

    /**召回结果*/
    @JsonProperty("Records")
    private List<RecordsDto> Records;

    @Data
    @ToString
    public static class RecordsDto {
        /**分片信息*/
        @JsonProperty("Segment")
        private RecordsSegmentDto Segment;

        @Data
        @ToString
        public static class RecordsSegmentDto {
            /**分片 ID*/
            @JsonProperty("Id")
            private String Id;

            /**在文档中的位置*/
            @JsonProperty("Position")
            private Integer Position;

            /**所属文档 ID*/
            @JsonProperty("DocumentId")
            private String DocumentId;

            /**分片文本*/
            @JsonProperty("Content")
            private String Content;

            /**问答对答案（如有）*/
            @JsonProperty("Answer")
            private String Answer;

            /**词数*/
            @JsonProperty("WordCount")
            private Integer WordCount;

            /**token 数*/
            @JsonProperty("Tokens")
            private Integer Tokens;

            /**关键词列表*/
            @JsonProperty("Keywords")
            private List<String> Keywords;

            /**索引节点 ID*/
            @JsonProperty("IndexNodeId")
            private String IndexNodeId;

            /**索引节点哈希*/
            @JsonProperty("IndexNodeHash")
            private String IndexNodeHash;

            /**命中次数*/
            @JsonProperty("HitCount")
            private Integer HitCount;

            /**是否启用*/
            @JsonProperty("Enabled")
            private Boolean Enabled;

            /**禁用时间戳*/
            @JsonProperty("DisabledAt")
            private Long DisabledAt;

            /**禁用操作人*/
            @JsonProperty("DisabledBy")
            private String DisabledBy;

            /**状态：completed / waiting …*/
            @JsonProperty("Status")
            private String Status;

            /**创建人*/
            @JsonProperty("CreatedBy")
            private String CreatedBy;

            /**创建时间戳*/
            @JsonProperty("CreatedAt")
            private Long CreatedAt;

            /**开始索引时间戳*/
            @JsonProperty("IndexingAt")
            private Long IndexingAt;

            /**完成时间戳*/
            @JsonProperty("CompletedAt")
            private Long CompletedAt;

            /**错误信息*/
            @JsonProperty("Error")
            private String Error;

            /**停止时间戳*/
            @JsonProperty("StoppedAt")
            private Long StoppedAt;

            /**所属文档简要信息*/
            @JsonProperty("Document")
            private RecordsSegmentDocumentDto Document;

            @Data
            @ToString
            public static class RecordsSegmentDocumentDto {
                /**文档 ID*/
                @JsonProperty("Id")
                private String Id;

                /**数据源类型*/
                @JsonProperty("DataSourceType")
                private String DataSourceType;

                /**文档名称*/
                @JsonProperty("Name")
                private String Name;

            }

        }

        /**相似度分数*/
        @JsonProperty("Score")
        private Double Score;

        /**可视化坐标（预留）*/
        @JsonProperty("TsnePosition")
        private String TsnePosition;

    }

}
