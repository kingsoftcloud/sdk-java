package ksyun.client.cen.cencidrpublish.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

import java.util.List;

/**
 * @Classname CenCidrPublishRequest
 * @Description 请求参数
 */
@Data
public class CenCidrPublishRequest {
    /**
     * 网络实例的ID
     */
    @KsYunField(name = "NetworkInstanceId")
    private String NetworkInstanceId;

    /**
     * 网络实例类型
     */
    @KsYunField(name = "InstanceType")
    private String InstanceType;

    /**
     * 网络路由的ID
     */
    @KsYunField(name = "NetworkRouteId")
    private List<String> NetworkRouteIdList;

    /**
     * 网络实例发布的自定义网段
     */
    @KsYunField(name = "SelfDefineCidr")
    private List<String> SelfDefineCidrList;

}