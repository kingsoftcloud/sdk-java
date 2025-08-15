package ksyun.client.waf.createalbwaf.v20200707;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname CreateAlbWafRequest @Description 请求参数
 */
@Data
public class CreateAlbWafRequest {
  /** 套餐类型.可取值：WAF_basic（高级版）、WAF_pro（企业版） */
  @KsYunField(name = "WafType")
  private String WafType;

  /** 计费类型。可取值：1（包年包月）、5（按日月结） */
  @KsYunField(name = "BillType")
  private Integer BillType;

  /** 项目制id */
  @KsYunField(name = "ProjectId")
  private Integer ProjectId;

  /** alb数 */
  @KsYunField(name = "AlbNumber")
  private Integer AlbNumber;

  /** Qps包 */
  @KsYunField(name = "QpsBag")
  private Integer QpsBag;

  /** 域名包 */
  @KsYunField(name = "DomainBag")
  private Integer DomainBag;

  /** 购买时长。可取值：1-36说明：如果计费方式为包年包月，则必须传递此参数。月 */
  @KsYunField(name = "PurchaseTime")
  private Integer PurchaseTime;
}
