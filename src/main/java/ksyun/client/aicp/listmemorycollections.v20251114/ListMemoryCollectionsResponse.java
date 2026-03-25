package ksyun.client.aicp.listmemorycollections.v20251114;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ListMemoryCollectionsResponse
* @Description ListMemoryCollections 返回体
*/
@Data
@ToString
public class ListMemoryCollectionsResponse extends BaseResponseModel {

    /**记忆库列表*/
    @JsonProperty("Memories")
    private List<MemoriesDto> Memories;

    @Data
    @ToString
    public static class MemoriesDto {
        /**记忆库唯一 ID*/
        @JsonProperty("MemoryCollectionId")
        private String MemoryCollectionId;

        /**记忆库名称*/
        @JsonProperty("Name")
        private String Name;

        /**记忆库描述*/
        @JsonProperty("Description")
        private String Description;

        /**记忆库状态；
可选：CreateFailed/Ready*/
        @JsonProperty("Status")
        private String Status;

        /**秒级时间戳，创建时间*/
        @JsonProperty("CreateTime")
        private Long CreateTime;

        /**秒级时间戳，最后更新时间*/
        @JsonProperty("LastUpdateTime")
        private Long LastUpdateTime;

        /**记忆库所属地域*/
        @JsonProperty("Region")
        private String Region;

    }

    /**最大返回数量*/
    @JsonProperty("MaxResults")
    private Long MaxResults;

    /**分页标记*/
    @JsonProperty("Marker")
    private Long Marker;

    /**总数*/
    @JsonProperty("Total")
    private Long Total;

}
