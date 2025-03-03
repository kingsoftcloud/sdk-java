package ksyun.client.vpc.describevpntunnelipsecstatus.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

import java.util.List;

/**
 * @Classname DescribeVpnTunnelIpsecStatusRequest
 * @Description 请求参数
 */
@Data
public class DescribeVpnTunnelIpsecStatusRequest {
    /**
     * 是否是主备机状态(1-隧道1的状态,0-隧道2的状态)
     */
    @KsYunField(name = "IsMaster")
    private Integer IsMaster;

    /**
     * 多个Vpn通道的ID
     */
    @KsYunField(name = "VpnTunnelId")
    private List<String> VpnTunnelIdList;

}