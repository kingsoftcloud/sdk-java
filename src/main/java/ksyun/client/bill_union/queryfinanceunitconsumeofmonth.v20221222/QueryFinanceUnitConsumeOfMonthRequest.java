package ksyun.client.bill_union.queryfinanceunitconsumeofmonth.v20221222;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname QueryFinanceUnitConsumeOfMonthRequest @Description 请求参数
 */
@Data
public class QueryFinanceUnitConsumeOfMonthRequest {
  /** 账期(执行月) yyyyMM */
  @KsYunField(name = "CustomerBillMonth")
  private String CustomerBillMonth;

  /** 第几页,默认值为1 */
  @KsYunField(name = "Page")
  private Integer Page;

  /** 每页条数,默认值20，最大值200 */
  @KsYunField(name = "Size")
  private Integer Size;
}
