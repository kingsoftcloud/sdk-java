package ksyun.client.kcrs.deletewebhooktrigger.v20211109;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DeleteWebhookTriggerRequest
* @Description 请求参数
*/
@Data
public class DeleteWebhookTriggerRequest{
    /**实例ID*/
    @KsYunField(name="InstanceId")
    private String InstanceId;

    /**命名空间*/
    @KsYunField(name="Namespace")
    private String Namespace;

    /**触发器ID*/
    @KsYunField(name="TriggerId")
    private String TriggerId;


}