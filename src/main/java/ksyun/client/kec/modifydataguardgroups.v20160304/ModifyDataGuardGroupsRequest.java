package ksyun.client.kec.modifydataguardgroups.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ModifyDataGuardGroupsRequest @Description 请求参数
 */
@Data
public class ModifyDataGuardGroupsRequest {
  /** 待修改的容灾分组ID */
  @KsYunField(name = "DataGuardId")
  private String DataGuardId;

  /** 容灾分组名称 */
  @KsYunField(name = "DataGuardName")
  private String DataGuardName;
}
