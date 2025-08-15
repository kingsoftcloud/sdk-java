package ksyun.client.aicp.listnodemetrics.v20250501;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ListNodeMetricsRequest @Description 请求参数
 */
@Data
public class ListNodeMetricsRequest {
  /** ip 列表， 多个ip用 英文 逗号分割 */
  @KsYunField(name = "ip")
  private String Ip;

  /** 是否显示每张卡的具体信息，默认 true */
  @KsYunField(name = "show_detail")
  private Boolean Show_detail;

  /** 默认IP排序。目前可选: 节点里面的所有字段（GPU卡详情子里面的字段除外） */
  @KsYunField(name = "sort_by")
  private String Sort_by;

  /** 排序方式，default升序， desc 降序, asc 升序 */
  @KsYunField(name = "order")
  private String Order;
}
