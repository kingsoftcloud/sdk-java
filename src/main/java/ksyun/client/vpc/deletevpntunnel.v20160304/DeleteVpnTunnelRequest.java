package ksyun.client.vpc.deletevpntunnel.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DeleteVpnTunnelRequest
* @Description 请求参数
*/
@Data
public class DeleteVpnTunnelRequest{
    /**Vpn通道的ID*/
    @KsYunField(name="VpnTunnelId")
    private String VpnTunnelId;

}
