package ksyun.client.kce.deleteprometheusinstance.v20230306;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname DeletePrometheusInstanceRequest
 * @Description 请求参数
 */
@Data
public class DeletePrometheusInstanceRequest {
    /**
     * 实例id
     */
    @KsYunField(name = "InstanceId")
    private String InstanceId;

}