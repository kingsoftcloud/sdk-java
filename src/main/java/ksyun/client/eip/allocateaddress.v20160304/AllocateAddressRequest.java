package ksyun.client.eip.allocateaddress.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname AllocateAddressRequest @Description 请求参数
 */
@Data
public class AllocateAddressRequest {
  /** 线路类型的ID，静态线路暂时停止售卖，请选择bgp线路 */
  @KsYunField(name = "LineId")
  private String LineId;

  /** 弹性IP的带宽 */
  @KsYunField(name = "BandWidth")
  private Integer BandWidth;

  /** 项目的ID */
  @KsYunField(name = "ProjectId")
  private String ProjectId;

  /**
   * 弹性IP的计费类型 有效值: - Monthly：包年包月，有到期时间，只能升带宽 - Peak：按量付费（月峰值），无到期时间，可升降带宽 -
   * Daily：按量付费（按日月结），无到期时间，可升降带宽 - TrafficMonthly：按量付费（流量月结），无到期时间，可升降带宽 -
   * DailyPaidByTransfer：按量付费（流量），无到期时间，可升降带宽 - HourlyInstantSettlement：按量付费，无到期时间，可升降带宽
   */
  @KsYunField(name = "ChargeType")
  private String ChargeType;

  /** 购买时长，计费类型为包年包月时不可缺省。 */
  @KsYunField(name = "PurchaseTime")
  private Integer PurchaseTime;
}
