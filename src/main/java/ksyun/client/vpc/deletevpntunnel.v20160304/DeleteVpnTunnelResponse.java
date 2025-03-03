package ksyun.client.vpc.deletevpntunnel.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname DeleteVpnTunnelResponse
 * @Description DeleteVpnTunnel 返回体
 */
@Data
@ToString
public class DeleteVpnTunnelResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
