package ksyun.client.rabbitmq.deallocateeip.v20191017;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

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