package ksyun.client.cen.attachnetworkinstance.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname AttachNetworkInstanceRequest
* @Description 请求参数
*/
@Data
public class AttachNetworkInstanceRequest{
    /**云企业网的ID*/
    @KsYunField(name="CenId")
    private String CenId;

    /**网络实例类型*/
    @KsYunField(name="InstanceType")
    private String InstanceType;

    /**金山云地域名称*/
    @KsYunField(name="InstanceRegion")
    private String InstanceRegion;

    /**网络实例ID*/
    @KsYunField(name="NetworkInstanceId")
    private String NetworkInstanceId;

    /**其他账号的ID，当前账号可缺省*/
    @KsYunField(name="InstanceAccountId")
    private String InstanceAccountId;

}