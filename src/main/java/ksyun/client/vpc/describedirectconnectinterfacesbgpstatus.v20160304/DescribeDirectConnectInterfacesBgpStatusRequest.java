package ksyun.client.vpc.describedirectconnectinterfacesbgpstatus.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeDirectConnectInterfacesBgpStatusRequest
* @Description 请求参数
*/
@Data
public class DescribeDirectConnectInterfacesBgpStatusRequest{
    /**专线通道id*/
    @KsYunField(name="DirectConnectInterfaceId.N")
    private String DirectConnectInterfaceIdN;

}
