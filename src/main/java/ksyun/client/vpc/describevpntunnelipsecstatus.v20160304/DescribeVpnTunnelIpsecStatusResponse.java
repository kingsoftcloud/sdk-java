package ksyun.client.vpc.describevpntunnelipsecstatus.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeVpnTunnelIpsecStatusResponse
* @Description DescribeVpnTunnelIpsecStatus 返回体
*/
@Data
@ToString
public class DescribeVpnTunnelIpsecStatusResponse extends BaseResponseModel {
    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**VPN通道状态信息*/
    @JsonProperty("VpnTunnelIpsecStatusList")
    private List<VpnTunnelIpsecStatusListDto> VpnTunnelIpsecStatusList;

    @Data
    @ToString
    public static class VpnTunnelIpsecStatusListDto {
        /**是否主备*/
        @JsonProperty("isMaster")
        private Integer IsMaster;

        /**ipsec的状态*/
        @JsonProperty("ipsecStatus")
        private Boolean IpsecStatus;

        /**ike的状态*/
        @JsonProperty("ikeStatus")
        private Boolean IkeStatus;

        /**VPN通道id*/
        @JsonProperty("id")
        private String Id;

    }

    /**是否成功*/
    @JsonProperty("Return")
    private Boolean ReturnField;

}
