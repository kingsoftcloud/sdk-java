package ksyun.client.kcrs.updateretentiontrigger.v20211109;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname UpdateRetentionTriggerRequest
 * @Description 请求参数
 */
@Data
public class UpdateRetentionTriggerRequest {
    /**
     * 实例Id
     */
    @KsYunField(name = "InstanceId")
    private String InstanceId;

    /**
     * 命名空间
     */
    @KsYunField(name = "Namespace")
    private String Namespace;

    /**
     * 执行周期
     */
    @KsYunField(name = "Trigger")
    private String Trigger;

}