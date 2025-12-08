package ksyun.client.slb.modifybackendserver.v20250430;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ModifyBackendServerRequest
* @Description 请求参数
*/
@Data
public class ModifyBackendServerRequest{
    /**服务器id*/
    @KsYunField(name="BackendServerId")
    private String BackendServerId;

    /**服务器的权重*/
    @KsYunField(name="Weight")
    private Integer Weight;

    /**服务器端口*/
    @KsYunField(name="Port")
    private Integer Port;

    /**真实服务器的主备状态(Master | Slave)*/
    @KsYunField(name="MasterSlaveType")
    private String MasterSlaveType;

}
