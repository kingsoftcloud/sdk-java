package ksyun.client.aicp.listskillspaces.v20240612;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ListSkillSpacesResponse
* @Description ListSkillSpaces 返回体
*/
@Data
@ToString
public class ListSkillSpacesResponse extends BaseResponseModel {

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
            /**skill 空间id*/
            @JsonProperty("Id")
            private String Id;

            /**skill 空间名称*/
            @JsonProperty("Name")
            private String Name;

            /***/
            @JsonProperty("Status")
            private String Status;

            /***/
            @JsonProperty("Description")
            private String Description;

            /**空间下的skill数量*/
            @JsonProperty("SkillCount")
            private Integer SkillCount;

            /***/
            @JsonProperty("Skills")
            private List<DataItemsSkillsDto> Skills;

            @Data
            @ToString
            public static class DataItemsSkillsDto {
                /**skill id*/
                @JsonProperty("SkillId")
                private String SkillId;

                /**skill 名称*/
                @JsonProperty("SkillName")
                private String SkillName;

                /**skill
描述*/
                @JsonProperty("SkillDescription")
                private String SkillDescription;

            }

            /***/
            @JsonProperty("CreateTimeStamp")
            private String CreateTimeStamp;

            /***/
            @JsonProperty("UpdateTimeStamp")
            private String UpdateTimeStamp;

        }

        /***/
        @JsonProperty("TotalCount")
        private Integer TotalCount;

    }

}
