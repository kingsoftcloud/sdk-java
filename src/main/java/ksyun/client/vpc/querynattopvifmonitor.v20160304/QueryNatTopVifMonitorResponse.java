package ksyun.client.vpc.querynattopvifmonitor.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname QueryNatTopVifMonitorResponse
* @Description QueryNatTopVifMonitor 返回体
*/
@Data
@ToString
public class QueryNatTopVifMonitorResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**Nat相关流量数据*/
    @JsonProperty("NatMonitorDataList")
    private List<NatMonitorDataListDto> NatMonitorDataList;

    @Data
    @ToString
    public static class NatMonitorDataListDto {
        /**实例id*/
        @JsonProperty("InstanceId")
        private String InstanceId;

        /**实例名*/
        @JsonProperty("InstanceName")
        private String InstanceName;

        /**主机的网卡在VPC中的IP*/
        @JsonProperty("ip")
        private String Ip;

        /**入向流量*/
        @JsonProperty("InBound")
        private String InBound;

        /**出向流量*/
        @JsonProperty("OutBound")
        private String OutBound;

        /**入向峰值流量*/
        @JsonProperty("InPeakBound")
        private String InPeakBound;

        /**出向峰值流量*/
        @JsonProperty("OutPeakBound")
        private String OutPeakBound;

        /**明细数据*/
        @JsonProperty("MemberData")
        private List<NatMonitorDataListMemberDataDto> MemberData;

        @Data
        @ToString
        public static class NatMonitorDataListMemberDataDto {
            /**时间带格式的，yyyy-MM-dd HH:mm:ss*/
            @JsonProperty("Timestamp")
            private String Timestamp;

            /**时间点，时间戳*/
            @JsonProperty("UnixTimestamp")
            private String UnixTimestamp;

            /**入向流量单元值*/
            @JsonProperty("InBoundValue")
            private String InBoundValue;

            /**出向流量单元值*/
            @JsonProperty("OutBoundValue")
            private String OutBoundValue;

        }

        /**实例排名*/
        @JsonProperty("Num")
        private String Num;

    }

}
