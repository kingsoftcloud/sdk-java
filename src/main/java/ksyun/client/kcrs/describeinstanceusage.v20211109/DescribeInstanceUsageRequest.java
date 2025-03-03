package ksyun.client.kcrs.describeinstanceusage.v20211109;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribeInstanceUsageRequest
 * @Description 请求参数
 */
@Data
public class DescribeInstanceUsageRequest {
    /**
     * 实例id
     */
    @KsYunField(name = "InstanceId")
    private String InstanceId;

}