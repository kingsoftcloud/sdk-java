package ksyun.client.influxdb.deleteretentionpolicy.v20191010;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DeleteRetentionPolicyRequest
 * @Description 请求参数
 */
@Data
public class DeleteRetentionPolicyRequest {
    /***/
    @KsYunField(name = "InstanceId")
    private String InstanceId;

    /***/
    @KsYunField(name = "DatabaseName")
    private String DatabaseName;

    /***/
    @KsYunField(name = "PolicyName")
    private String PolicyName;

}