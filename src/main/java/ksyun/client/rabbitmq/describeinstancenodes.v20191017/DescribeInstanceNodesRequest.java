package ksyun.client.rabbitmq.describeinstancenodes.v20191017;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribeInstanceNodesRequest
 * @Description 请求参数
 */
@Data
public class DescribeInstanceNodesRequest {
    /**
     * 实例Id。
     */
    @KsYunField(name = "InstanceId")
    private String InstanceId;

}