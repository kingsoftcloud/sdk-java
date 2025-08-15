package ksyun.client.aicp.createspacestorage.v20250501;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname CreateSpaceStorageRequest @Description 请求参数
 */
@Data
public class CreateSpaceStorageRequest {
  /** managed(托管存储) 、custom(挂载已有目录) */
  @KsYunField(name = "type")
  private String Type;

  /** 最大存储配额 */
  @KsYunField(name = "max_quota")
  private Integer Max_quota;

  /** 名字 */
  @KsYunField(name = "name")
  private String Name;

  /** 存储配置ID。 请访问训练平台，进入 资源管理-存储管理-存储配置 获取对应存储配置的id。 */
  @KsYunField(name = "storage_config_id")
  private Integer Storage_config_id;

  /** 描述 */
  @KsYunField(name = "description")
  private String Description;

  /** 已有目录路径 */
  @KsYunField(name = "path")
  private String Path;
}
