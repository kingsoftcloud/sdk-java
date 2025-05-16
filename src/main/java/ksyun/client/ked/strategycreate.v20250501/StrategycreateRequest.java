package ksyun.client.ked.strategycreate.v20250501;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

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