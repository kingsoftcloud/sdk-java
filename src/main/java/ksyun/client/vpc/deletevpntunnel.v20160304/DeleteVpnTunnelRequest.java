package ksyun.client.vpc.deletevpntunnel.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DeleteVpnTunnelRequest
 * @Description 请求参数
 */
@Data
public class DeleteVpnTunnelRequest {
    /**
     * Vpn通道的ID
     */
    @KsYunField(name = "VpnTunnelId")
    private String VpnTunnelId;

}