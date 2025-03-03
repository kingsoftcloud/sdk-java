package ksyun.client.kce.describeagentstatus.v20230306;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribeAgentStatusRequest
 * @Description 请求参数
 */
@Data
public class DescribeAgentStatusRequest {
    /**
     * 实例id
     */
    @KsYunField(name = "InstanceId")
    private String InstanceId;

    /**
     * 集群id
     */
    @KsYunField(name = "ClusterId")
    private String ClusterId;

}