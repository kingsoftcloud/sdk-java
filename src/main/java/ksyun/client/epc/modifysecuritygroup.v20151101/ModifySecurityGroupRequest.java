package ksyun.client.epc.modifysecuritygroup.v20151101;

import common.annotation.KsYunField;
import lombok.Data;

import java.util.List;

/**
 * @Classname ModifySecurityGroupRequest
 * @Description 请求参数
 */
@Data
public class ModifySecurityGroupRequest {
    /**
     * 裸金属服务器资源ID
     */
    @KsYunField(name = "HostId")
    private String HostId;

    /**
     * 网卡的ID
     */
    @KsYunField(name = "NetworkInterfaceId")
    private String NetworkInterfaceId;

    /**
     * 裸金属服务器关联的安全组ID，一个裸金属服务器最多可以支持3个安全组
     */
    @KsYunField(name = "SecurityGroupId")
    private List<String> SecurityGroupIdList;


}