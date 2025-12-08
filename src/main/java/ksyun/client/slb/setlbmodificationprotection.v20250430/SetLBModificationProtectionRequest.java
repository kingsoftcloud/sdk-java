package ksyun.client.slb.setlbmodificationprotection.v20250430;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname SetLBModificationProtectionRequest
* @Description 请求参数
*/
@Data
public class SetLBModificationProtectionRequest{
    /**负载均衡的ID*/
    @KsYunField(name="LoadBalancerId")
    private String LoadBalancerId;

    /**是否开启修改保护on/off*/
    @KsYunField(name="ModificationProtection")
    private Boolean ModificationProtection;

}
