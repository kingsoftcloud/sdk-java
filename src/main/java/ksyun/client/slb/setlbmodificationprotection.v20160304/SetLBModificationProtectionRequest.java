package ksyun.client.slb.setlbmodificationprotection.v20160304;

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
    /**负载均衡id*/
    @KsYunField(name="LoadBalancerId")
    private String LoadBalancerId;

    /**修改保护状态(on|off)*/
    @KsYunField(name="ModificationProtection")
    private String ModificationProtection;

}
