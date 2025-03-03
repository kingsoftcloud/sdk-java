package ksyun.client.clickhouse.resetdbparameter.v20210101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ResetDBParameterRequest
 * @Description 请求参数
 */
@Data
public class ResetDBParameterRequest {
    /**
     * 实例ID。
     */
    @KsYunField(name = "InstanceId")
    private String InstanceId;

    /**
     * 参数类型。可选：Users，Config。
     */
    @KsYunField(name = "ConfigType")
    private String ConfigType;


}