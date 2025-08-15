package ksyun.client.epc.describexiddetails.v20151101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribeXidDetailsRequest @Description 请求参数
 */
@Data
public class DescribeXidDetailsRequest {
  /** 事件开始时间 */
  @KsYunField(name = "StartTime")
  private String StartTime;

  /** 事件结束时间 */
  @KsYunField(name = "EndTime")
  private String EndTime;

  /** 实例id */
  @KsYunField(name = "InstanceId")
  private String InstanceId;

  /** 事件名称 XidError SXidError 默认： XidError */
  @KsYunField(name = "Name")
  private String Name;

  /** 每页条数 */
  @KsYunField(name = "MaxResults")
  private Integer MaxResults;

  /** 页码偏移量 */
  @KsYunField(name = "NextToken")
  private String NextToken;
}
