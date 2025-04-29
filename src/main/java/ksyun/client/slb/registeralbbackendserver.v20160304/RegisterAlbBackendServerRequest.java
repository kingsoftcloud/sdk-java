package ksyun.client.slb.registeralbbackendserver.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname RegisterAlbBackendServerRequest
* @Description 请求参数
*/
@Data
public class RegisterAlbBackendServerRequest{
    /**ALB服务器组id*/
    @KsYunField(name="BackendServerGroupId")
    private String BackendServerGroupId;

    /**服务器ip*/
    @KsYunField(name="BackendServerIp")
    private String BackendServerIp;

    /**服务器端口*/
    @KsYunField(name="Port")
    private Integer Port;

    /**服务器权重*/
    @KsYunField(name="Weight")
    private Integer Weight;

    /**网卡id*/
    @KsYunField(name="NetworkInterfaceId")
    private String NetworkInterfaceId;

    /**对等连接id*/
    @KsYunField(name="DirectConnectGatewayId")
    private String DirectConnectGatewayId;

}