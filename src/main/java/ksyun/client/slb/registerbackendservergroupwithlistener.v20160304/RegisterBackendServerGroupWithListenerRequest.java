package ksyun.client.slb.registerbackendservergroupwithlistener.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname RegisterBackendServerGroupWithListenerRequest
* @Description 请求参数
*/
@Data
public class RegisterBackendServerGroupWithListenerRequest{
    /**监听器的ID*/
    @KsYunField(name="ListenerId")
    private String ListenerId;

    /**后端服务器组的ID*/
    @KsYunField(name="BackendServerGroupId")
    private String BackendServerGroupId;

}
