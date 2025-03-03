package ksyun.client.slb.deregisterinstancesfromlistener.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DeregisterInstancesFromListenerRequest
 * @Description 请求参数
 */
@Data
public class DeregisterInstancesFromListenerRequest {
    /**
     * 后端服务器的ID
     */
    @KsYunField(name = "RegisterId")
    private String RegisterId;


}