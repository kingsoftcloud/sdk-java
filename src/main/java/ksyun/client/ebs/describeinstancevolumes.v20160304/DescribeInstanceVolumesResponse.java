package ksyun.client.ebs.describeinstancevolumes.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeInstanceVolumesResponse
* @Description DescribeInstanceVolumes 返回体
*/
@Data
@ToString
public class DescribeInstanceVolumesResponse extends BaseResponseModel {

    /**唯一请求ID，每次请求都会返回*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**该主机下挂载的硬盘信息，若无挂载硬盘则不返回*/
    @JsonProperty("Attachments")
    private List<AttachmentsDto> Attachments;

    @Data
    @ToString
    public static class AttachmentsDto {
        /**云主机实例ID*/
        @JsonProperty("InstanceId")
        private String InstanceId;

        /**硬盘ID*/
        @JsonProperty("VolumeId")
        private String VolumeId;

        /**硬盘挂载点*/
        @JsonProperty("MountPoint")
        private String MountPoint;

    }

}
