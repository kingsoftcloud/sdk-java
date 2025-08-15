package ksyun.client.memcached.resizecachecluster.v20180627;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ResizeCacheClusterRequest @Description 请求参数
 */
@Data
public class ResizeCacheClusterRequest {
  /** 缓存服务ID */
  @KsYunField(name = "CacheId")
  private String CacheId;

  /** 更配目标大小，以GB为单位 缓存资源为单主从模式时，可选值为：{1, 2, 4, 8, 16, 32, 64}； */
  @KsYunField(name = "Capacity")
  private String Capacity;

  /** 缓存服务引擎 取固定值：memcached */
  @KsYunField(name = "Engine")
  private String Engine;
}
