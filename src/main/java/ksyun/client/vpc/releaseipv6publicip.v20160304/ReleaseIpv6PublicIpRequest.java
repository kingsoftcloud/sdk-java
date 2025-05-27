package ksyun.client.vpc.releaseipv6publicip.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ReleaseIpv6PublicIpRequest
* @Description 请求参数
*/
@Data
public class ReleaseIpv6PublicIpRequest{
    /**Ipv6公网的ID*/
    @KsYunField(name="Ipv6PublicIpAddressId")
    private String Ipv6PublicIpAddressId;

}