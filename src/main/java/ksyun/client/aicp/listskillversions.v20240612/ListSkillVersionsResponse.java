package ksyun.client.aicp.listskillversions.v20240612;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ListSkillVersionsResponse
* @Description ListSkillVersions 返回体
*/
@Data
@ToString
public class ListSkillVersionsResponse extends BaseResponseModel {

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
        @JsonProperty("Versions")
        private List<DataVersionsDto> Versions;

        @Data
        @ToString
        public static class DataVersionsDto {
            /**skill版本id*/
            @JsonProperty("VersionId")
            private String VersionId;

            /**skill 版本名称*/
            @JsonProperty("Version")
            private String Version;

            /***/
            @JsonProperty("Status")
            private String Status;

            /***/
            @JsonProperty("CreatedAt")
            private String CreatedAt;

            /**skill版本hash值*/
            @JsonProperty("ContentHash")
            private String ContentHash;

            /**存储的ks3路径*/
            @JsonProperty("ArchiveUri")
            private String ArchiveUri;

            /***/
            @JsonProperty("RelatedSkillSpaceCount")
            private Integer RelatedSkillSpaceCount;

            /**关联的skill空间信息*/
            @JsonProperty("RelatedSkillSpaces")
            private List<DataVersionsRelatedSkillSpacesDto> RelatedSkillSpaces;

            @Data
            @ToString
            public static class DataVersionsRelatedSkillSpacesDto {
                /***/
                @JsonProperty("SkillSpaceId")
                private String SkillSpaceId;

                /***/
                @JsonProperty("SkillSpaceName")
                private String SkillSpaceName;

                /***/
                @JsonProperty("SkillSpaceDesc")
                private String SkillSpaceDesc;

            }

        }

        /***/
        @JsonProperty("Total")
        private Integer Total;

    }

}
