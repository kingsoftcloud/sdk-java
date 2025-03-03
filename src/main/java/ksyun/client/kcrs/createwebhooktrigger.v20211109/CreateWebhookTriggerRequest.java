package ksyun.client.kcrs.createwebhooktrigger.v20211109;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname CreateWebhookTriggerRequest
 * @Description 请求参数
 */
@Data
public class CreateWebhookTriggerRequest {
    /**
     * 实例ID
     */
    @KsYunField(name = "InstanceId")
    private String InstanceId;

    /**
     * 命名空间
     */
    @KsYunField(name = "Namespace")
    private String Namespace;

}