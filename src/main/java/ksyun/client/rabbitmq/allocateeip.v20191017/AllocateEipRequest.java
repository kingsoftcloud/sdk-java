package ksyun.client.rabbitmq.allocateeip.v20191017;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

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