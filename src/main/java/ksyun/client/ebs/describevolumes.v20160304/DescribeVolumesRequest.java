package ksyun.client.ebs.describevolumes.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname DescribeVolumesRequest
 * @Description 请求参数
 */
@Data
public class DescribeVolumesRequest {
    /**
     * 云硬盘ID，传参方式请参照示例；长度36个字符，包括字母、数字、-不传此参数，则查询该用户下所有硬盘信息。最多传入100个，N为1~100
     */
    @KsYunField(name = "VolumeId")
    private List<String> VolumeIdList;

    /**
     * 云硬盘分类，两种，有效值是系统盘（system）或者数据盘（data）
     */
    @KsYunField(name = "VolumeCategory")
    private String VolumeCategory;

    /**
     * 云硬盘状态，八种creating、available、attaching、inuse、detaching、extending、deleting、error
     */
    @KsYunField(name = "VolumeStatus")
    private String VolumeStatus;

    /**
     * 云硬盘类型，SSD3.0/EHDD/ESSD_PL0/ESSD_PL1/ESSD_PL2/ESSD_PL3
     */
    @KsYunField(name = "VolumeType")
    private String VolumeType;

    /**
     * 云硬盘创建日期，格式：yyyy-MM-dd，可查出当日创建硬盘信息
     */
    @KsYunField(name = "VolumeCreateDate")
    private String VolumeCreateDate;

    /**
     * 分页标识，单次调用未返回全部实例时，标记下次调用的返回值的起点，默认值是0
     */
    @KsYunField(name = "Marker")
    private Integer Marker;

    /**
     * 单次调用所返回的最大实例数目，取值为10~1000，超过1000记为1000
     * 最大值：1000
     * 默认值：10
     */
    @KsYunField(name = "MaxResults")
    private Integer MaxResults;

    /**
     * 云盘的标签键。N的取值范围：1~20。查询到该标签下的资源数量不能超过1000个；使用多个标签过滤资源，查询到同时绑定了多个标签的资源数量不能超过1000个
     */
    @KsYunField(name = "Tag.N.Key")
    private String TagNKey;

    /**
     * 云盘的标签值。N的取值范围：1~20。查询到该标签下的资源数量不能超过1000个；使用多个标签过滤资源，查询到同时绑定了多个标签的资源数量不能超过1000个【需注意：不支持仅输入标签值进行查询，当不输入标签键时，标签值填写框置灰】
     */
    @KsYunField(name = "Tag.N.Value")
    private String TagNValue;

    /**
     * 云硬盘创建日期，格式：yyyy-MM-dd，可查出该日期之前（含当日）创建的硬盘信息
     */
    @KsYunField(name = "VolumeCreateEndDate")
    private String VolumeCreateEndDate;

    /**
     * 云硬盘创建日期，格式：yyyy-MM-dd，可查出该日期（含当日）之后创建硬盘信息
     */
    @KsYunField(name = "VolumeCreateStartDate")
    private String VolumeCreateStartDate;

    /**
     * 创建云盘时使用的快照ID
     */
    @KsYunField(name = "SourceSnapshotId")
    private String SourceSnapshotId;

}