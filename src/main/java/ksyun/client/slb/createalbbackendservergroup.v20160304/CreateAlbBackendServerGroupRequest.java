package ksyun.client.slb.createalbbackendservergroup.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreateAlbBackendServerGroupRequest
* @Description 请求参数
*/
@Data
public class CreateAlbBackendServerGroupRequest{
    /**Vpc的ID*/
    @KsYunField(name="VpcId")
    private String VpcId;

    /**ALB负载均衡的名称*/
    @KsYunField(name="Name")
    private String Name;

    /**服务器组的正实服务器类型*/
    @KsYunField(name="BackendServerType")
    private String BackendServerType;

    /**后端长连接类型*/
    @KsYunField(name="UpstreamKeepalive")
    private String UpstreamKeepalive;

    /**后端协议 (HTTP|gRPC)*/
    @KsYunField(name="Protocol")
    private String Protocol;


}