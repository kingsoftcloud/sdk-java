package ksyun.client.slb.registerbackendserver.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname RegisterBackendServerRequest
 * @Description 请求参数
 */
@Data
public class RegisterBackendServerRequest {
    /**
     * 所属后端服务组的ID
     */
    @KsYunField(name = "BackendServerGroupId")
    private String BackendServerGroupId;

    /**
     * 后端服务的IP
     */
    @KsYunField(name = "BackendServerIp")
    private String BackendServerIp;

    /**
     * 后端服务的端口
     */
    @KsYunField(name = "BackendServerPort")
    private Integer BackendServerPort;

    /**
     * 实例的权重
     */
    @KsYunField(name = "Weight")
    private Integer Weight;

}