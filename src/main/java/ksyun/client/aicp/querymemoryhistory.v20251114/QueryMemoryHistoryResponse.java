package ksyun.client.aicp.querymemoryhistory.v20251114;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname QueryMemoryHistoryResponse
* @Description QueryMemoryHistory 返回体
*/
@Data
@ToString
public class QueryMemoryHistoryResponse extends BaseResponseModel {

    /**请求唯一标识*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**记忆ID*/
    @JsonProperty("MemoryId")
    private String MemoryId;

    /**操作历史记录*/
    @JsonProperty("HistoryList")
    private List<HistoryListDto> HistoryList;

    @Data
    @ToString
    public static class HistoryListDto {
        /**此次记录产生的时间*/
        @JsonProperty("CreatedAt")
        private Long CreatedAt;

        /**变更展示类型：
create 表示记忆首次创建，manual_edit 表示用户人工编辑已有记忆，
system_update 表示系统冲突处理或冗余合并等产生的记忆更新
*/
        @JsonProperty("Type")
        private String Type;

        /**主题ID*/
        @JsonProperty("TopicId")
        private String TopicId;

        /**主题名称*/
        @JsonProperty("TopicName")
        private String TopicName;

        /**记忆内容*/
        @JsonProperty("Content")
        private String Content;

    }

}
