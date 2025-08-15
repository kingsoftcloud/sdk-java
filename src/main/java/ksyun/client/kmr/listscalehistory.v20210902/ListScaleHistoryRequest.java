package ksyun.client.kmr.listscalehistory.v20210902;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ListScaleHistoryRequest @Description 请求参数
 */
@Data
public class ListScaleHistoryRequest {
  /** 集群ID */
  @KsYunField(name = "ClusterId")
  private String ClusterId;
}
