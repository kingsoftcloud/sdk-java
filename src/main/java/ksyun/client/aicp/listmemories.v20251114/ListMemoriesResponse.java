package ksyun.client.aicp.listmemories.v20251114;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ListMemoriesResponse
* @Description ListMemories 返回体
*/
@Data
@ToString
public class ListMemoriesResponse extends BaseResponseModel {

    /**请求唯一标识*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**查询到的数据总条数*/
    @JsonProperty("Total")
    private Long Total;

    /**记忆列表*/
    @JsonProperty("MemoryList")
    private List<MemoryListDto> MemoryList;

    @Data
    @ToString
    public static class MemoryListDto {
        /**记忆 ID*/
        @JsonProperty("MemoryId")
        private String MemoryId;

        /**记忆信息*/
        @JsonProperty("Memory")
        private String Memory;

        /**记忆来源*/
        @JsonProperty("SourceType")
        private String SourceType;

        /**主题ID*/
        @JsonProperty("TopicId")
        private String TopicId;

        /**主题名称*/
        @JsonProperty("TopicName")
        private String TopicName;

        /**记忆库ID*/
        @JsonProperty("MemoryCollectionId")
        private String MemoryCollectionId;

        /**用户ID*/
        @JsonProperty("AgentUserId")
        private String AgentUserId;

        /**记录创建时间（ms）*/
        @JsonProperty("CreatedAt")
        private Long CreatedAt;

        /**记录的更新时间*/
        @JsonProperty("UpdatedAt")
        private Long UpdatedAt;

        /**事件开始时间（ms）*/
        @JsonProperty("OccurredStart")
        private Long OccurredStart;

        /**事件结束时间（ms）*/
        @JsonProperty("OccurredEnd")
        private Long OccurredEnd;

    }

}
