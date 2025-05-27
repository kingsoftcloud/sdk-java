package ksyun.client.vpc.alteripv6publicipstate.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname AlterIpv6PublicIpStateRequest
* @Description 请求参数
*/
@Data
public class AlterIpv6PublicIpStateRequest{
    /**Ipv6公网的ID*/
    @KsYunField(name="Ipv6PublicIpAddressId")
    private String Ipv6PublicIpAddressId;

    /**状态(start|stop)*/
    @KsYunField(name="State")
    private String State;

}