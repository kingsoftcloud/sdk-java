package ksyun.client.trade.queryunpayorders.v20250321;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname QueryUnPayOrdersRequest @Description 请求参数
 */
@Data
public class QueryUnPayOrdersRequest {
  /** 页码，从1开始 */
  @KsYunField(name = "page")
  private Integer Page;

  /** 每页大小 */
  @KsYunField(name = "size")
  private Integer Size;
}
