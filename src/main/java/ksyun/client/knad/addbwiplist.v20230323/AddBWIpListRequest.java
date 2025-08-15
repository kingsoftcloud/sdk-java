package ksyun.client.knad.addbwiplist.v20230323;

import common.annotation.KsYunField;
import java.util.List;
import lombok.Data;

/**
 * @Classname AddBWIpListRequest @Description 请求参数
 */
@Data
public class AddBWIpListRequest {
  /***/
  @KsYunField(name = "KnadId")
  private String KnadId;

  /** 添加的IP段 */
  @KsYunField(name = "Ip", type = 2)
  private List<String> IpList;

  /** 策略类型（1: black, 2: white） */
  @KsYunField(name = "type")
  private Integer Type;
}
