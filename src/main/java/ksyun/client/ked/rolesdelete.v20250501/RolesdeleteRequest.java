package ksyun.client.ked.rolesdelete.v20250501;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname RolesdeleteRequest @Description 请求参数
 */
@Data
public class RolesdeleteRequest {
  /** 角色主键 id */
  @KsYunField(name = "id")
  private Integer Id;
}
