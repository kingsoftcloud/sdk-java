package ksyun.client.aicp.removeskillfromspace.v20240612;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname RemoveSkillFromSpaceResponse
* @Description RemoveSkillFromSpace 返回体
*/
@Data
@ToString
public class RemoveSkillFromSpaceResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
