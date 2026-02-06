package ksyun.client.kcf.createautoscaledtrigger.v20211215;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateAutoScaledTriggerResponse
* @Description CreateAutoScaledTrigger 返回体
*/
@Data
@ToString
public class CreateAutoScaledTriggerResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
