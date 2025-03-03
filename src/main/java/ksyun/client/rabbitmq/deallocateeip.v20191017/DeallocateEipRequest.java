package ksyun.client.rabbitmq.deallocateeip.v20191017;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DeallocateEipRequest
 * @Description 请求参数
 */
@Data
public class DeallocateEipRequest {
    /**
     * 实例Id。
     */
    @KsYunField(name = "InstanceId")
    private String InstanceId;

}