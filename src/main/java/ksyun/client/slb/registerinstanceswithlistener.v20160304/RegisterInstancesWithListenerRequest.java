package ksyun.client.slb.registerinstanceswithlistener.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname RegisterInstancesWithListenerRequest
 * @Description 请求参数
 */
@Data
public class RegisterInstancesWithListenerRequest {
    /**
     * 后端服务器的类型(host|DirectConnectGateway)
     */
    @KsYunField(name = "RealServerType")
    private String RealServerType;

    /**
     * 监听器的ID
     */
    @KsYunField(name = "ListenerId")
    private String ListenerId;

    /**
     * 实例的权重
     */
    @KsYunField(name = "Weight")
    private Integer Weight;

    /**
     * 真实服务的IP
     */
    @KsYunField(name = "RealServerIp")
    private String RealServerIp;

    /**
     * 后端服务的端口
     */
    @KsYunField(name = "RealServerPort")
    private Integer RealServerPort;

    /**
     * - 实例ID
     * - host类型，填写云主机或者云物理主机的ID
     */
    @KsYunField(name = "InstanceId")
    private String InstanceId;

    /**
     * 标签
     */
    @KsYunField(name = "Tag")
    private String Tag;

    /**
     * RealServer的主备类型(Master | Slave)，仅MasterSlave监听器有此参数
     */
    @KsYunField(name = "MasterSlaveType")
    private String MasterSlaveType;

    /**
     * 弹性网卡ID
     */
    @KsYunField(name = "NetworkInterfaceId")
    private String NetworkInterfaceId;


}