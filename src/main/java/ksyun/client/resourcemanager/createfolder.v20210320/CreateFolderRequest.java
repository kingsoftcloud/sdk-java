package ksyun.client.resourcemanager.createfolder.v20210320;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname CreateFolderRequest @Description 请求参数
 */
@Data
public class CreateFolderRequest {
  /** 父级资源夹ID */
  @KsYunField(name = "ParentId")
  private String ParentId;

  /** 资源夹名称 */
  @KsYunField(name = "Name")
  private String Name;

  /** 备注 */
  @KsYunField(name = "Desc")
  private String Desc;
}
