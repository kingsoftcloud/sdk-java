package ksyun.client.kcf.createtrigger.v20211215;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreateTriggerRequest
* @Description 请求参数
*/
@Data
public class CreateTriggerRequest{
    /**函数ID*/
    @KsYunField(name="FunctionId")
    private String FunctionId;

    /**触发器名称，在函数内唯一*/
    @KsYunField(name="TriggerName")
    private String TriggerName;

    /**触发器类型，http/ks3*/
    @KsYunField(name="Type")
    private String Type;

    /**触发器启用状态，true表示启用，false表示禁用。默认为true。并且仅在Type为ks3时有效*/
    @KsYunField(name="Enable")
    private Boolean Enable;

    /**触发器配置*/
    @KsYunField(name="TriggerDesc")
    private TriggerDescDto1 TriggerDesc;

    @Data
    @ToString
    public static class TriggerDescDto1 {
        /**HTTP请求方法列表，支持GET、POST、PUT、DELETE、HEAD、PATCH等*/
        @KsYunField(name="Methods",type=2)
        private List<String> MethodsList;

        /**是否开启签名认证，true表示开启，false表示关闭。默认为false*/
        @KsYunField(name="AuthRequired")
        private Boolean AuthRequired;

        /**自定义路径配置，默认为根路径"/"*/
        @KsYunField(name="Path")
        private String Path;

        /**请求超时时间，单位为秒，默认为30秒*/
        @KsYunField(name="Timeout")
        private Integer Timeout;

        /**协议类型，支持HTTP和HTTPS，默认为HTTP*/
        @KsYunField(name="Protocol")
        private String Protocol;

    }

}
