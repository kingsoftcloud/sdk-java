package ksyun.client.vpc.querypeertopvifmonitor.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname QueryPeerTopVifMonitorResponse
* @Description QueryPeerTopVifMonitor 返回体
*/
@Data
@ToString
public class QueryPeerTopVifMonitorResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**BWS相关流量数据*/
    @JsonProperty("NatPeerMonitorData")
    private List<NatPeerMonitorDataDto> NatPeerMonitorData;

    @Data
    @ToString
    public static class NatPeerMonitorDataDto {
        /**主机ID*/
        @JsonProperty("InstanceId")
        private String InstanceId;

        /**实例名称*/
        @JsonProperty("InstanceName")
        private String InstanceName;

        /**实例类型*/
        @JsonProperty("InstanceType")
        private String InstanceType;

        /**入向流量*/
        @JsonProperty("InBound")
        private String InBound;

        /**出向流量*/
        @JsonProperty("OutBound")
        private String OutBound;

        /**实例的网卡在VPC中的IP*/
        @JsonProperty("ip")
        private String Ip;

    }

}
