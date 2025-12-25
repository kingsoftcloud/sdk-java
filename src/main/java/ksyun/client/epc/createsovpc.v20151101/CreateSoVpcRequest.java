package ksyun.client.epc.createsovpc.v20151101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreateSoVpcRequest
* @Description 请求参数
*/
@Data
public class CreateSoVpcRequest{
    /**VPC的名称。*/
    @KsYunField(name="VpcName")
    private String VpcName;

    /**VPC的描述信息。*/
    @KsYunField(name="Description")
    private String Description;

    /**VPC的IPv4网段。可以使用以下网段或其子集作为VPC的IPv4网段：
• 192.168.0.0/16 ~ 24
• 10.0.0.0/8 ~ 24
• 172.16.0.0/12 ~ 24*/
    @KsYunField(name="CidrBlock")
    private String CidrBlock;

    /**VPC的DNS服务器地址。
• 参数 - N：表示DNS服务器地址的序号，单次调用数量上限为5个，每个DnsServer必须以合法IP形式给出。
• 多个IP之间用&分隔。
• 不填则配置为默认DNS服务器地址。*/
    @KsYunField(name = "DnsServers", type = 1)
    private List<String> DnsServersList;

    /**关联的VPC ID*/
    @KsYunField(name="AttachVpcId")
    private String AttachVpcId;

    /**星海专区*/
    @KsYunField(name="SoZoneId")
    private String SoZoneId;

}
