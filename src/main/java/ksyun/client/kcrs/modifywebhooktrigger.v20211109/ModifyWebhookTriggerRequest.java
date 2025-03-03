package ksyun.client.kcrs.modifywebhooktrigger.v20211109;

import common.annotation.KsYunField;
import lombok.Data;

import java.util.List;

/**
 * @Classname ModifyWebhookTriggerRequest
 * @Description 请求参数
 */
@Data
public class ModifyWebhookTriggerRequest {
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

    /**
     * 触发器属性
     */
    @KsYunField(name = "Trigger")
    private String Trigger;

    /**
     * 触发器ID
     */
    @KsYunField(name = "TriggerId")
    private String TriggerId;

    /**
     * 触发器名称
     */
    @KsYunField(name = "TriggerName")
    private String TriggerName;

    /**
     * 触发动作，有效值：<br/>PushImage<br/>DeleteImage
     */
    @KsYunField(name = "EventType")
    private List<String> EventTypeList;

    /**
     * 触发器URL
     */
    @KsYunField(name = "TriggerUrl")
    private String TriggerUrl;

    /**
     * 自定义Headers
     */
    @KsYunField(name = "Header")
    private List<String> HeaderList;

    /**
     * 启用触发器，有效值：<br/>True：是<br/>False：否
     */
    @KsYunField(name = "Enabled")
    private String Enabled;

    /**
     * Header Key
     */
    @KsYunField(name = "Key")
    private String Key;

    /**
     * Header Values
     */
    @KsYunField(name = "Value")
    private List<String> ValueList;


}