package ksyun.client.vpc.createvpc.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreateVpcRequest
* @Description 请求参数
*/
@Data
public class CreateVpcRequest{
    /**Vpc的名称*/
    @KsYunField(name="VpcName")
    private String VpcName;

    /**Vpc的网络范围，例如：10.0.0.0/16*/
    @KsYunField(name="CidrBlock")
    private String CidrBlock;

    /**是否支持IPv6网段，目前只支持部分机房*/
    @KsYunField(name="ProvidedIpv6CidrBlock")
    private Boolean ProvidedIpv6CidrBlock;

}