package ksyun.client.aicp.createskillversion.v20240612;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateSkillVersionResponse
* @Description CreateSkillVersion 返回体
*/
@Data
@ToString
public class CreateSkillVersionResponse extends BaseResponseModel {

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

        /**skill 版本号*/
        @JsonProperty("Version")
        private String Version;

    }

}
