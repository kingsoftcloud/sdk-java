package ksyun.client.kcs.describecachereadonlynode.v20170401;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribeCacheReadonlyNodeRequest @Description 请求参数
 */
@Data
public class DescribeCacheReadonlyNodeRequest {
  /** 主从实例ID。 */
  @KsYunField(name = "CacheId")
  private String CacheId;

  /** 可用区 默认：对应机房的a区 */
  @KsYunField(name = "AvailableZone")
  private String AvailableZone;
}
