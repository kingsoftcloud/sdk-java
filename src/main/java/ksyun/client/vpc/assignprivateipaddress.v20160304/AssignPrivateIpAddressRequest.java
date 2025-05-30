package ksyun.client.vpc.assignprivateipaddress.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname AssignPrivateIpAddressRequest
* @Description 请求参数
*/
@Data
public class AssignPrivateIpAddressRequest{
    /**网卡的ID*/
    @KsYunField(name="NetworkInterfaceId")
    private String NetworkInterfaceId;

    /**辅助私有IP地址*/
    @KsYunField(name="PrivateIpAddress")
    private List<String> PrivateIpAddressList;

    /**分配辅助私网IP数量*/
    @KsYunField(name="SecondaryPrivateIpAddressCount")
    private Integer SecondaryPrivateIpAddressCount;

}