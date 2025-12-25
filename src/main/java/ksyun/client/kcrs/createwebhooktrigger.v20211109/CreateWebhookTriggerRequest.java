package ksyun.client.kcrs.createwebhooktrigger.v20211109;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreateWebhookTriggerRequest
* @Description 请求参数
*/
@Data
public class CreateWebhookTriggerRequest{
    /**实例ID*/
    @KsYunField(name="InstanceId")
    private String InstanceId;

    /**命名空间*/
    @KsYunField(name="Namespace")
    private String Namespace;

    /**触发器参数*/
    @KsYunField(name="Trigger")
    private TriggerDto Trigger;

    @Data
    @ToString
    public static class TriggerDto {
        /**触发器名称*/
        @KsYunField(name="TriggerName")
        private String TriggerName;

        /**URL*/
        @KsYunField(name="TriggerUrl")
        private String TriggerUrl;

        /**启动触发器，有效值：
True
False*/
        @KsYunField(name="Enabled")
        private Boolean Enabled;

        /**触发动作，有效值
PushImage
DeleteImage*/
        @KsYunField(name = "EventType", type = 1)
        private List<String> EventTypeList;

        /**自定义Header*/
        @KsYunField(name = "Header", type = 1)
        private List<TriggerHeaderDto> HeaderList;

        @Data
        @ToString
        public static class TriggerHeaderDto {
            /***/
            @KsYunField(name="Key")
            private String Key;

            /***/
            @KsYunField(name = "Value", type = 1)
            private List<String> ValueList;

        }

    }

}
