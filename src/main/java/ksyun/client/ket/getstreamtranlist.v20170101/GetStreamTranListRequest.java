package ksyun.client.ket.getstreamtranlist.v20170101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname GetStreamTranListRequest @Description 请求参数
 */
@Data
public class GetStreamTranListRequest {
  /** 客户的域名标识 */
  @KsYunField(name = "UniqName")
  private String UniqName;

  /** 客户的频道名 */
  @KsYunField(name = "App")
  private String App;

  /** 流名称 */
  @KsYunField(name = "StreamID")
  private String StreamID;
}
