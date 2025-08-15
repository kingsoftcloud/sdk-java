package ksyun.client.aicp.listspacestoragebindedspaces.v20250501;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ListSpaceStorageBindedSpacesRequest @Description 请求参数
 */
@Data
public class ListSpaceStorageBindedSpacesRequest {
  /** 空间存储ID */
  @KsYunField(name = "storage_id")
  private Integer Storage_id;
}
