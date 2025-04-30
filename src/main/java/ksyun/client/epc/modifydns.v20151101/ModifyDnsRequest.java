package ksyun.client.epc.modifydns.v20151101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname ModifyDnsRequest
 * @Description 请求参数
 */
@Data
public class ModifyDnsRequest {
    /**
     * 网卡的ID
     */
    @KsYunField(name = "NetworkInterfaceId")
    private String NetworkInterfaceId;

    /**
     * 裸金属服务器资源ID
     */
    @KsYunField(name="HostId")
    private String HostId;

    /**
     * DNS1的值
     */
    @KsYunField(name = "DNS1")
    private String DNS1;

    /**DNS2的值*/
    @KsYunField(name="DNS2")
    private String DNS2;

}