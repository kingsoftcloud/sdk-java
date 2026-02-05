package ksyun.client.kce.createwebsocketpublicuri.v20190806;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreateWebSocketPublicUriRequest
* @Description 请求参数
*/
@Data
public class CreateWebSocketPublicUriRequest{
    /**集群ID*/
    @KsYunField(name="ClusterId")
    private String ClusterId;

    /**k8s集群命名空间*/
    @KsYunField(name="Namespace")
    private String Namespace;

    /**Pod名称*/
    @KsYunField(name="PodName")
    private String PodName;

    /**容器名*/
    @KsYunField(name="ContainerName")
    private String ContainerName;

    /**启动命令*/
    @KsYunField(name="Command")
    private String Command;

    /**保持连接*/
    @KsYunField(name="Tty")
    private Boolean Tty;

}
