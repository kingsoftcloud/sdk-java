package ksyun.client.epc.describeepcraidattributes.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeEpcRaidAttributesResponse
* @Description DescribeEpcRaidAttributes 返回体
*/
@Data
@ToString
public class DescribeEpcRaidAttributesResponse extends BaseResponseModel {
    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**获取另一页返回结果的 token.*/
    @JsonProperty("NextToken")
    private String NextToken;

    /**裸金属服务器总数*/
    @JsonProperty("TotalCount")
    private Integer TotalCount;

    /**RAID配置的信息*/
    @JsonProperty("EpcRaidAttributeSet")
    private List<EpcRaidAttributeSetDto> EpcRaidAttributeSet;

    @Data
    @ToString
    public static class EpcRaidAttributeSetDto {
        /**名称*/
        @JsonProperty("TemplateName")
        private String TemplateName;

        /**创建时间*/
        @JsonProperty("CreateTime")
        private String CreateTime;

        /**RaidId*/
        @JsonProperty("RaidId")
        private String RaidId;

        /**云物理主机类型*/
        @JsonProperty("HostType")
        private String HostType;

        /**磁盘信息*/
        @JsonProperty("DiskSet")
        private List<EpcRaidAttributeSetDtoDiskSetDto> DiskSet;

        @Data
        @ToString
        public static class EpcRaidAttributeSetDtoDiskSetDto {
            /**磁盘*/
            @JsonProperty("DiskAttribute")
            private String DiskAttribute;

            /**磁盘数量*/
            @JsonProperty("DiskCount")
            private String DiskCount;

            /**空间*/
            @JsonProperty("Space")
            private String Space;

            /**系统磁盘空间*/
            @JsonProperty("SystemDiskSpace")
            private String SystemDiskSpace;

            /**磁盘空间*/
            @JsonProperty("DiskSpace")
            private String DiskSpace;

            /**Raid*/
            @JsonProperty("Raid")
            private String Raid;

            /**磁盘类型*/
            @JsonProperty("DiskType")
            private String DiskType;

            /**磁盘ID*/
            @JsonProperty("DiskId")
            private String DiskId;

        }

    }

}
