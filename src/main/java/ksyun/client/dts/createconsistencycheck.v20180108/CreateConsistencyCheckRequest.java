package ksyun.client.dts.createconsistencycheck.v20180108;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname CreateConsistencyCheckRequest @Description 请求参数
 */
@Data
public class CreateConsistencyCheckRequest {
  /** 主任务ID。 */
  @KsYunField(name = "TaskId")
  private String TaskId;
}
