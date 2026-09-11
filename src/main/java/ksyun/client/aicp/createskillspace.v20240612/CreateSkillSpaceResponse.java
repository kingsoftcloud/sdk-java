package ksyun.client.aicp.createskillspace.v20240612;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateSkillSpaceResponse
* @Description CreateSkillSpace 返回体
*/
@Data
@ToString
public class CreateSkillSpaceResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /**skill 空间名称*/
        @JsonProperty("Name")
        private String Name;

        /**skill 空间id*/
        @JsonProperty("SpaceId")
        private String SpaceId;

        /**skill 空间描述*/
        @JsonProperty("Description")
        private String Description;

        /**空间内的skill 数量*/
        @JsonProperty("SkillCount")
        private Integer SkillCount;

    }

}
