package ksyun.client.kcrs.deletewebhooktrigger.v20211109;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeleteWebhookTriggerResponse
* @Description DeleteWebhookTrigger 返回体
*/
@Data
@ToString
public class DeleteWebhookTriggerResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
