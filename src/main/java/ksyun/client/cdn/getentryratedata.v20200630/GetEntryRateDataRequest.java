package ksyun.client.cdn.getentryratedata.v20200630;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname GetEntryRateDataRequest @Description 请求参数
 */
@Data
public class GetEntryRateDataRequest {
  /** 需要获取ECN进入率的域名，支持多域名，使用英文逗号(半角)分隔。最多30个 */
  @KsYunField(name = "Domains")
  private String Domains;

  /**
   * 获取数据起始时间点，日期格式按ISO8601表示法，北京时间，格式为：YYYY-MM-DDThh:mm+0800，例如： 2016-08-01T21:14+0800
   * 只能按5分钟粒度传，每次传一个时间点。例如：取10:00的数据，起止时间传10:00-10:05
   */
  @KsYunField(name = "StartTime")
  private String StartTime;

  /**
   * 结束时间需大于起始时间。日期格式按ISO8601表示法，北京时间，格式为：YYYY-MM-DDThh:mm+0800，例如： 2016-08-01T21:14+0800
   * 只能按5分钟粒度传，每次传一个时间点。例如：取10:00的数据，起止时间传10:00-10:05
   */
  @KsYunField(name = "EndTime")
  private String EndTime;

  /** 网民ip解析出来的省份。可选值参考省份运营商表。单次请求传多个省份，使用英文逗号(半角)分隔，返回汇总值 */
  @KsYunField(name = "Province")
  private String Province;

  /** 网民ip解析出来的运营商。可选值参考省份运营商表。单次请求传多个运营商，使用英文逗号(半角)分隔，返回汇总值 */
  @KsYunField(name = "Isp")
  private String Isp;
}
