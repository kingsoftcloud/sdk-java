package ksyun.client.cen.cencidrdelete.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

import java.util.List;

/**
 * @Classname CenCidrDeleteRequest
 * @Description 请求参数
 */
@Data
public class CenCidrDeleteRequest {
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

}