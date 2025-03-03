package ksyun.client.vpc.modifynetworkinterface.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ModifyNetworkInterfaceRequest
 * @Description 请求参数
 */
@Data
public class ModifyNetworkInterfaceRequest {
    /**
     * 网卡的名称
     */
    @KsYunField(name = "NetworkInterfaceName")
    private String NetworkInterfaceName;

    /**
     * 网卡ID
     */
    @KsYunField(name = "NetworkInterfaceId")
    private String NetworkInterfaceId;


}