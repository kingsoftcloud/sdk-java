package ksyun.client.ebs.describecreatevolumeprice.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribeCreateVolumePriceRequest @Description 请求参数
 */
@Data
public class DescribeCreateVolumePriceRequest {
  /** 云盘类型，ESSD_PL0/ESSD_PL1/ESSD_PL2/ESSD_PL3/SSD3.0/EHDD */
  @KsYunField(name = "VolumeType")
  private String VolumeType;

  /** 磁盘容量大小，单位GB，步长：1GB */
  @KsYunField(name = "Size")
  private Integer Size;

  /** 购买云硬盘所处的可用区 */
  @KsYunField(name = "AvailabilityZone")
  private String AvailabilityZone;

  /** 计费类型 Monthly（预付费，包年包月） HourlyInstantSettlement（后付费，按小时实时结算） Daily（后付费，按日月结） */
  @KsYunField(name = "ChargeType")
  private String ChargeType;

  /** 预付费计费类型必填字段；有效值为1-36，单位月 */
  @KsYunField(name = "PurchaseTime")
  private Integer PurchaseTime;
}
