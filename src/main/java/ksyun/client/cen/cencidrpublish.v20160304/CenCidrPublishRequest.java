package ksyun.client.cen.cencidrpublish.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CenCidrPublishRequest
* @Description 请求参数
*/
@Data
public class CenCidrPublishRequest{
    /**网络实例的ID*/
    @KsYunField(name="NetworkInstanceId")
    private String NetworkInstanceId;

    /**网络实例类型*/
    @KsYunField(name="InstanceType")
    private String InstanceType;

    /**网络路由的ID*/
    @KsYunField(name="NetworkRouteId",type=2)
    private List<String> NetworkRouteIdList;

    /**网络实例发布的自定义网段*/
    @KsYunField(name="SelfDefineCidr",type=2)
    private List<String> SelfDefineCidrList;

    /**CenId*/
    @KsYunField(name="CenId")
    private String CenId;

}
