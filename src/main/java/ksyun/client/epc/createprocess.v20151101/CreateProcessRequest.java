package ksyun.client.epc.createprocess.v20151101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname CreateProcessRequest
 * @Description 请求参数
 */
@Data
public class CreateProcessRequest {
    /**
     * 云物理工单ID
     */
    @KsYunField(name = "ProcessId")
    private String ProcessId;

    /**
     * 实例ID
     */
    @KsYunField(name = "InstanceId")
    private String InstanceId;

    /**
     * 云物理主机序列号
     */
    @KsYunField(name = "Sn")
    private String Sn;

    /**
     * 可用区
     */
    @KsYunField(name = "AvailabilityZone")
    private String AvailabilityZone;

    /**
     * 创建时间
     */
    @KsYunField(name = "CreateTime")
    private String CreateTime;

    /**
     * 问题属性
     */
    @KsYunField(name = "Attribute")
    private String Attribute;

    /**
     * 描述
     */
    @KsYunField(name = "Content")
    private String Content;

    /**
     * 服务器数量，通常填写1
     */
    @KsYunField(name = "MachineCount")
    private Integer MachineCount;

    /**
     * 标题
     */
    @KsYunField(name = "Title")
    private String Title;

    /**
     * 操作类型,有效值:fix
     */
    @KsYunField(name = "Type")
    private String Type;

    /**
     * 确认是否操作 有效值：0,1
     */
    @KsYunField(name = "Confirm")
    private String Confirm;

    /**
     * 工单来源，0:客户 1：售后代提
     */
    @KsYunField(name = "ProcessSource")
    private Integer ProcessSource;

    /***/
    @KsYunField(name = "autoNocCase")
    private Integer AutoNocCase;


}