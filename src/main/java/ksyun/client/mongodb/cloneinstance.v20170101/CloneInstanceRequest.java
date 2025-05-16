package ksyun.client.mongodb.cloneinstance.v20170101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname CloneInstanceRequest
 * @Description 请求参数
 */
@Data
public class CloneInstanceRequest {
    /**
     * 计费方式。  默认为 原实例计费方式。取值范围：byMonth（包年包月）,byDay（按日计费），hourlyInstantSettlement（按小时实时结算）。
     */
    @KsYunField(name = "PayType")
    private String PayType;

    /**
     * 可用区信息。默认为当前Region A区。
     */
    @KsYunField(name = "AvailabilityZone")
    private String AvailabilityZone;

    /**
     * 实例名称。6-64个中文或者英文字符，包括汉字，大小写字母，数字，下划线及中划线
     */
    @KsYunField(name = "Name")
    private String Name;

    /**
     * 时长. 包年包月计费方式必填 单位月 例如: duration:6
     */
    @KsYunField(name = "Duration")
    private Integer Duration;

    /**
     * 所属项目id。默认为：0（默认项目）
     */
    @KsYunField(name = "IamProjectId")
    private String IamProjectId;

    /**
     * VPC网络ID，可在网络控制台获取。
     */
    @KsYunField(name = "VpcId")
    private String VpcId;

    /**
     * 终端子网ID,  可在网络控制台获取。
     */
    @KsYunField(name = "VnetId")
    private String VnetId;

    /**
     * 实例管理员密码  8~30个字符 必须包含大小写字母和数字 支持的特殊字符为!@#$%^&*()-_+=
     */
    @KsYunField(name = "InstancePassword")
    private String InstancePassword;

    /**
     * 备份ID。
     */
    @KsYunField(name = "SnapshotId")
    private String SnapshotId;

    /**
     * 副本集实例ID。
     */
    @KsYunField(name = "InstanceId")
    private String InstanceId;

}