package ksyun.client.slb.registeralbbackendserver.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname RegisterAlbBackendServerResponse
* @Description RegisterAlbBackendServer 返回体
*/
@Data
@ToString
public class RegisterAlbBackendServerResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**服务器组信息*/
    @JsonProperty("BackendServer")
    private BackendServerDto BackendServer;

    @Data
    @ToString
    public static class BackendServerDto {
        /**创建时间*/
        @JsonProperty("CreateTime")
        private String CreateTime;

        /**网卡id*/
        @JsonProperty("NetworkInterfaceId")
        private String NetworkInterfaceId;

        /**Alb服务器组id*/
        @JsonProperty("BackendServerGroupId")
        private String BackendServerGroupId;

        /**服务器ip*/
        @JsonProperty("BackendServerIp")
        private String BackendServerIp;

        /**实例id*/
        @JsonProperty("InstanceId")
        private String InstanceId;

        /**服务器id*/
        @JsonProperty("BackendServerId")
        private String BackendServerId;

        /**协议端口*/
        @JsonProperty("Port")
        private Integer Port;

        /**真实服务器的主备状态*/
        @JsonProperty("MasterSlaveType")
        private String MasterSlaveType;

        /**服务器健康检查状态*/
        @JsonProperty("BackendServerState")
        private String BackendServerState;

    }

}
