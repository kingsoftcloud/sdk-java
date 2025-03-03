package ksyun.client.influxdb.modifyretentionpolicy.v20191010;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ModifyRetentionPolicyRequest
 * @Description 请求参数
 */
@Data
public class ModifyRetentionPolicyRequest {
    /***/
    @KsYunField(name = "InstanceId")
    private String InstanceId;

    /***/
    @KsYunField(name = "DatabaseName")
    private String DatabaseName;

    /***/
    @KsYunField(name = "PolicyName")
    private String PolicyName;

    /***/
    @KsYunField(name = "Duration")
    private String Duration;

}