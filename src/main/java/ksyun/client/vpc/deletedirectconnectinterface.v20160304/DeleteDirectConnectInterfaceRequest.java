package ksyun.client.vpc.deletedirectconnectinterface.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DeleteDirectConnectInterfaceRequest
* @Description 请求参数
*/
@Data
public class DeleteDirectConnectInterfaceRequest{
    /**连接通道的ID*/
    @KsYunField(name="DirectConnectInterfaceId")
    private String DirectConnectInterfaceId;

}