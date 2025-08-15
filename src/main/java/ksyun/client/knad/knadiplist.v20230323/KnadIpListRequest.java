package ksyun.client.knad.knadiplist.v20230323;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname KnadIpListRequest @Description 请求参数
 */
@Data
public class KnadIpListRequest {
  /** 高防实例id */
  @KsYunField(name = "KnadId")
  private String KnadId;
}
