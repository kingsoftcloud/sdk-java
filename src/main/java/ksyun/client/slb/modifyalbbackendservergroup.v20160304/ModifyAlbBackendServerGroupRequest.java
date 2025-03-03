package ksyun.client.slb.modifyalbbackendservergroup.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ModifyAlbBackendServerGroupRequest
 * @Description 请求参数
 */
@Data
public class ModifyAlbBackendServerGroupRequest {
    /**
     * ALB服务器组id
     */
    @KsYunField(name = "BackendServerGroupId")
    private String BackendServerGroupId;

    /**
     * ALB负载均衡的名称
     */
    @KsYunField(name = "Name")
    private String Name;

    /**
     * 后端长连接类型
     */
    @KsYunField(name = "UpstreamKeepalive")
    private String UpstreamKeepalive;


}