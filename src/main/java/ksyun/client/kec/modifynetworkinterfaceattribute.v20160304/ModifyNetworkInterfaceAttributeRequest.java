package ksyun.client.kec.modifynetworkinterfaceattribute.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ModifyNetworkInterfaceAttributeRequest
* @Description 请求参数
*/
@Data
public class ModifyNetworkInterfaceAttributeRequest{
    /**待修改属性的实例ID
标准UUID格式，形如`^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$`*/
    @KsYunField(name="InstanceId")
    private String InstanceId;

    /**待修改属性的网络接口ID
标准UUID格式，形如`^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$`*/
    @KsYunField(name="NetworkInterfaceId")
    private String NetworkInterfaceId;

    /**新的子网ID
标准UUID格式，形如`^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$`*/
    @KsYunField(name="SubnetId")
    private String SubnetId;

    /**实例绑定的安全组，SecurityGroupId.N可以绑定多个安全组。已绑定的安全组，未重新指定时会被删除。
标准UUID格式，形如`^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$`*/
    @KsYunField(name="SecurityGroupId")
    private List<String> SecurityGroupIdList;

    /**私有IP地址，子网IP地址范围内的任意有效值。
标准IP地址格式*/
    @KsYunField(name="PrivateIpAddress")
    private String PrivateIpAddress;

    /**DNS 1的值，当通过该接口进行修改网络配置时不填写此参数，保持与之前不变。
标准IP地址格式*/
    @KsYunField(name="DNS1")
    private String DNS1;

    /**DNS 2的值，当通过该接口进行修改网络配置时不填写此参数，保持与之前不变。
标准IP地址格式*/
    @KsYunField(name="DNS2")
    private String DNS2;

}