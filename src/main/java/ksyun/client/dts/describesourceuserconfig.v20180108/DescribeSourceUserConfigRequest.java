package ksyun.client.dts.describesourceuserconfig.v20180108;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribeSourceUserConfigRequest @Description 请求参数
 */
@Data
public class DescribeSourceUserConfigRequest {
  /** 主任务ID */
  @KsYunField(name = "TaskId")
  private String TaskId;
}
