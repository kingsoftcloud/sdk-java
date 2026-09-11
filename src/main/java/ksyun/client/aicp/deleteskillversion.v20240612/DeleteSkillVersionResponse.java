package ksyun.client.aicp.deleteskillversion.v20240612;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeleteSkillVersionResponse
* @Description DeleteSkillVersion 返回体
*/
@Data
@ToString
public class DeleteSkillVersionResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
