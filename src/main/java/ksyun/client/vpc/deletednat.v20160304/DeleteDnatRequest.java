package ksyun.client.vpc.deletednat.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DeleteDnatRequest @Description 请求参数
 */
@Data
public class DeleteDnatRequest {
  /** Dnat的ID */
  @KsYunField(name = "DnatId")
  private String DnatId;
}
