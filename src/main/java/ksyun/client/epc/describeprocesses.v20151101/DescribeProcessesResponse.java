package ksyun.client.epc.describeprocesses.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeProcessesResponse
* @Description DescribeProcesses 返回体
*/
@Data
@ToString
public class DescribeProcessesResponse extends BaseResponseModel {
    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**获取另一页返回结果的 token.*/
    @JsonProperty("NextToken")
    private String NextToken;

    /**裸金属服务器总数*/
    @JsonProperty("TotalCount")
    private Integer TotalCount;

    /**工单的信息*/
    @JsonProperty("ProcessSet")
    private List<ProcessSetDto> ProcessSet;

    @Data
    @ToString
    public static class ProcessSetDto {
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

        /**状态*/
        @JsonProperty("Status")
        private String Status;

        /**工单类型：Network | Disk | Cpu | Gpu | RaidCard | NetworkInterfaceCard | Other*/
        @JsonProperty("Attribute")
        private String Attribute;

        /**云物理工单ID*/
        @JsonProperty("ProcessId")
        private String ProcessId;

        /**工单ID*/
        @JsonProperty("OperationProcessId")
        private String OperationProcessId;

        /**创建时间*/
        @JsonProperty("CreateTime")
        private String CreateTime;

        /**结束时间*/
        @JsonProperty("FinishTime")
        private String FinishTime;

        /**来源,0:用户|1：售后*/
        @JsonProperty("Source")
        private String Source;

        /**描述*/
        @JsonProperty("Content")
        private String Content;

        /**服务器数量，通常填写1*/
        @JsonProperty("MachineCount")
        private Integer MachineCount;

        /**标题*/
        @JsonProperty("Title")
        private String Title;

        /**操作类型,有效值:fix*/
        @JsonProperty("Type")
        private String Type;

        /**确认是否操作 有效值：0,1*/
        @JsonProperty("Confirm")
        private String Confirm;

        /**机型*/
        @JsonProperty("HostTypeName")
        private String HostTypeName;

        /**物理机名称*/
        @JsonProperty("HostName")
        private String HostName;

        /**物理机工单评论回复信息*/
        @JsonProperty("CommunicationContentSet")
        private List<CommunicationContentSetDto> CommunicationContentSet;

        @Data
        @ToString
        public static class CommunicationContentSetDto {
            /**评论或回复*/
            @JsonProperty("Remarks")
            private String Remarks;

            /**作者*/
            @JsonProperty("Author")
            private String Author;

            /**创建时间*/
            @JsonProperty("CreateTime")
            private String CreateTime;

        }

        /**物理机类型*/
        @JsonProperty("HostType")
        private String HostType;

        /**一级故障类型*/
        @JsonProperty("FaultTypeLv1")
        private String FaultTypeLv1;

        /**一级故障类型名称*/
        @JsonProperty("FaultTypeLv1Name")
        private String FaultTypeLv1Name;

        /**二级故障类型*/
        @JsonProperty("FaultTypeLv2")
        private String FaultTypeLv2;

        /**二级故障类型名称*/
        @JsonProperty("FaultTypeLv2Name")
        private String FaultTypeLv2Name;

        /**四级故障类型*/
        @JsonProperty("FaultTypeLv4")
        private String FaultTypeLv4;

        /**四级故障类型名称*/
        @JsonProperty("FaultTypeLv4Name")
        private String FaultTypeLv4Name;

        /**三级故障类型*/
        @JsonProperty("FaultTypeLv3")
        private String FaultTypeLv3;

        /**三级故障类型名称*/
        @JsonProperty("FaultTypeLv3Name")
        private String FaultTypeLv3Name;

        /**故障描述*/
        @JsonProperty("FaultMsg")
        private String FaultMsg;

        /**    名称：结单类型
    有效值：
        ▪ HardwareMalfunctionRepairCompleted
        ▪ HardwareMalfunctionCanNotRepair
        ▪ NoHardwareFailure*/
        @JsonProperty("ProcessSettlementType")
        private String ProcessSettlementType;

        /**    名称：结单原因
    示例值：服务器硬盘故障，更换硬盘恢复*/
        @JsonProperty("ProcessSettlementReason")
        private String ProcessSettlementReason;

    }

}
