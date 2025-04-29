package ksyun.client.slb.deleteloadbalanceraclentry.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DeleteLoadBalancerAclEntryRequest
* @Description 请求参数
*/
@Data
public class DeleteLoadBalancerAclEntryRequest{
    /**ACL规则ID*/
    @KsYunField(name="LoadBalancerAclEntryId")
    private String LoadBalancerAclEntryId;

}