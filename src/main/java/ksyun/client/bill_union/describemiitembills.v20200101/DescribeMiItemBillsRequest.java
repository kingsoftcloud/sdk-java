package ksyun.client.bill_union.describemiitembills.v20200101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribeMiItemBillsRequest @Description 请求参数
 */
@Data
public class DescribeMiItemBillsRequest {
  /***/
  @KsYunField(name = "BillMonth")
  private String BillMonth;
}
