package ksyun.client.vpc.modifyvpntunnel.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ModifyVpnTunnelRequest
 * @Description 请求参数
 */
@Data
public class ModifyVpnTunnelRequest {
    /**
     * Vpn通道的ID
     */
    @KsYunField(name = "VpnTunnelId")
    private String VpnTunnelId;

    /**
     * Vpn通道的名称
     */
    @KsYunField(name = "VpnTunnelName")
    private String VpnTunnelName;


}