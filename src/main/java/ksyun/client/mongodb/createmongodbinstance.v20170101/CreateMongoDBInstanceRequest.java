package ksyun.client.mongodb.createmongodbinstance.v20170101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname CreateMongoDBInstanceRequest
 * @Description 请求参数
 */
@Data
public class CreateMongoDBInstanceRequest {
    /**
     * 计费方式：默认为byMonth。取值范围：byMonth（包年包月）,byDay（按日计费），hourlyInstantSettlement（按小时实时结算）。
     */
    @KsYunField(name = "PayType")
    private String PayType;

    /**
     * 可用区信息
     */
    @KsYunField(name = "AvailabilityZone")
    private List<String> AvailabilityZoneList;

    /**
     * 6-64个中文或者英文字符，包括汉字，大小写字母，数字，下划线及中划线
     */
    @KsYunField(name = "Name")
    private String Name;

    /**
     * MongoDB引擎版本  可选值为：3.2，3.6， 4.0。
     */
    @KsYunField(name = "DbVersion")
    private String DbVersion;

    /**
     * 默认为3，取值范围：3、5、7。为实例所有节点数，每个实例包含一个primary一个hidden节点，其余为secondary节点。
     */
    @KsYunField(name = "NodeNum")
    private Integer NodeNum;

    /**
     * 硬盘存储空间。
     */
    @KsYunField(name = "Storage")
    private Integer Storage;

    /**
     * 时长 默认值：1(单位:月) ；PayType=byMonth(包年包月)则必填，最大支持范围是(1 ~36月)
     */
    @KsYunField(name = "Duration")
    private Integer Duration;

    /**
     * 所属项目id。默认：0（默认项目）
     */
    @KsYunField(name = "IamProjectId")
    private String IamProjectId;

    /**
     * VPC网络ID，可在网络控制台获取。
     */
    @KsYunField(name = "VpcId")
    private String VpcId;

    /**
     * 终端子网id,  可在网络控制台获取。
     */
    @KsYunField(name = "VnetId")
    private String VnetId;

    /**
     * 实例管理员密码  8~30个字符 必须包含大小写字母和数字 支持的特殊字符为!@#$%^&*()-_+=
     */
    @KsYunField(name = "InstancePassword")
    private String InstancePassword;

    /**
     * 副本集实例配置。
     */
    @KsYunField(name = "InstanceClass")
    private String InstanceClass;

}