package ksyun.client.kpfs.describefilesystemlist.v20240930;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeFileSystemListResponse
* @Description DescribeFileSystemList 返回体
*/
@Data
@ToString
public class DescribeFileSystemListResponse extends BaseResponseModel {

    /**唯一请求ID，每次请求都会返回。*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**文件系统的描述信息列表*/
    @JsonProperty("Data")
    private List<DataDto> Data;

    @Data
    @ToString
    public static class DataDto {
        /**文件系统的运行状态。有效值：creating（创建中）、using（运行中）、upgrading（扩容中）、renewing（续费中，仅包年包月支持该状态）、shutdown（已关停）*/
        @JsonProperty("Status")
        private String Status;

        /**文件系统的购买信息*/
        @JsonProperty("ChargeInfo")
        private DataChargeInfoDto ChargeInfo;

        @Data
        @ToString
        public static class DataChargeInfoDto {
            /**计费类型。有效值：monthly（包年包月，预付费）、dailySettlement（按量付费，后付费）*/
            @JsonProperty("ChargeType")
            private String ChargeType;

            /**到期时间，仅包年包月计费类型返回*/
            @JsonProperty("ExpiredTime")
            private String ExpiredTime;

        }

        /**文件系统的基本信息*/
        @JsonProperty("FileSystemInfo")
        private DataFileSystemInfoDto FileSystemInfo;

        @Data
        @ToString
        public static class DataFileSystemInfoDto {
            /**文件系统名称*/
            @JsonProperty("FileSystemName")
            private String FileSystemName;

            /**容量配额*/
            @JsonProperty("Capacity")
            private Long Capacity;

            /**所在Region*/
            @JsonProperty("Region")
            private String Region;

            /**所在Region中文名称*/
            @JsonProperty("RegionName")
            private String RegionName;

            /**所在可用区*/
            @JsonProperty("AvailZone")
            private String AvailZone;

            /**实例ID*/
            @JsonProperty("FileSystemId")
            private String FileSystemId;

            /**创建时间*/
            @JsonProperty("CreateTime")
            private String CreateTime;

            /**更新时间。当做扩容或续费时，会改变更新时间*/
            @JsonProperty("UpdateTime")
            private String UpdateTime;

            /**存储类型。有效值：KPFS-capacity（容量Ⅰ型）、KPFS-capacity2（容量Ⅱ型）、KPFS-standard（标准型）、KPFS-P-S01（性能Ⅰ型）、KPFS-P-S02（性能Ⅱ型）*/
            @JsonProperty("StoreClass")
            private String StoreClass;

            /**客户端下载指令以及挂载指令，仅容量Ⅰ型、容量Ⅱ型、标准型返回*/
            @JsonProperty("ClientMountCommand")
            private String ClientMountCommand;

            /**条带块大小，仅性能Ⅰ型、性能Ⅱ型返回。单位：Byte*/
            @JsonProperty("ChunkSize")
            private String ChunkSize;

            /**存储RoCE集群名称*/
            @JsonProperty("SRoceCluster")
            private String SRoceCluster;

            /**存储池名称*/
            @JsonProperty("ClusterName")
            private String ClusterName;

            /**存储池唯一标识UUID，仅性能型返回*/
            @JsonProperty("ClusterCode")
            private String ClusterCode;

        }

        /**文件系统的认证信息*/
        @JsonProperty("AccessRules")
        private List<DataAccessRulesDto> AccessRules;

        @Data
        @ToString
        public static class DataAccessRulesDto {
            /**Token，用于挂载时的身份认证，仅容量Ⅰ型、容量Ⅱ型、标准型返回*/
            @JsonProperty("Token")
            private String Token;

        }

        /**文件系统的所属项目*/
        @JsonProperty("ProjectId")
        private String ProjectId;

        /**文件系统的用量信息*/
        @JsonProperty("VolumeInfo")
        private DataVolumeInfoDto VolumeInfo;

        @Data
        @ToString
        public static class DataVolumeInfoDto {
            /**已用文件数*/
            @JsonProperty("Inodes")
            private Long Inodes;

            /**已用容量。单位：B*/
            @JsonProperty("UseCapacity")
            private Long UseCapacity;

        }

    }

    /**页码。默认为1*/
    @JsonProperty("PageSize")
    private Integer PageSize;

    /**分页大小。默认为20*/
    @JsonProperty("PageNum")
    private Integer PageNum;

    /**返回的文件系统总数*/
    @JsonProperty("TotalCount")
    private Integer TotalCount;

}
