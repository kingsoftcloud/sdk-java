package ksyun.client.knad.getblocklocations.v20230323;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname GetBlockLocationsRequest @Description 请求参数
 */
@Data
public class GetBlockLocationsRequest {
  /***/
  @KsYunField(name = "KnadId")
  private String KnadId;
}
