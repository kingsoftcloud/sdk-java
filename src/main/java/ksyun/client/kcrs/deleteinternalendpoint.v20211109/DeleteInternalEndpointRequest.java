package ksyun.client.kcrs.deleteinternalendpoint.v20211109;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DeleteInternalEndpointRequest
* @Description 请求参数
*/
@Data
public class DeleteInternalEndpointRequest{
    /**实例id*/
    @KsYunField(name="InstanceId")
    private String InstanceId;

    /**vpcid*/
    @KsYunField(name="VpcId")
    private String VpcId;

    /**内网访问链路ip*/
    @KsYunField(name="EniLBIp")
    private String EniLBIp;


}