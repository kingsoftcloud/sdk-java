package ksyun.client.kcs.describesecuritygroups.v20160701;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribeSecurityGroupsRequest @Description 请求参数
 */
@Data
public class DescribeSecurityGroupsRequest {
  /** 可用区 默认：对应机房的a区 */
  @KsYunField(name = "AvailableZone")
  private String AvailableZone;

  /** 数据偏移量 默认：0，数据偏移量, */
  @KsYunField(name = "Offset")
  private String Offset;

  /** 每页数据量 */
  @KsYunField(name = "Limit")
  private Integer Limit;

  /** 缓存服务ID */
  @KsYunField(name = "CacheId")
  private String CacheId;

  /**
   * 参考值：true|false
   *
   * <p>如果传入CacheId FilterCache：true 查询包含缓存服务ID的安全规则； FilterCache：false 查询不包含缓存服务ID的安全规则；
   *
   * <p>如果CacheId为空 FilterCache参数无效
   */
  @KsYunField(name = "FilterCache")
  private Boolean FilterCache;

  /** 根据名称或者备注进行筛选 */
  @KsYunField(name = "SearchKey")
  private String SearchKey;
}
