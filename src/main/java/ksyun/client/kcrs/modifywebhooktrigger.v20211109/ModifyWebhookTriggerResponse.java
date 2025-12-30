package ksyun.client.kcrs.modifywebhooktrigger.v20211109;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ModifyWebhookTriggerResponse
* @Description ModifyWebhookTrigger 返回体
*/
@Data
@ToString
public class ModifyWebhookTriggerResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
