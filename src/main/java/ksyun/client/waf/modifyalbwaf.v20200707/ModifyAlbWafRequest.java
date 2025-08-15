package ksyun.client.waf.modifyalbwaf.v20200707;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ModifyAlbWafRequest @Description 请求参数
 */
@Data
public class ModifyAlbWafRequest {
  /** 套餐类型.可取值：WAF_basic（高级版）、WAF_pro（企业版） */
  @KsYunField(name = "WafType")
  private String WafType;

  /***/
  @KsYunField(name = "DomainBag")
  private Integer DomainBag;

  /***/
  @KsYunField(name = "AlbNumber")
  private Integer AlbNumber;

  /***/
  @KsYunField(name = "QpsBag")
  private Integer QpsBag;
}
