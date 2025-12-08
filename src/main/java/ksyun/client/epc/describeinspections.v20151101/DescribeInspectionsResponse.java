package ksyun.client.epc.describeinspections.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeInspectionsResponse
* @Description DescribeInspections 返回体
*/
@Data
@ToString
public class DescribeInspectionsResponse extends BaseResponseModel {
    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**获取另一页返回结果的 token.*/
    @JsonProperty("NextToken")
    private String NextToken;

    /**裸金属服务器总数*/
    @JsonProperty("TotalCount")
    private Integer TotalCount;

    /**故障的信息*/
    @JsonProperty("InspectionSet")
    private List<InspectionSetDto> InspectionSet;

    @Data
    @ToString
    public static class InspectionSetDto {
        /**云物理主机资源ID*/
        @JsonProperty("HostId")
        private String HostId;

        /**云物理主机序列号*/
        @JsonProperty("Sn")
        private String Sn;

        /**机房信息*/
        @JsonProperty("Region")
        private String Region;

        /**可用区*/
        @JsonProperty("AvailabilityZone")
        private String AvailabilityZone;

        /**告警状态*/
        @JsonProperty("Status")
        private String Status;

        /**告警类型：硬盘 | 内存 | 电源 | 端口 | 建康灯 | 风扇 | 主板*/
        @JsonProperty("AlarmType")
        private String AlarmType;

        /**告警描述*/
        @JsonProperty("AlarmDescription")
        private String AlarmDescription;

        /**创建时间*/
        @JsonProperty("CreateTime")
        private String CreateTime;

        /**交换机名称*/
        @JsonProperty("TorName")
        private String TorName;

        /**机柜名称*/
        @JsonProperty("CabinetName")
        private String CabinetName;

    }

}
