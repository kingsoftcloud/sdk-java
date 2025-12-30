package ksyun.client.slb.modifyloadbalancer.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ModifyLoadBalancerResponse
* @Description ModifyLoadBalancer 返回体
*/
@Data
@ToString
public class ModifyLoadBalancerResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**负载均衡的ID*/
    @JsonProperty("LoadBalancerId")
    private String LoadBalancerId;

    /**负载均衡的名称*/
    @JsonProperty("LoadBalancerName")
    private String LoadBalancerName;

    /**负载均衡的类型*/
    @JsonProperty("Type")
    private String Type;

    /**创建时间*/
    @JsonProperty("CreateTime")
    private String CreateTime;

    /**Vpc的ID*/
    @JsonProperty("VpcId")
    private String VpcId;

    /**IP地址*/
    @JsonProperty("PublicIp")
    private String PublicIp;

    /**负载均衡支持的IP版本*/
    @JsonProperty("IpVersion")
    private String IpVersion;

    /**负载均衡类型*/
    @JsonProperty("LbType")
    private String LbType;

    /**负载均衡开启状态*/
    @JsonProperty("LoadBalancerState")
    private String LoadBalancerState;

}
