package ksyun.client.monitor.describealarmpolicy.v20210101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribeAlarmPolicyRequest
 * @Description 请求参数
 */
@Data
public class DescribeAlarmPolicyRequest {
    /**
     * 告警策略ID，详见[查询告警策略](https://docs.ksyun.com/documents/40346)
     */
    @KsYunField(name = "PolicyId")
    private Integer PolicyId;

}