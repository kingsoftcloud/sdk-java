package ksyun.client.aicp.spacestoragebindspace.v20250501;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname SpaceStorageBindSpaceRequest @Description 请求参数
 */
@Data
public class SpaceStorageBindSpaceRequest {
  /** 空间存储ID */
  @KsYunField(name = "storage_id")
  private Integer Storage_id;

  /** 空间ID */
  @KsYunField(name = "space_id")
  private Integer Space_id;
}
