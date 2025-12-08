package ksyun.client.vpc.creatednat.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreateDnatRequest
* @Description 请求参数
*/
@Data
public class CreateDnatRequest{
    /**Nat的ID*/
    @KsYunField(name="NatId")
    private String NatId;

    /**Nat的IP*/
    @KsYunField(name="NatIp")
    private String NatIp;

    /**Dnat规则的名称*/
    @KsYunField(name="DnatName")
    private String DnatName;

    /**公网端口*/
    @KsYunField(name="PublicPort")
    private String PublicPort;

    /**服务器的私网IP*/
    @KsYunField(name="PrivateIpAddress")
    private String PrivateIpAddress;

    /**协议类型*/
    @KsYunField(name="IpProtocol")
    private String IpProtocol;

    /**服务器端口*/
    @KsYunField(name="PrivatePort")
    private String PrivatePort;

    /**描述信息*/
    @KsYunField(name="Description")
    private String Description;

}
