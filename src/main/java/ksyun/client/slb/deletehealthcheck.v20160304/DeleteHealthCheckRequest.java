package ksyun.client.slb.deletehealthcheck.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DeleteHealthCheckRequest
* @Description 请求参数
*/
@Data
public class DeleteHealthCheckRequest{
    /**健康检查的ID*/
    @KsYunField(name="HealthCheckId")
    private String HealthCheckId;

}
