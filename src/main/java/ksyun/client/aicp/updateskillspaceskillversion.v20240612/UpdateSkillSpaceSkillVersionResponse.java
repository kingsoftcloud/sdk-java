package ksyun.client.aicp.updateskillspaceskillversion.v20240612;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname UpdateSkillSpaceSkillVersionResponse
* @Description UpdateSkillSpaceSkillVersion 返回体
*/
@Data
@ToString
public class UpdateSkillSpaceSkillVersionResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
