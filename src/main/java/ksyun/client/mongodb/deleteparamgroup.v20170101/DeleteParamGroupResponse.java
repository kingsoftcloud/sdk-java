package ksyun.client.mongodb.deleteparamgroup.v20170101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeleteParamGroupResponse
* @Description DeleteParamGroup 返回体
*/
@Data
@ToString
public class DeleteParamGroupResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
