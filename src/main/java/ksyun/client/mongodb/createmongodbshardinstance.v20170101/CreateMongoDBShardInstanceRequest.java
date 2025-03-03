package ksyun.client.mongodb.createmongodbshardinstance.v20170101;

import common.annotation.KsYunField;
import lombok.Data;

import java.util.List;

/**
 * @Classname CreateMongoDBShardInstanceRequest
 * @Description 请求参数
 */
@Data
public class CreateMongoDBShardInstanceRequest {
    /**
     * 计费方式：默认为byMonth
     * 取值范围：byMonth（包年包月）,byDay（按日计费），hourlyInstantSettlement（按小时实时结算）。
     */
    @KsYunField(name = "PayType")
    private String PayType;

    /**
     * 可用区信息，默认为默认为当前Region A区。可[查询可用机房及可用区](https://docs.ksyun.com/documents/6679)
     */
    @KsYunField(name = "AvailabilityZone")
    private List<String> AvailabilityZoneList;

    /**
     * 实例名称
     * 支持6-64个中文或者英文字符，包括汉字，大小写字母，数字，下划线和中划线
     */
    @KsYunField(name = "Name")
    private String Name;

    /**
     * 数据库版本。如：3.6。
     */
    @KsYunField(name = "DbVersion")
    private String DbVersion;

    /**
     * 硬盘存储空间  根据实例配置选择   单位：GB。只能购买特定规格的套餐,否则将会报错
     */
    @KsYunField(name = "Storage")
    private String Storage;

    /**
     * 时长 默认值：1(单位:月) 。PayType=byMonth(包年包月)则必填，最大支持范围是(1 ~36月)
     */
    @KsYunField(name = "Duration")
    private Integer Duration;

    /**
     * 项目ID
     * 默认为0：默认项目
     */
    @KsYunField(name = "IamProjectId")
    private String IamProjectId;

    /**
     * 虚拟专用网络
     * VPC网络ID，可在网络控制台获取。
     */
    @KsYunField(name = "VpcId")
    private String VpcId;

    /**
     * 终端子网id.
     */
    @KsYunField(name = "VnetId")
    private String VnetId;

    /**
     * 实例管理员密码.
     */
    @KsYunField(name = "InstancePassword")
    private String InstancePassword;

    /**
     * shard配置。
     */
    @KsYunField(name = "ShardClass")
    private String ShardClass;

    /**
     * shard数量
     * 取值范围[2-32]
     */
    @KsYunField(name = "ShardNum")
    private Integer ShardNum;

    /**
     * mongos数量
     * 最小为2，范围[2~32]
     */
    @KsYunField(name = "MongosNum")
    private Integer MongosNum;

    /**
     * mongos配置 。
     */
    @KsYunField(name = "MongosClass")
    private String MongosClass;


}