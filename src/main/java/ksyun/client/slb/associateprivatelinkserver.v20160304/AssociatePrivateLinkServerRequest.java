package ksyun.client.slb.associateprivatelinkserver.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname AssociatePrivateLinkServerRequest
* @Description 请求参数
*/
@Data
public class AssociatePrivateLinkServerRequest{
    /**PrivateLinkServer的ID*/
    @KsYunField(name="PrivateLinkServerId")
    private String PrivateLinkServerId;

    /**负载均衡的ID*/
    @KsYunField(name="LoadBalancerId")
    private String LoadBalancerId;

    /**监听器的协议端口*/
    @KsYunField(name="ListenerPort")
    private Integer ListenerPort;

    /**项目的ID*/
    @KsYunField(name="ProjectId")
    private String ProjectId;

    /**删除保护*/
    @KsYunField(name="DeleteProtection")
    private String DeleteProtection;


}