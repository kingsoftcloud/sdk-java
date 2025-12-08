package ksyun.client.epc.describeroceeventdetails.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeRoceEventDetailsResponse
* @Description DescribeRoceEventDetails 返回体
*/
@Data
@ToString
public class DescribeRoceEventDetailsResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RoceEventDetailResponseSet")
    private List<RoceEventDetailResponseSetDto> RoceEventDetailResponseSet;

    @Data
    @ToString
    public static class RoceEventDetailResponseSetDto {
        /**实例名称*/
        @JsonProperty("InstanceName")
        private String InstanceName;

        /**实例ID*/
        @JsonProperty("InstanceId")
        private String InstanceId;

        /**服务器SN*/
        @JsonProperty("Sn")
        private String Sn;

        /**事件状态：告警发生、告警恢复*/
        @JsonProperty("EventStatus")
        private String EventStatus;

        /**事件发生时间*/
        @JsonProperty("EventTime")
        private String EventTime;

        /**事件名称*/
        @JsonProperty("EventName")
        private String EventName;

        /**交换机名称*/
        @JsonProperty("HostName")
        private String HostName;

        /**交换机端口*/
        @JsonProperty("PortName")
        private String PortName;

    }

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**总条数*/
    @JsonProperty("TotalCount")
    private Integer TotalCount;

    /**下一条*/
    @JsonProperty("NextToken")
    private String NextToken;

}
