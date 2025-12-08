package ksyun.client.slb.setlbdeleteprotection.v20250430;

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
    /**负载均衡的ID*/
    @KsYunField(name="LoadBalancerId")
    private String LoadBalancerId;

    /**是否开启删除保护on/off*/
    @KsYunField(name="DeleteProtection")
    private Boolean DeleteProtection;

}
