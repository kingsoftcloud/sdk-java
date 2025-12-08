package ksyun.client.slb.setlbprotocollayers.v20250430;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname SetLbProtocolLayersRequest
* @Description 请求参数
*/
@Data
public class SetLbProtocolLayersRequest{
    /**负载均衡的ID*/
    @KsYunField(name="LoadBalancerId")
    private String LoadBalancerId;

    /**实例规格,可选 L4 / L7 / L4-L7 ,分别代指4层、7层、4-7层网络协议负载均衡*/
    @KsYunField(name="ProtocolLayers")
    private String ProtocolLayers;

}
