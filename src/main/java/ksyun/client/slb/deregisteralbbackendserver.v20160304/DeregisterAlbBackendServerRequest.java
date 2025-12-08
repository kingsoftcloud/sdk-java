package ksyun.client.slb.deregisteralbbackendserver.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DeregisterAlbBackendServerRequest
* @Description 请求参数
*/
@Data
public class DeregisterAlbBackendServerRequest{
    /**服务器id*/
    @KsYunField(name="BackendServerId")
    private String BackendServerId;

}
