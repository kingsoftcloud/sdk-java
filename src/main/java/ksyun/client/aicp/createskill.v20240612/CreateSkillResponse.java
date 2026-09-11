package ksyun.client.aicp.createskill.v20240612;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateSkillResponse
* @Description CreateSkill 返回体
*/
@Data
@ToString
public class CreateSkillResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /**skill 唯一id*/
        @JsonProperty("SkillId")
        private String SkillId;

        /**skill 版本*/
        @JsonProperty("Version")
        private String Version;

    }

}
