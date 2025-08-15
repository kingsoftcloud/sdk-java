package ksyun.client.slb.deletealbrulegroup.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DeleteAlbRuleGroupRequest @Description 请求参数
 */
@Data
public class DeleteAlbRuleGroupRequest {
  /** 转发策略的ID */
  @KsYunField(name = "AlbRuleGroupId")
  private String AlbRuleGroupId;
}
