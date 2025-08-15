package ksyun.client.epc.getdynamiccode.v20151101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname GetDynamicCodeRequest @Description 请求参数
 */
@Data
public class GetDynamicCodeRequest {
  /** 带外管理的ID */
  @KsYunField(name = "RemoteManagementId")
  private String RemoteManagementId;
}
