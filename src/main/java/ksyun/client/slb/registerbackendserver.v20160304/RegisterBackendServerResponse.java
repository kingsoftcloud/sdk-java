package ksyun.client.slb.registerbackendserver.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname RegisterBackendServerResponse
* @Description RegisterBackendServer 返回体
*/
@Data
@ToString
public class RegisterBackendServerResponse extends BaseResponseModel {
    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**后端服务的信息*/
    @JsonProperty("BackendServer")
    private BackendServerDto BackendServer;

    @Data
    @ToString
    public static class BackendServerDto {
        /**创建时间*/
        @JsonProperty("CreateTime")
        private String CreateTime;

        /**所属后端服务组的ID*/
        @JsonProperty("BackendServerGroupId")
        private String BackendServerGroupId;

        /**弹性网卡的ID*/
        @JsonProperty("NetworkInterfaceId")
        private String NetworkInterfaceId;

        /**后端服务的IP*/
        @JsonProperty("BackendServerIp")
        private String BackendServerIp;

        /**服务器的ID*/
        @JsonProperty("InstanceId")
        private String InstanceId;

        /**绑定服务器组的注册ID*/
        @JsonProperty("RegisterId")
        private String RegisterId;

        /**后端服务的端口*/
        @JsonProperty("BackendServerPort")
        private Integer BackendServerPort;

        /**实例的权重*/
        @JsonProperty("Weight")
        private Integer Weight;

    }

}
