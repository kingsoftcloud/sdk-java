package ksyun.client.vpc.modifyvpngateway.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname ModifyVpnGatewayRequest
 * @Description 请求参数
 */
@Data
public class ModifyVpnGatewayRequest {
    /**
     * VPN网关的ID
     */
    @KsYunField(name = "VpnGatewayId")
    private String VpnGatewayId;

    /**
     * VPN网关的带宽
     */
    @KsYunField(name="BandWidth")
    private Integer BandWidth;

    /**
     * VPN网关的名称
     */
    @KsYunField(name="VpnGatewayName")
    private String VpnGatewayName;

}