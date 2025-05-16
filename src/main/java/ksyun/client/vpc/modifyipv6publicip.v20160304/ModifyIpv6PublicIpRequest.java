package ksyun.client.vpc.modifyipv6publicip.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname ModifyIpv6PublicIpRequest
 * @Description 请求参数
 */
@Data
public class ModifyIpv6PublicIpRequest {
    /**
     * Ipv6公网的ID
     */
    @KsYunField(name = "Ipv6PublicIpAddressId")
    private String Ipv6PublicIpAddressId;

    /**
     * Ipv6公网的带宽
     */
    @KsYunField(name = "BandWidth")
    private Integer BandWidth;

}