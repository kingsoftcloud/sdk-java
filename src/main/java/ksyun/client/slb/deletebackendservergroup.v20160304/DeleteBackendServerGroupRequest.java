package ksyun.client.slb.deletebackendservergroup.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DeleteBackendServerGroupRequest
 * @Description 请求参数
 */
@Data
public class DeleteBackendServerGroupRequest {
    /**
     * 后端服务组的ID
     */
    @KsYunField(name = "BackendServerGroupId")
    private String BackendServerGroupId;

}