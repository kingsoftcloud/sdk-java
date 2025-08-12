package ksyun.client.epc.modifynetworkinterfaceattribute.v20151101;

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
public class ModifyNetworkInterfaceAttributeRequest {
    /**
     * 网卡ID
     */
    @KsYunField(name = "NetworkInterfaceId")
    private String NetworkInterfaceId;

    /**
     * 物理机实例ID
     */
    @KsYunField(name="HostId")
    private String HostId;

    /**
     * SubnetId
     */
    @KsYunField(name= "SubnetId")
    private String SubnetId;

    /**ip地址*/
    @KsYunField(name="IpAddress")
    private String IpAddress;

    /**
     * 云物理主机关联的安全组ID，一个云物理主机最多可以支持5个安全组
     */
    @KsYunField(name="SecurityGroupIdList",type = 2)
    private List<String> SecurityGroupIdListList;

    /**
     * 安全组,更换vpc必填
     */
    @KsYunField(name = "SecurityGroupId")
    private List<String> SecurityGroupIdList;

}