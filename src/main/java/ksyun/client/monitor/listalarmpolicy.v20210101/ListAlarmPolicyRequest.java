package ksyun.client.monitor.listalarmpolicy.v20210101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ListAlarmPolicyRequest @Description 请求参数
 */
@Data
public class ListAlarmPolicyRequest {
  /** 页号，起始值：1 */
  @KsYunField(name = "PageIndex")
  private Integer PageIndex;

  /**
   * 分页时每页显示的数据行数。
   *
   * <p>> 取值范围 1~100
   */
  @KsYunField(name = "PageSize")
  private Integer PageSize;
}
