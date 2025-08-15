package ksyun.client.postgresql.resetdbparametergroup.v20181225;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ResetDBParameterGroupRequest @Description 请求参数
 */
@Data
public class ResetDBParameterGroupRequest {
  /** 参数组ID */
  @KsYunField(name = "DBParameterGroupId")
  private String DBParameterGroupId;
}
