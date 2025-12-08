package ksyun.client.slb.modifyinstanceswithlistener.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ModifyInstancesWithListenerResponse
* @Description ModifyInstancesWithListener 返回体
*/
@Data
@ToString
public class ModifyInstancesWithListenerResponse extends BaseResponseModel {
    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**后端服务器的ID*/
    @JsonProperty("RegisterId")
    private String RegisterId;

    /**真实服务器的状态，健康，不健康，检查未完成，检查未开启*/
    @JsonProperty("RealServerState")
    private String RealServerState;

    /**后端服务器的类型*/
    @JsonProperty("RealServerType")
    private String RealServerType;

    /**监听器的ID*/
    @JsonProperty("ListenerId")
    private String ListenerId;

    /**实例的权重*/
    @JsonProperty("Weight")
    private Integer Weight;

    /**真实服务的IP*/
    @JsonProperty("RealServerIp")
    private String RealServerIp;

    /**后端服务的端口*/
    @JsonProperty("RealServerPort")
    private Integer RealServerPort;

    /**标签*/
    @JsonProperty("Tag")
    private String Tag;

    /**RealServer的主备类型，仅MasterSlave监听器有此参数*/
    @JsonProperty("MasterSlaveType")
    private String MasterSlaveType;

}
