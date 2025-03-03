package ksyun.client.rabbitmq.allocateeip.v20191017;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname AllocateEipRequest
 * @Description 请求参数
 */
@Data
public class AllocateEipRequest {
    /**
     * 实例Id。
     */
    @KsYunField(name = "InstanceId")
    private String InstanceId;

}