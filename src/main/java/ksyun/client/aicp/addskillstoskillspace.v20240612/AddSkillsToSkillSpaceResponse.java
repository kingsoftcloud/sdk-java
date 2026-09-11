package ksyun.client.aicp.addskillstoskillspace.v20240612;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname AddSkillsToSkillSpaceResponse
* @Description AddSkillsToSkillSpace 返回体
*/
@Data
@ToString
public class AddSkillsToSkillSpaceResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
