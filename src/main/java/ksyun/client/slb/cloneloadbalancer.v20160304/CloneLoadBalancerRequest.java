package ksyun.client.slb.cloneloadbalancer.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname CloneLoadBalancerRequest
 * @Description 请求参数
 */
@Data
public class CloneLoadBalancerRequest {
    /**
     * 克隆的负载均衡ID
     */
    @KsYunField(name = "cloneLoadBalancerId")
    private String CloneLoadBalancerId;

    /**
     * 克隆的负载均衡的名称
     */
    @KsYunField(name = "LoadBalancerName")
    private String LoadBalancerName;

    /**
     * 负载均衡的类型，public 为公网负载均衡，internal 为内网负载均衡
     */
    @KsYunField(name = "Type")
    private String Type;

    /**
     * 终端子网的 ID，Type 为 public 时忽略此参数，为internal 时此参数必填
     */
    @KsYunField(name = "SubnetId")
    private String SubnetId;

    /**
     * 私网负载均衡的IP，Type 为 Public 时忽略此参数
     */
    @KsYunField(name = "PrivateIpAddress")
    private String PrivateIpAddress;

    /**
     * 负载均衡的IP版本
     */
    @KsYunField(name = "IpVersion")
    private String IpVersion;

    /**
     * 负载均衡类型(classic|application)
     */
    @KsYunField(name = "LbType")
    private String LbType;

    /**
     * tag标签
     */
    @KsYunField(name = "TagId")
    private List<String> TagIdList;

    /**
     * 项目的ID
     */
    @KsYunField(name = "ProjectId")
    private String ProjectId;

}