package ksyun.client.kec.attachnetworkinterface.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname AttachNetworkInterfaceRequest
* @Description 请求参数
*/
@Data
public class AttachNetworkInterfaceRequest{
    /**实例ID*/
    @KsYunField(name="InstanceId")
    private String InstanceId;

    /**弹性网卡ID（保留已经上线的参数，该参数与已经上线参数不可同时指定）*/
    @KsYunField(name="NetworkInterfaceId")
    private String NetworkInterfaceId;

    /***/
    @KsYunField(name="SubnetId")
    private String SubnetId;

    /**安全组id*/
    @KsYunField(name="SecurityGroupId",type=1)
    private List<String> SecurityGroupIdList;

    /***/
    @KsYunField(name="PrivateIpAddress")
    private String PrivateIpAddress;

    /***/
    @KsYunField(name="MacAddress")
    private String MacAddress;

}
