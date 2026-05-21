package ksyun.client.aicp.querysessionmemories.v20251114;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname QuerySessionMemoriesResponse
* @Description QuerySessionMemories 返回体
*/
@Data
@ToString
public class QuerySessionMemoriesResponse extends BaseResponseModel {

    /***/
    @JsonProperty("Data")
    private List<DataDto> Data;

    @Data
    @ToString
    public static class DataDto {
        /**主题ID*/
        @JsonProperty("TopicId")
        private String TopicId;

        /**主题名称*/
        @JsonProperty("TopicName")
        private String TopicName;

        /**记忆ID*/
        @JsonProperty("MemoryId")
        private String MemoryId;

        /**记忆文本*/
        @JsonProperty("Memory")
        private String Memory;

        /**记忆事件的发生时间*/
        @JsonProperty("OccurredStart")
        private Integer OccurredStart;

        /**记忆事件的结束时间*/
        @JsonProperty("OccurredEnd")
        private Integer OccurredEnd;

    }

}
