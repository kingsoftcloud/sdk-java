package ksyun.client.rabbitmq.disableinstanceplugins.v20191017;

import common.annotation.KsYunField;
import lombok.Data;

import java.util.List;

/**
 * @Classname DisableInstancePluginsRequest
 * @Description 请求参数
 */
@Data
public class DisableInstancePluginsRequest {
    /**
     * 实例Id。
     */
    @KsYunField(name = "InstanceId")
    private String InstanceId;

    /**
     * 禁用插件列表，格式如下：
     * [
     * "rabbitmq_amqp1_0",
     * "rabbitmq_delayed_message_exchange"
     * ]
     */
    @KsYunField(name = "DisablePlugins", type = 2)
    private List<String> DisablePluginsList;

}