package ksyun.client.vpc.createnetworkpath.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreateNetworkPathRequest
* @Description 请求参数
*/
@Data
public class CreateNetworkPathRequest{
    /**源信息ID*/
    @KsYunField(name="SourceId")
    private String SourceId;

    /**源类型 可选值:KEC,EIP,External_IP*/
    @KsYunField(name="SourceType")
    private String SourceType;

    /**源信息IP*/
    @KsYunField(name="SourceIp")
    private String SourceIp;

    /**路径分析名称*/
    @KsYunField(name="PathName")
    private String PathName;

    /**目的信息ID*/
    @KsYunField(name="TargetId")
    private String TargetId;

    /**目的类型，可选值:KEC,EIP,External_IP,Private_SLB,Public_SLB*/
    @KsYunField(name="TargetType")
    private String TargetType;

    /**目的信息IP*/
    @KsYunField(name="TargetIp")
    private String TargetIp;

    /**端口*/
    @KsYunField(name="PublicPort")
    private Integer PublicPort;

    /**协议，可选值:tcp,udp,icmp*/
    @KsYunField(name="Protocol")
    private String Protocol;

}
