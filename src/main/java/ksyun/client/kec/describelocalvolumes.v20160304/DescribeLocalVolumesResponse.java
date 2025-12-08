package ksyun.client.kec.describelocalvolumes.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeLocalVolumesResponse
* @Description DescribeLocalVolumes 返回体
*/
@Data
@ToString
public class DescribeLocalVolumesResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Marker")
    private Integer Marker;

    /***/
    @JsonProperty("LocalVolumeCount")
    private Integer LocalVolumeCount;

    /***/
    @JsonProperty("LocalVolumeSet")
    private List<LocalVolumeSetDto> LocalVolumeSet;

    @Data
    @ToString
    public static class LocalVolumeSetDto {
        /***/
        @JsonProperty("LocalVolumeId")
        private String LocalVolumeId;

        /***/
        @JsonProperty("LocalVolumeName")
        private String LocalVolumeName;

        /***/
        @JsonProperty("LocalVolumeState")
        private String LocalVolumeState;

        /***/
        @JsonProperty("InstanceId")
        private String InstanceId;

        /***/
        @JsonProperty("InstanceName")
        private String InstanceName;

        /***/
        @JsonProperty("InstanceState")
        private String InstanceState;

        /***/
        @JsonProperty("LocalVolumeType")
        private String LocalVolumeType;

        /***/
        @JsonProperty("LocalVolumeCategory")
        private String LocalVolumeCategory;

        /***/
        @JsonProperty("LocalVolumeSize")
        private Integer LocalVolumeSize;

        /***/
        @JsonProperty("CreationDate")
        private String CreationDate;

        /***/
        @JsonProperty("AutoSnapshotPolicyId")
        private String AutoSnapshotPolicyId;

    }

}
