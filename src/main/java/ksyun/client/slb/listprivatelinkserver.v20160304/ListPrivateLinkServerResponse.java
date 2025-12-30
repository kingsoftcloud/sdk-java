package ksyun.client.slb.listprivatelinkserver.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ListPrivateLinkServerResponse
* @Description ListPrivateLinkServer 返回体
*/
@Data
@ToString
public class ListPrivateLinkServerResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**PrivateLink的信息*/
    @JsonProperty("PrivateLinkSet")
    private PrivateLinkSetDto PrivateLinkSet;

    @Data
    @ToString
    public static class PrivateLinkSetDto {
        /**创建时间*/
        @JsonProperty("CreateTime")
        private String CreateTime;

        /**PrivateLinkId的ID*/
        @JsonProperty("PrivateLinkId")
        private String PrivateLinkId;

        /**PrivateLinkServer的ID*/
        @JsonProperty("PrivateLinkServerId")
        private String PrivateLinkServerId;

        /**客户ID*/
        @JsonProperty("AccountId")
        private String AccountId;

        /**关联监听器ID*/
        @JsonProperty("ListenerId")
        private String ListenerId;

        /**服务端客户ID*/
        @JsonProperty("ServiceAccountId")
        private String ServiceAccountId;

        /**更新时间*/
        @JsonProperty("UpdateTime")
        private String UpdateTime;

        /**项目的ID*/
        @JsonProperty("ProjectId")
        private String ProjectId;

        /**连接状态*/
        @JsonProperty("ConnectionStatus")
        private String ConnectionStatus;

        /**负载均衡id*/
        @JsonProperty("LoadBalancerId")
        private String LoadBalancerId;

        /**监听器的协议端口*/
        @JsonProperty("ListenerPort")
        private Integer ListenerPort;

        /**服务结束时间*/
        @JsonProperty("ServiceEndTime")
        private String ServiceEndTime;

    }

}
