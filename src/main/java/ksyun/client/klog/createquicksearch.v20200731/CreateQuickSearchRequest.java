package ksyun.client.klog.createquicksearch.v20200731;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname CreateQuickSearchRequest @Description 请求参数
 */
@Data
public class CreateQuickSearchRequest {
  /** 工程名称 */
  @KsYunField(name = "ProjectName")
  private String ProjectName;

  /** 日志池名称 */
  @KsYunField(name = "LogPoolName")
  private String LogPoolName;

  /** 快速查询名称 */
  @KsYunField(name = "QuickSearchName")
  private String QuickSearchName;

  /** 查询语句 */
  @KsYunField(name = "Query")
  private String Query;

  /** 快速查询的备注 */
  @KsYunField(name = "Description")
  private String Description;

  /**
   * 查询数据的时间范围 { "from": 1737388800000, "to": 1737444861000, "key": "h", "value": -24, "start": 21,
   * "startKey": "m", "end": 2, "endKey": "s", "tab": "Absolute|Relative", "label": "近15分钟" }
   */
  @KsYunField(name = "TimeRange")
  private String TimeRange;
}
