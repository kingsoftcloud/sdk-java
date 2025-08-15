package ksyun.client.kmr.listtagkeys.v20210902;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ListTagKeysRequest @Description 请求参数
 */
@Data
public class ListTagKeysRequest {
  /** 集群ID */
  @KsYunField(name = "ClusterId")
  private String ClusterId;
}
