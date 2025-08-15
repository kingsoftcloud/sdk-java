package ksyun.client.bill_union.describesplititembilldetails.v20200101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribeSplitItemBillDetailsRequest @Description 请求参数
 */
@Data
public class DescribeSplitItemBillDetailsRequest {
  /** 账期，格式：yyyyMM。如：202111 */
  @KsYunField(name = "CustomerBillMonth")
  private Integer CustomerBillMonth;

  /** 产品线 code */
  @KsYunField(name = "ProductGroupCode")
  private String ProductGroupCode;

  /** 统计周期 */
  @KsYunField(name = "StatisticType")
  private Integer StatisticType;

  /** 计费类别 */
  @KsYunField(name = "PayType")
  private Integer PayType;

  /** 主账号所托管的账号Id */
  @KsYunField(name = "SubAccountId")
  private Integer SubAccountId;

  /** 第几页 */
  @KsYunField(name = "Page")
  private Integer Page;

  /** 每页条数 */
  @KsYunField(name = "Size")
  private String Size;
}
