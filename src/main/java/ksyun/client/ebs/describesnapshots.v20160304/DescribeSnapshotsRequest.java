package ksyun.client.ebs.describesnapshots.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname DescribeSnapshotsRequest
 * @Description 请求参数
 */
@Data
public class DescribeSnapshotsRequest {
    /**
     * 云盘ID，传入该参数可获取指定硬盘的所有快照数据，此时其他参数无效
     */
    @KsYunField(name = "VolumeId")
    private String VolumeId;

    /**
     * 硬盘分类，system（系统盘）或data（数据盘），传入该参数可获取指定类型的快照列表
     */
    @KsYunField(name = "VolumeCategory")
    private String VolumeCategory;

    /**
     * 快照ID，传入该参数可获取指定快照的信息，此时其他参数无效
     */
    @KsYunField(name = "SnapshotId")
    private String SnapshotId;

    /**
     * 可用区，传入该参数可获取指定可用区的快照信息
     */
    @KsYunField(name = "AvailabilityZone")
    private String AvailabilityZone;

    /**
     * 快照名称，传入可进行快照名称的查询
     */
    @KsYunField(name = "SnapshotName")
    private String SnapshotName;

    /**
     * 页码，默认1，范围1-intMax
     */
    @KsYunField(name = "PageNumber")
    private Integer PageNumber;

    /**
     * 每页大小，默认10，范围1-intMax
     */
    @KsYunField(name = "PageSize")
    private Integer PageSize;

}