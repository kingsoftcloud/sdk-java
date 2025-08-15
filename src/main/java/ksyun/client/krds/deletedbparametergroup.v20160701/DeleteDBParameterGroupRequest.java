package ksyun.client.krds.deletedbparametergroup.v20160701;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DeleteDBParameterGroupRequest @Description 请求参数
 */
@Data
public class DeleteDBParameterGroupRequest {
  /** 参数组ID */
  @KsYunField(name = "DBParameterGroupId")
  private String DBParameterGroupId;
}
