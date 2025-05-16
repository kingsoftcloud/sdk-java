package ksyun.client.influxdb.deleteretentionpolicy.v20191010;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

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