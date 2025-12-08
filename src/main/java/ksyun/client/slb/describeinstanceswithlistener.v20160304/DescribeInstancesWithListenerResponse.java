package ksyun.client.slb.describeinstanceswithlistener.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeInstancesWithListenerResponse
* @Description DescribeInstancesWithListener 返回体
*/
@Data
@ToString
public class DescribeInstancesWithListenerResponse extends BaseResponseModel {
    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**获取另一页返回结果的 token.*/
    @JsonProperty("NextToken")
    private String NextToken;

    /**真实服务器的信息*/
    @JsonProperty("RealServerSet")
    private List<RealServerSetDto> RealServerSet;

    @Data
    @ToString
    public static class RealServerSetDto {
        /**后端服务的创建时间*/
        @JsonProperty("CreateTime")
        private String CreateTime;

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

        /**- 实例ID
- host类型，填写云主机或者云物理主机的ID*/
        @JsonProperty("InstanceId")
        private String InstanceId;

        /**标签*/
        @JsonProperty("Tag")
        private String Tag;

        /**RealServer的主备类型，仅MasterSlave监听器有此参数*/
        @JsonProperty("MasterSlaveType")
        private String MasterSlaveType;

        /**弹性网卡的ID*/
        @JsonProperty("NetworkInterfaceId")
        private String NetworkInterfaceId;

    }

}
