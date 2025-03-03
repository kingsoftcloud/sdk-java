package ksyun.client.mongodb.describemongodbinstances.v20170101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribeMongoDBInstancesRequest
 * @Description 请求参数
 */
@Data
public class DescribeMongoDBInstancesRequest {
    /**
     * 按可用区筛选。
     */
    @KsYunField(name = "Area")
    private String Area;

    /**
     * 实例IP地址。
     */
    @KsYunField(name = "Vip")
    private String Vip;

    /**
     * 虚拟专用网络ID。                        只适用于VPC网络下的服务。
     */
    @KsYunField(name = "VpcId")
    private String VpcId;

    /**
     * 终端子网ID。
     */
    @KsYunField(name = "VnetId")
    private String VnetId;

    /**
     * 项目制ID。如需指定查询多个项目制下实例，用‘,’隔开。默认查询全部项目制。
     */
    @KsYunField(name = "IamProjectId")
    private String IamProjectId;

    /**
     * 实例Id。
     */
    @KsYunField(name = "InstanceId")
    private String InstanceId;

    /**
     * 实例名称。
     */
    @KsYunField(name = "Name")
    private String Name;

    /**
     * 实例类型: repset(副本集) ，cluster(分片集群)。
     */
    @KsYunField(name = "Mode")
    private String Mode;

    /**
     * 按实例版本筛选。实例版本 3.2，3.6/4.0。
     */
    @KsYunField(name = "DbVersion")
    private String DbVersion;

    /**
     * 实例当前状态，如取值running   可查询running状态中的实例。
     * <p>
     * 可选（ 共11种）：running，deleting，restarting，locking，unlocking，locked，backuping，restoring，restoring_backup，switching_role，migrating。
     */
    @KsYunField(name = "Status")
    private String Status;

    /**
     * 支持模糊查询实例名称，实例id。
     */
    @KsYunField(name = "FuzzySearch")
    private String FuzzySearch;

    /**
     * 实例所属的TagKey。TagKey和TagValue必须同时传入，否则不生效。
     */
    @KsYunField(name = "TagKey")
    private String TagKey;

    /**
     * 实例所属的TagValue。TagKey和TagValue必须同时传入，否则不生效。
     */
    @KsYunField(name = "TagValue")
    private String TagValue;

    /**
     * 查询数据的起始位置。默认为0。
     */
    @KsYunField(name = "Offset")
    private Integer Offset;

    /**
     * 需要从起始位置开始查询的缓存服务的个数。取值范围为[1~100]，默认为10。
     */
    @KsYunField(name = "Limit")
    private Integer Limit;

    /**
     * 排序字段。可传值为{name,asc；name,desc；created,asc；created,desc}，默认按照创建时间降序，只有排序字段时，默认按照升序排列。
     */
    @KsYunField(name = "OrderBy")
    private String OrderBy;

}