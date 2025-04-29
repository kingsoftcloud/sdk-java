package ksyun.client.slb.modifyinstanceswithlistener.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ModifyInstancesWithListenerRequest
* @Description 请求参数
*/
@Data
public class ModifyInstancesWithListenerRequest{
    /**后端服务器的ID*/
    @KsYunField(name="RegisterId")
    private String RegisterId;

    /**实例的权重*/
    @KsYunField(name="Weight")
    private Integer Weight;

    /**后端服务的端口*/
    @KsYunField(name="RealServerPort")
    private Integer RealServerPort;

    /**RealServer的主备类型(Master | Slave)，仅MasterSlave监听器有此参数*/
    @KsYunField(name="MasterSlaveType")
    private String MasterSlaveType;

    /**标签*/
    @KsYunField(name="Tag")
    private String Tag;

}