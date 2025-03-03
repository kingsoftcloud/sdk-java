package ksyun.client.ebs.createvolume.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname CreateVolumeRequest
 * @Description 请求参数
 */
@Data
public class CreateVolumeRequest {
    /**
     * 硬盘名称
     * 长度2-50个字符，包括字母、数字、-、_
     * 不传自动生成
     */
    @KsYunField(name = "VolumeName")
    private String VolumeName;

    /**
     * 硬盘类型，SSD3.0/EHDD/ESSD_PL0/ESSD_PL1/ESSD_PL2/ESSD_PL3
     */
    @KsYunField(name = "VolumeType")
    private String VolumeType;

    /**
     * 硬盘描述信息
     * 长度1-128字符
     * 磁盘描述会展示在控制台
     * 不能以 http:// 和 https:// 开头
     */
    @KsYunField(name = "VolumeDesc")
    private String VolumeDesc;

    /**
     * 磁盘容量大小，单位GB
     * SSD3.0取值范围：【10，32000】，步长：1GB
     * EHDD取值范围：【10，32000】，步长：1GB
     * ESSD_PL0取值范围：【40，32768】，步长：1GB
     * ESSD_PL1取值范围：【40，32768】，步长：1GB
     * ESSD_PL2取值范围：【461，32768】，步长：1GB
     * ESSD_PL3取值范围：【1761，32768】，步长：1GB
     */
    @KsYunField(name = "Size")
    private Integer Size;

    /**
     * 购买云硬盘所处的可用区
     * 如 cn-beijing-6a，cn-shanghai-2a
     */
    @KsYunField(name = "AvailabilityZone")
    private String AvailabilityZone;

    /**
     * 计费类型
     * - Monthly（预付费，包年包月）
     * - HourlyInstantSettlement（后付费，按小时实时结算）
     * - Daily（后付费，按日月结）
     */
    @KsYunField(name = "ChargeType")
    private String ChargeType;

    /**
     * 预付费计费类型必填字段；有效值为1-36，单位月
     */
    @KsYunField(name = "PurchaseTime")
    private Integer PurchaseTime;

    /**
     * 硬盘项目组id，不传该参数将使用默认项目组id
     */
    @KsYunField(name = "ProjectId")
    private String ProjectId;

    /**
     * 子订单ID（内部使用）
     */
    @KsYunField(name = "SubOrderId")
    private String SubOrderId;


}