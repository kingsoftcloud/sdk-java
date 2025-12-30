package ksyun.client.kec.describeautosnapshotpolicy.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeAutoSnapshotPolicyResponse
* @Description DescribeAutoSnapshotPolicy 返回体
*/
@Data
@ToString
public class DescribeAutoSnapshotPolicyResponse extends BaseResponseModel {

    /**请求id*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**策略总数*/
    @JsonProperty("AutoSnapshotPolicySize")
    private Integer AutoSnapshotPolicySize;

    /**自动快照策略列表*/
    @JsonProperty("AutoSnapshotPolicySet")
    private List<AutoSnapshotPolicySetDto> AutoSnapshotPolicySet;

    @Data
    @ToString
    public static class AutoSnapshotPolicySetDto {
        /**自动快照策略ID*/
        @JsonProperty("AutoSnapshotPolicyId")
        private String AutoSnapshotPolicyId;

        /**自动快照策略名称*/
        @JsonProperty("AutoSnapshotPolicyName")
        private String AutoSnapshotPolicyName;

        /**创建快照时间*/
        @JsonProperty("AutoSnapshotTime")
        private List<String> AutoSnapshotTime;

        /**自动快照重复时间,*/
        @JsonProperty("AutoSnapshotDate")
        private List<String> AutoSnapshotDate;

        /**已经绑定磁盘的本地盘数量*/
        @JsonProperty("AttachLocalVolumeNum")
        private Integer AttachLocalVolumeNum;

        /**已经绑定ebs磁盘的数量*/
        @JsonProperty("AttachEBSVolumeNum")
        private Integer AttachEBSVolumeNum;

        /**创建时间*/
        @JsonProperty("CreationDate")
        private String CreationDate;

        /**自动快照保留时长*/
        @JsonProperty("RetentionTime")
        private Integer RetentionTime;

        /**快照类型*/
        @JsonProperty("SnapshotType")
        private String SnapshotType;

    }

}
