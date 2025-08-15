package ksyun.client.kcs.deletecacheparametergroup.v20160701;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DeleteCacheParameterGroupRequest @Description 请求参数
 */
@Data
public class DeleteCacheParameterGroupRequest {
  /** 可用区 默认：对应机房的a区 */
  @KsYunField(name = "AvailableZone")
  private String AvailableZone;

  /** 参数组ID。 */
  @KsYunField(name = "CacheParameterGroupId")
  private String CacheParameterGroupId;
}
