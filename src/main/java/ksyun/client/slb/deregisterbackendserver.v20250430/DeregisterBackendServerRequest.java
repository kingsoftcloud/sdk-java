package ksyun.client.slb.deregisterbackendserver.v20250430;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DeregisterBackendServerRequest
* @Description 请求参数
*/
@Data
public class DeregisterBackendServerRequest{
    /**服务器id*/
    @KsYunField(name="BackendServerId")
    private String BackendServerId;

}
