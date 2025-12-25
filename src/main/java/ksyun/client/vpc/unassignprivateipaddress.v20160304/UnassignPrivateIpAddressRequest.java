package ksyun.client.vpc.unassignprivateipaddress.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname UnassignPrivateIpAddressRequest
* @Description 请求参数
*/
@Data
public class UnassignPrivateIpAddressRequest{
    /**网卡的ID*/
    @KsYunField(name="NetworkInterfaceId")
    private String NetworkInterfaceId;

    /**辅助私有IP地址*/
    @KsYunField(name = "PrivateIpAddress", type = 1)
    private List<String> PrivateIpAddressList;

}
