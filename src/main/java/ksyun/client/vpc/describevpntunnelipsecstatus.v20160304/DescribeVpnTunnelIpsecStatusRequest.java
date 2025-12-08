package ksyun.client.vpc.describevpntunnelipsecstatus.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeVpnTunnelIpsecStatusRequest
* @Description 请求参数
*/
@Data
public class DescribeVpnTunnelIpsecStatusRequest{
    /**是否是主备机状态(1-隧道1的状态,0-隧道2的状态)*/
    @KsYunField(name="IsMaster")
    private Integer IsMaster;

    /**多个Vpn通道的ID*/
    @KsYunField(name="VpnTunnelId",type=2)
    private List<String> VpnTunnelIdList;

}
