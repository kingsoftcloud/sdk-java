package ksyun.client.vpc.deletedirectconnectinterface.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DeleteDirectConnectInterfaceRequest
 * @Description 请求参数
 */
@Data
public class DeleteDirectConnectInterfaceRequest {
    /**
     * 连接通道的ID
     */
    @KsYunField(name = "DirectConnectInterfaceId")
    private String DirectConnectInterfaceId;

}