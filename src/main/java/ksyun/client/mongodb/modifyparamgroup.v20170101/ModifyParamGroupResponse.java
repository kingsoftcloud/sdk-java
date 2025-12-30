package ksyun.client.mongodb.modifyparamgroup.v20170101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ModifyParamGroupResponse
* @Description ModifyParamGroup 返回体
*/
@Data
@ToString
public class ModifyParamGroupResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
