package ksyun.client.epc.reinstallcustomerepc.v20151101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ReinstallCustomerEpcRequest
* @Description 请求参数
*/
@Data
public class ReinstallCustomerEpcRequest{
    /**裸金属服务器资源ID*/
    @KsYunField(name="HostId")
    private String HostId;

    /**PXE server的IP*/
    @KsYunField(name="ServerIp")
    private String ServerIp;

    /**PXE server的路径*/
    @KsYunField(name="Path")
    private String Path;

}