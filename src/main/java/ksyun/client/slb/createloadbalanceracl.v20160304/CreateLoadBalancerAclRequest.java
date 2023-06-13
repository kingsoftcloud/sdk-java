package ksyun.client.slb.createloadbalanceracl.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreateLoadBalancerAclRequest
* @Description 请求参数
*/
@Data
public class CreateLoadBalancerAclRequest{
    /**LoadBalancerAcl的名称*/
    @KsYunField(name="LoadBalancerAclName")
    private String LoadBalancerAclName;

    /**Ip版本(ipv6|ipv4)*/
    @KsYunField(name="IpVersion")
    private String IpVersion;


}