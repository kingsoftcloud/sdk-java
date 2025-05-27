package ksyun.client.vpc.deletenetworkinterface.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DeleteNetworkInterfaceRequest
* @Description 请求参数
*/
@Data
public class DeleteNetworkInterfaceRequest{
    /**网卡的ID*/
    @KsYunField(name="NetworkInterfaceId")
    private String NetworkInterfaceId;

}