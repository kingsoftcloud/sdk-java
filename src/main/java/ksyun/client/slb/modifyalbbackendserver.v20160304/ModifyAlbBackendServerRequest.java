package ksyun.client.slb.modifyalbbackendserver.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ModifyAlbBackendServerRequest
* @Description 请求参数
*/
@Data
public class ModifyAlbBackendServerRequest{
    /**服务器id*/
    @KsYunField(name="BackendServerId")
    private String BackendServerId;

    /**服务器的权重*/
    @KsYunField(name="Weight")
    private Integer Weight;

}