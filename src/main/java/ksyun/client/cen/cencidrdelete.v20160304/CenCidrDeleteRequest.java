package ksyun.client.cen.cencidrdelete.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CenCidrDeleteRequest
* @Description 请求参数
*/
@Data
public class CenCidrDeleteRequest{
    /**网络实例的ID*/
    @KsYunField(name="NetworkInstanceId")
    private String NetworkInstanceId;

    /**网络实例类型*/
    @KsYunField(name="InstanceType")
    private String InstanceType;

    /**网络路由的ID*/
    @KsYunField(name="NetworkRouteId",type=2)
    private List<String> NetworkRouteIdList;

    /**自定义网段路由的ID*/
    @KsYunField(name="SelfRouteId",type=2)
    private List<String> SelfRouteIdList;

    /**云企业网ID*/
    @KsYunField(name="CenId")
    private String CenId;

}
