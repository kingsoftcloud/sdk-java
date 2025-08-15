package ksyun.client.kec.createdataguardgroup.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname CreateDataGuardGroupRequest @Description 请求参数
 */
@Data
public class CreateDataGuardGroupRequest {
  /** 容灾分组名称 */
  @KsYunField(name = "DataGuardName")
  private String DataGuardName;
}
