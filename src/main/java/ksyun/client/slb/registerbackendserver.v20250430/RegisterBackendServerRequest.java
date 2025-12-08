package ksyun.client.slb.registerbackendserver.v20250430;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname RegisterBackendServerRequest
* @Description 请求参数
*/
@Data
public class RegisterBackendServerRequest{
    /**服务器组id*/
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

    /**边界网关id*/
    @KsYunField(name="DirectConnectGatewayId")
    private String DirectConnectGatewayId;

    /**真实服务器的主备状态*/
    @KsYunField(name="MasterSlaveType")
    private String MasterSlaveType;

}
