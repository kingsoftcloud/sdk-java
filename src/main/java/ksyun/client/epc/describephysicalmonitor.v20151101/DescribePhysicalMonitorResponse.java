package ksyun.client.epc.describephysicalmonitor.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribePhysicalMonitorResponse
* @Description DescribePhysicalMonitor 返回体
*/
@Data
@ToString
public class DescribePhysicalMonitorResponse extends BaseResponseModel {
    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**CPU监控的信息*/
    @JsonProperty("CPUInfo")
    private List<CPUInfoDto> CPUInfo;

    @Data
    @ToString
    public static class CPUInfoDto {
        /**所属硬件*/
        @JsonProperty("Item")
        private String Item;

        /**硬件状态值*/
        @JsonProperty("Status")
        private String Status;

    }

    /**内存监控的信息*/
    @JsonProperty("MemoryInfo")
    private List<MemoryInfoDto> MemoryInfo;

    @Data
    @ToString
    public static class MemoryInfoDto {
        /**所属硬件*/
        @JsonProperty("Item")
        private String Item;

        /**硬件状态值*/
        @JsonProperty("Status")
        private String Status;

    }

    /**Disk监控的信息*/
    @JsonProperty("DiskInfo")
    private List<DiskInfoDto> DiskInfo;

    @Data
    @ToString
    public static class DiskInfoDto {
        /**所属硬件*/
        @JsonProperty("Item")
        private String Item;

        /**硬件状态值*/
        @JsonProperty("Status")
        private String Status;

    }

    /**风扇监控的信息*/
    @JsonProperty("FanInfo")
    private List<FanInfoDto> FanInfo;

    @Data
    @ToString
    public static class FanInfoDto {
        /**所属硬件*/
        @JsonProperty("Item")
        private String Item;

        /**硬件状态值*/
        @JsonProperty("Status")
        private String Status;

    }

    /**电源监控的信息*/
    @JsonProperty("PowerInfo")
    private List<PowerInfoDto> PowerInfo;

    @Data
    @ToString
    public static class PowerInfoDto {
        /**所属硬件*/
        @JsonProperty("Item")
        private String Item;

        /**硬件状态值*/
        @JsonProperty("Status")
        private String Status;

    }

}
