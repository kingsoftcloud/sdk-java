package ksyun.client.kec.detachnetworkinterface.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DetachNetworkInterfaceRequest
* @Description 请求参数
*/
@Data
public class DetachNetworkInterfaceRequest{
    /**实例ID*/
    @KsYunField(name="InstanceId")
    private String InstanceId;

    /**弹性网卡ID*/
    @KsYunField(name="NetworkInterfaceId")
    private String NetworkInterfaceId;

}