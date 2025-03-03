package ksyun.client.rabbitmq.createinstance.v20191017;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname CreateInstanceRequest
 * @Description 请求参数
 */
@Data
public class CreateInstanceRequest {
    /**
     * 所属项目Id。
     */
    @KsYunField(name = "ProjectId")
    private String ProjectId;

    /**
     * RabbitMQ实例名称,
     * 校验规则：6-64个中文或者英文字符，包括汉字，大小写字母，数字，下划线及中划线
     */
    @KsYunField(name = "InstanceName")
    private String InstanceName;

    /**
     * 实例密码。
     */
    @KsYunField(name = "InstancePassword")
    private String InstancePassword;

    /**
     * VPC网络ID。
     */
    @KsYunField(name = "VpcId")
    private String VpcId;

    /**
     * 终端子网ID。
     */
    @KsYunField(name = "SubnetId")
    private String SubnetId;

    /**
     * 实例版本。
     */
    @KsYunField(name = "EngineVersion")
    private String EngineVersion;

    /**
     * 计费类型
     */
    @KsYunField(name = "BillType")
    private Integer BillType;

    /**
     * 计费区间(供包年包月计费方式使用)
     */
    @KsYunField(name = "Duration")
    private Integer Duration;

    /**
     * 实例模式。
     */
    @KsYunField(name = "Mode")
    private String Mode;

    /**
     * 实例套餐。
     */
    @KsYunField(name = "InstanceType")
    private String InstanceType;

    /**
     * 实例硬盘。
     */
    @KsYunField(name = "SsdDisk")
    private Integer SsdDisk;

    /**
     * 实例节点数量。默认为3。
     */
    @KsYunField(name = "NodeNum")
    private Integer NodeNum;

}