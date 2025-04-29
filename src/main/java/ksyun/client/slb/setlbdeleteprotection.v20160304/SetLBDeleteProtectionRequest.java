package ksyun.client.slb.setlbdeleteprotection.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname SetLBDeleteProtectionRequest
* @Description 请求参数
*/
@Data
public class SetLBDeleteProtectionRequest{
    /**负载均衡id*/
    @KsYunField(name="LoadBalancerId")
    private String LoadBalancerId;

    /**删除保护状态(on|off)*/
    @KsYunField(name="DeleteProtection")
    private String DeleteProtection;

}