package ksyun.client.slb.deregisteralbbackendserver.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DeregisterAlbBackendServerRequest
 * @Description 请求参数
 */
@Data
public class DeregisterAlbBackendServerRequest {
    /**
     * 服务器id
     */
    @KsYunField(name = "BackendServerId")
    private String BackendServerId;

}