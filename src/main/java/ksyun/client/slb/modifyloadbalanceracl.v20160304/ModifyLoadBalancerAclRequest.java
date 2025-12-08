package ksyun.client.slb.modifyloadbalanceracl.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ModifyLoadBalancerAclRequest
* @Description 请求参数
*/
@Data
public class ModifyLoadBalancerAclRequest{
    /**LoadBalancerAcl的ID*/
    @KsYunField(name="LoadBalancerAclId")
    private String LoadBalancerAclId;

    /**LoadBalancerAcl的名称*/
    @KsYunField(name="LoadBalancerAclName")
    private String LoadBalancerAclName;

}
