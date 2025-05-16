package ksyun.client.iam.geteffectivepolicies.v20151101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname GetEffectivePoliciesRequest
 * @Description 请求参数
 */
@Data
public class GetEffectivePoliciesRequest {
    /**
     * 策略名称
     */
    @KsYunField(name = "PolicyName")
    private String PolicyName;

    /**
     * 页码
     */
    @KsYunField(name = "Page")
    private Integer Page;

    /**
     * 每页返回条数，最高500条
     */
    @KsYunField(name = "MaxItems")
    private Integer MaxItems;

}