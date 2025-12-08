package ksyun.client.influxdb.modifyretentionpolicy.v20191010;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ModifyRetentionPolicyRequest
* @Description 请求参数
*/
@Data
public class ModifyRetentionPolicyRequest{
    /***/
    @KsYunField(name="InstanceId")
    private String InstanceId;

    /***/
    @KsYunField(name="DatabaseName")
    private String DatabaseName;

    /***/
    @KsYunField(name="PolicyName")
    private String PolicyName;

    /***/
    @KsYunField(name="Duration")
    private String Duration;

}
