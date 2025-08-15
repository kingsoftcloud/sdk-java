package ksyun.client.mongodb.deleteparamgroup.v20170101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DeleteParamGroupRequest @Description 请求参数
 */
@Data
public class DeleteParamGroupRequest {
  /** 删除参数组 */
  @KsYunField(name = "ParamGroupId")
  private String ParamGroupId;
}
