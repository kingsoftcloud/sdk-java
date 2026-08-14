package ksyun.client.aicp.listtopics.v20251114;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ListTopicsResponse
* @Description ListTopics 返回体
*/
@Data
@ToString
public class ListTopicsResponse extends BaseResponseModel {

    /**请求唯一标识*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**主题列表*/
    @JsonProperty("TopicList")
    private List<TopicListDto> TopicList;

    @Data
    @ToString
    public static class TopicListDto {
        /**主题ID*/
        @JsonProperty("TopicId")
        private String TopicId;

        /**主题名称*/
        @JsonProperty("TopicName")
        private String TopicName;

        /**主题描述信息*/
        @JsonProperty("TopicDescription")
        private String TopicDescription;

    }

}
