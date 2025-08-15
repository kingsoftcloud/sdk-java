package ksyun.client.kce.describeclusterinstance.v20190806;

import common.annotation.KsYunField;
import java.util.List;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname DescribeClusterInstanceRequest @Description 请求参数
 */
@Data
public class DescribeClusterInstanceRequest {
  /** 集群id */
  @KsYunField(name = "ClusterId")
  private String ClusterId;

  /** 单次调用所返回的最大实例数目，默认10,最大50。 */
  @KsYunField(name = "MaxResults")
  private Integer MaxResults;

  /** 分页标识，单次调用未返回全部实例时，标记下次调用的返回值的起点，默认值是0。 */
  @KsYunField(name = "Marker")
  private Integer Marker;

  /***/
  @KsYunField(name = "Filter")
  private List<FilterDto> FilterList;

  @Data
  @ToString
  public static class FilterDto {
    /**
     * 支持的过滤器参数
     *
     * <p>- instance-name 实例名称 - instance-role 实例角色 - instance-id 实例id - instance-ip 实例ip -
     * instance-status 实例状态 - node-pool-id 节点所属节点池id
     */
    @KsYunField(name = "Name")
    private String Name;

    /***/
    @KsYunField(name = "Value")
    private List<String> ValueList;
  }

  /**
   * 模糊匹配，可以匹配如下字段：<br>
   * 主网卡私有IP（PrivateIpAddress）。
   */
  @KsYunField(name = "Search")
  private String Search;
}
