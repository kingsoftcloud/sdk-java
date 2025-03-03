package ksyun.client.slb.modifybackendservergroup.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ModifyBackendServerGroupRequest
 * @Description 请求参数
 */
@Data
public class ModifyBackendServerGroupRequest {
    /**
     * 服务器组的ID
     */
    @KsYunField(name = "BackendServerGroupId")
    private String BackendServerGroupId;

    /**
     * 服务器组的名称
     */
    @KsYunField(name = "BackendServerGroupName")
    private String BackendServerGroupName;

}