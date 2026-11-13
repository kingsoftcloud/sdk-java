package ksyun.client.aicp.updateskill.v20240612;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname UpdateSkillResponse
* @Description UpdateSkill 返回体
*/
@Data
@ToString
public class UpdateSkillResponse extends BaseResponseModel {

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
        @JsonProperty("SkillId")
        private String SkillId;

        /***/
        @JsonProperty("Version")
        private String Version;

    }

}
