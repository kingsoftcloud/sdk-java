package ksyun.client.vpc.modifydirectconnectinterface.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ModifyDirectConnectInterfaceRequest
 * @Description 请求参数
 */
@Data
public class ModifyDirectConnectInterfaceRequest {
    /**
     * 连接通道的ID
     */
    @KsYunField(name = "DirectConnectInterfaceId")
    private String DirectConnectInterfaceId;

    /**
     * 连接通道的名称
     */
    @KsYunField(name = "DirectConnectInterfaceName")
    private String DirectConnectInterfaceName;

}