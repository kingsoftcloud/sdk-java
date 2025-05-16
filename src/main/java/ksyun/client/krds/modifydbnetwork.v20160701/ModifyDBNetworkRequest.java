package ksyun.client.krds.modifydbnetwork.v20160701;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname ModifyDBNetworkRequest
 * @Description 请求参数
 */
@Data
public class ModifyDBNetworkRequest {
    /**
     * 实例ID
     */
    @KsYunField(name = "DBInstanceIdentifier")
    private String DBInstanceIdentifier;

    /**
     * 虚拟网路ID，可调用接口[DescribeVpcs](https://docs.ksyun.com/documents/89)获取
     */
    @KsYunField(name = "VpcId")
    private String VpcId;

    /**
     * SubnetId		虚拟网络下的子网ID，可调用接口[DescribeSubnets](https://docs.ksyun.com/documents/93)获取。
     */
    @KsYunField(name = "SubnetId")
    private String SubnetId;

    /**
     * IP		虚拟网络子网下可用IP，可调用接口[DescribeSubnetAllocatedIpAddresses](https://docs.ksyun.com/documents/2607)获取。
     */
    @KsYunField(name = "Vip")
    private String Vip;

    /**
     * 端口
     */
    @KsYunField(name = "Port")
    private String Port;

}