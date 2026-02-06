package ksyun.client.kcf.modifyautoscaledtrigger.v20211215;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ModifyAutoScaledTriggerResponse
* @Description ModifyAutoScaledTrigger 返回体
*/
@Data
@ToString
public class ModifyAutoScaledTriggerResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
