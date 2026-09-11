package ksyun.client.aicp.listskills.v20240612;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ListSkillsResponse
* @Description ListSkills 返回体
*/
@Data
@ToString
public class ListSkillsResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /***/
        @JsonProperty("Items")
        private List<DataItemsDto> Items;

        @Data
        @ToString
        public static class DataItemsDto {
            /**skill id*/
            @JsonProperty("Id")
            private String Id;

            /**skill 名称*/
            @JsonProperty("Name")
            private String Name;

            /**skill 状态*/
            @JsonProperty("Status")
            private String Status;

            /**skill 描述*/
            @JsonProperty("Description")
            private String Description;

            /***/
            @JsonProperty("CreateTimeStamp")
            private String CreateTimeStamp;

            /***/
            @JsonProperty("UpdateTimeStamp")
            private String UpdateTimeStamp;

            /**关联的skill空间数量*/
            @JsonProperty("RelatedSkillSpaceCount")
            private Integer RelatedSkillSpaceCount;

        }

        /***/
        @JsonProperty("TotalCount")
        private Integer TotalCount;

    }

}
