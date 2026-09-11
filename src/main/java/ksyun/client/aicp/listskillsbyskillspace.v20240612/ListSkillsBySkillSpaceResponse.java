package ksyun.client.aicp.listskillsbyskillspace.v20240612;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ListSkillsBySkillSpaceResponse
* @Description ListSkillsBySkillSpace 返回体
*/
@Data
@ToString
public class ListSkillsBySkillSpaceResponse extends BaseResponseModel {

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
        @JsonProperty("Skills")
        private List<DataSkillsDto> Skills;

        @Data
        @ToString
        public static class DataSkillsDto {
            /**skill id*/
            @JsonProperty("SkillId")
            private String SkillId;

            /**skill 名称*/
            @JsonProperty("Name")
            private String Name;

            /**skill 状态*/
            @JsonProperty("Status")
            private String Status;

            /**skill 描述*/
            @JsonProperty("Description")
            private String Description;

            /**skill 版本id*/
            @JsonProperty("VersionId")
            private String VersionId;

            /**版本名称*/
            @JsonProperty("Version")
            private String Version;

            /**skill hash值*/
            @JsonProperty("ContentHash")
            private String ContentHash;

            /**skill 版本存放路径*/
            @JsonProperty("ArchiveUri")
            private String ArchiveUri;

        }

        /***/
        @JsonProperty("TotalCount")
        private Integer TotalCount;

    }

}
