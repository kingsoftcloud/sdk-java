package ksyun.client.rabbitmq.deleteinstance.v20191017;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DeleteInstanceRequest
 * @Description 请求参数
 */
@Data
public class DeleteInstanceRequest {
    /**
     * 实例Id。
     */
    @KsYunField(name = "InstanceId")
    private String InstanceId;


}