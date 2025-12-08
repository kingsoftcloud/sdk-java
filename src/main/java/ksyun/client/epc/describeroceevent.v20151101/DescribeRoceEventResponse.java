package ksyun.client.epc.describeroceevent.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeRoceEventResponse
* @Description DescribeRoceEvent 返回体
*/
@Data
@ToString
public class DescribeRoceEventResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RoceEventResponseSet")
    private List<RoceEventResponseSetDto> RoceEventResponseSet;

    @Data
    @ToString
    public static class RoceEventResponseSetDto {
        /**事件发生事件*/
        @JsonProperty("EventTime")
        private String EventTime;

        /**事件描述*/
        @JsonProperty("EventName")
        private String EventName;

        /**事件状态
0：事件触发
10：已认领 
20：处理中
30：验证中
31：验证成功
32：验证失败
40：完成*/
        @JsonProperty("EventStatus")
        private Integer EventStatus;

        /**事件ID*/
        @JsonProperty("EventId")
        private String EventId;

        /**实例名称*/
        @JsonProperty("InstanceName")
        private String InstanceName;

        /**实力ID*/
        @JsonProperty("InstanceId")
        private String InstanceId;

        /**sn*/
        @JsonProperty("Sn")
        private String Sn;

        /**事件描述*/
        @JsonProperty("EventDesc")
        private String EventDesc;

        /**RoceIp*/
        @JsonProperty("RoceIp")
        private String RoceIp;

        /**网卡类型
storage存储卡
calculate计算卡*/
        @JsonProperty("RoceType")
        private String RoceType;

        /**网卡名称*/
        @JsonProperty("RoceInterfaceName")
        private String RoceInterfaceName;

        /**可用区*/
        @JsonProperty("AvailabilityZone")
        private String AvailabilityZone;

    }

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**总条数*/
    @JsonProperty("TotalCount")
    private Integer TotalCount;

    /**第几条*/
    @JsonProperty("NextToken")
    private String NextToken;

}
