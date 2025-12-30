package ksyun.client.kcrs.createwebhooktrigger.v20211109;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateWebhookTriggerResponse
* @Description CreateWebhookTrigger 返回体
*/
@Data
@ToString
public class CreateWebhookTriggerResponse extends BaseResponseModel {

    /***/
    @JsonProperty("triggerId")
    private Integer TriggerId;

    /***/
    @JsonProperty("requestId")
    private String RequestId;

}
