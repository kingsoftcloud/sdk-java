package ksyun.client.vpc.modifynetworkinterface.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ModifyNetworkInterfaceRequest
* @Description 请求参数
*/
@Data
public class ModifyNetworkInterfaceRequest{
    /**网卡的名称*/
    @KsYunField(name="NetworkInterfaceName")
    private String NetworkInterfaceName;

    /**网卡ID*/
    @KsYunField(name="NetworkInterfaceId")
    private String NetworkInterfaceId;

}