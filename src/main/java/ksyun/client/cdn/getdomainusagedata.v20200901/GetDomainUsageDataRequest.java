package ksyun.client.cdn.getdomainusagedata.v20200901;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname GetDomainUsageDataRequest @Description 请求参数
 */
@Data
public class GetDomainUsageDataRequest {
  /** 获取数据起始时间点，日期格式按ISO8601表示法，北京时间，格式为：YYYY-MM-DDThh:mm+0800，例如： 2016-08-01T21:14+0800 */
  @KsYunField(name = "StartTime")
  private String StartTime;

  /** 结束时间需大于起始时间；获取日期格式按照ISO8601表示法，北京时间，格式为：YYYY-MM-DDThh:mm+0800，例如： 2016-08-01T21:14+0800 */
  @KsYunField(name = "EndTime")
  private String EndTime;

  /**
   * 需要获取的用量类型，一次只允许查询一种类型bandwidth：带宽数据traffic：流量数据static-https：静态https请求数dynamic-http：动态http请求数dynamic-https：动态https请求数static-quic：静态quic请求数dynamic-quic：动态quic请求数
   * <br>
   * <br>
   * PS：Metric取值为bandwidth或者traffic的时候areas生效，请求数不区分区域
   */
  @KsYunField(name = "Metric")
  private String Metric;

  /** 当前产品类型，允许输入多种类型，多种类型用，分隔。取值为file：大文件下载，video：音视频点播，page：图片小文件 */
  @KsYunField(name = "CdnType")
  private String CdnType;

  /** 当前账户下选择时间段内正在运行状态的加速域名，可输入需要查询的域名，支持批量域名查询，多个域名用逗号（半角）分隔，缺省为全部域名，若产品类型和域名同时存在，进行强校验处理 */
  @KsYunField(name = "Domains")
  private String Domains;

  /**
   * 计费区域名称，只允许输入单区域查询。取值：中国大陆 - CN，亚太一区 - AP1，亚太二区 - AP2，亚太三区 - AP3，北美洲 - NA，欧洲 - EU，非洲 - AF，南美洲 -
   * SA。<br>
   * <br>
   * PS：只有Metric取值为bandwidth或者traffic的时候生效，单次允许查询一个或多个区域，多个区域间逗号（半角）分隔，缺省为
   * CN；请求数不区分区域，当输入条件为请求数任意一种时，此处缺省为全部区域
   */
  @KsYunField(name = "Areas")
  private String Areas;

  /**
   * 统计粒度，取值为 5：5分钟粒度；60：1小时粒度；1440：1天粒度；缺省为5分钟粒度5分钟及以上粒度的带宽峰值均取该粒度时间段内的5分钟粒度的最高峰值点单次查询最多可获取最近 一年 内
   * 31天 跨度的数据
   */
  @KsYunField(name = "Interval")
  private String Interval;

  /***/
  @KsYunField(name = "RequestId")
  private String RequestId;

  /***/
  @KsYunField(name = "PeakTime")
  private String PeakTime;

  /***/
  @KsYunField(name = "Time")
  private String Time;

  /***/
  @KsYunField(name = "Value")
  private String Value;
}
