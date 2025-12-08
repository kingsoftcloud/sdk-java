package ksyun.client.kec.describefilesystems.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeFileSystemsResponse
* @Description DescribeFileSystems 返回体
*/
@Data
@ToString
public class DescribeFileSystemsResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Marker")
    private Integer Marker;

    /***/
    @JsonProperty("FileSystemCount")
    private Integer FileSystemCount;

    /***/
    @JsonProperty("FileSystems")
    private List<FileSystemsDto> FileSystems;

    @Data
    @ToString
    public static class FileSystemsDto {
        /***/
        @JsonProperty("FileSystemId")
        private String FileSystemId;

        /***/
        @JsonProperty("FileSystemName")
        private String FileSystemName;

        /***/
        @JsonProperty("AvailabilityZone")
        private String AvailabilityZone;

        /***/
        @JsonProperty("AvailabilityZoneName")
        private String AvailabilityZoneName;

        /***/
        @JsonProperty("StorageType")
        private String StorageType;

        /***/
        @JsonProperty("ProtocolType")
        private String ProtocolType;

        /***/
        @JsonProperty("VpcId")
        private String VpcId;

        /***/
        @JsonProperty("FileSystemState")
        private String FileSystemState;

        /***/
        @JsonProperty("CreationDate")
        private String CreationDate;

        /***/
        @JsonProperty("MountTargets")
        private List<MountTargetsDto> MountTargets;

        @Data
        @ToString
        public static class MountTargetsDto {
            /***/
            @JsonProperty("MountTargetId")
            private String MountTargetId;

            /***/
            @JsonProperty("SubnetId")
            private String SubnetId;

            /***/
            @JsonProperty("IpAddress")
            private String IpAddress;

            /***/
            @JsonProperty("MountTargetState")
            private String MountTargetState;

            /***/
            @JsonProperty("CreationDate")
            private String CreationDate;

        }

        /***/
        @JsonProperty("Size")
        private Integer Size;

        /***/
        @JsonProperty("UsedSize")
        private Integer UsedSize;

    }

}
