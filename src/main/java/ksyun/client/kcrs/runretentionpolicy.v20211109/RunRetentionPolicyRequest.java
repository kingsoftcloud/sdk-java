package ksyun.client.kcrs.runretentionpolicy.v20211109;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname RunRetentionPolicyRequest
 * @Description 请求参数
 */
@Data
public class RunRetentionPolicyRequest {
    /**
     * 实例Id
     */
    @KsYunField(name = "InstanceId")
    private String InstanceId;

    /**
     * 命名空间
     */
    @KsYunField(name = "Namespace")
    private String Namespace;

    /**
     * 默认为true,是否为模拟运行
     */
    @KsYunField(name = "TestRun")
    private Boolean TestRun;


}