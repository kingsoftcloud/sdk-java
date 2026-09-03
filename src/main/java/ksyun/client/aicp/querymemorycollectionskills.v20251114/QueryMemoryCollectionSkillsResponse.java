package ksyun.client.aicp.querymemorycollectionskills.v20251114;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname QueryMemoryCollectionSkillsResponse
* @Description QueryMemoryCollectionSkills 返回体
*/
@Data
@ToString
public class QueryMemoryCollectionSkillsResponse extends BaseResponseModel {

    /***/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /***/
        @JsonProperty("SystemOverview")
        private String SystemOverview;

        /***/
        @JsonProperty("AddMemoryApi")
        private String AddMemoryApi;

        /***/
        @JsonProperty("SearchMemoryApi")
        private String SearchMemoryApi;

        /***/
        @JsonProperty("Scenes")
        private String Scenes;

    }

}
