package ksyun.client.aicp.queryagenticmemory.v20251114;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname QueryAgenticMemoryResponse
* @Description QueryAgenticMemory 返回体
*/
@Data
@ToString
public class QueryAgenticMemoryResponse extends BaseResponseModel {

    /**请求的唯一标识*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**检索到的记忆列表*/
    @JsonProperty("Data")
    private List<DataDto> Data;

    @Data
    @ToString
    public static class DataDto {
        /**查询短句
*/
        @JsonProperty("Query")
        private String Query;

        /**主题ID*/
        @JsonProperty("TopicId")
        private String TopicId;

        /**主题名称*/
        @JsonProperty("TopicName")
        private String TopicName;

        /**记忆ID*/
        @JsonProperty("MemoryId")
        private String MemoryId;

        /**记忆内容
*/
        @JsonProperty("Memory")
        private String Memory;

        /**相关性分数*/
        @JsonProperty("Score")
        private Double Score;

        /**记忆创建时间*/
        @JsonProperty("CreateTime")
        private Long CreateTime;

        /**记忆更新时间
*/
        @JsonProperty("UpdateTime")
        private Long UpdateTime;

        /**引用原始数据*/
        @JsonProperty("Citations")
        private List<DataCitationsDto> Citations;

        @Data
        @ToString
        public static class DataCitationsDto {
            /**源数据类型
*/
            @JsonProperty("DataType")
            private String DataType;

            /**原始数据*/
            @JsonProperty("Data")
            private DataCitationsDataDto Data;

            @Data
            @ToString
            public static class DataCitationsDataDto {
                /***/
                @JsonProperty("Conversation")
                private List<String> Conversation;

            }

        }

    }

}
