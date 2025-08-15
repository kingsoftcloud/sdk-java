package ksyun.client.knad.modifyknadname.v20230323;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ModifyKnadNameRequest @Description 请求参数
 */
@Data
public class ModifyKnadNameRequest {
  /** 高防实例id */
  @KsYunField(name = "KnadId")
  private String KnadId;

  /** 实例新名称 */
  @KsYunField(name = "KnadName")
  private String KnadName;
}
