package ksyun.client.ked.strategycreate.v20250501;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname StrategycreateRequest
 * @Description 请求参数
 */
@Data
public class StrategycreateRequest {
    /**
     * 策略组名称
     */
    @KsYunField(name = "name")
    private String Name;

    /**
     * 描述信息
     */
    @KsYunField(name = "description")
    private String Description;


}