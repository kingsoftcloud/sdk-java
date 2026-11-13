package ksyun.client.aicp.getskillversiontree.v20240612;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname GetSkillVersionTreeResponse
* @Description GetSkillVersionTree 返回体
*/
@Data
@ToString
public class GetSkillVersionTreeResponse extends BaseResponseModel {

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
            /***/
            @JsonProperty("SkillId")
            private String SkillId;

            /***/
            @JsonProperty("SkillName")
            private String SkillName;

            /***/
            @JsonProperty("Versions")
            private List<DataSkillsVersionsDto> Versions;

            @Data
            @ToString
            public static class DataSkillsVersionsDto {
                /***/
                @JsonProperty("VersionId")
                private String VersionId;

                /***/
                @JsonProperty("VersionName")
                private String VersionName;

            }

        }

    }

}
