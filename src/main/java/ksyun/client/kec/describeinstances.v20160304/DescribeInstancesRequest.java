package ksyun.client.kec.describeinstances.v20160304;

import common.annotation.KsYunField;
import java.util.List;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname DescribeInstancesRequest @Description 请求参数
 */
@Data
public class DescribeInstancesRequest {
  /** 单次调用所返回的最大实例数目 5~1000 */
  @KsYunField(name = "MaxResults")
  private Integer MaxResults;

  /** 分页标识，单次调用未返回全部实例时，标记下次调用的返回值的起点，默认值是0 */
  @KsYunField(name = "Marker")
  private Integer Marker;

  /**
   * 待返回描述信息的实例ID列表，N的范围为1-100
   * 标准UUID格式，形如`^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$`
   */
  @KsYunField(name = "InstanceId")
  private List<String> InstanceIdList;

  /** 待返回实例信息的项目ID列表，N的范围为1-100，如果不传会查询默认值（0）下的实例 */
  @KsYunField(name = "ProjectId")
  private List<String> ProjectIdList;

  /**
   * 待返回实例信息的项目ID列表，N的范围为1-100 支持如下过滤器名称<br>
   * instance-id 实例ID<br>
   * subnet-id 子网ID<br>
   * vpc-id vpc ID<br>
   * instance-name 实例名称<br>
   * instance-type 实例类型<br>
   * private-ip-address 内网IP<br>
   * image-id 镜像ID<br>
   * charge-type 计费模式（1（包年包月）、5（按量付费（按日月结））、87（按量付费）、810（竞价型实例））2（按小时计费）,
   *
   * <p>84（PostPaidByHour) <br>
   * ProjectId.N 所属项目<br>
   * network-interface.subnet-id 网络接口关联的子网ID<br>
   * network-interface.network-interface-id 网卡的ID<br>
   * network-interface.group-id 网络接口关联的安全组ID<br>
   * instance-state.name 实例状态<br>
   * availability-zone-name [可用区(AvailabilityZone)](https://docs.ksyun.com/documents/67)
   */
  @KsYunField(name = "Filter")
  private List<FilterDto> FilterList;

  @Data
  @ToString
  public static class FilterDto {
    /** Filter.1.Value.1=*** */
    @KsYunField(name = "Value")
    private List<String> ValueList;

    /** Filter.1.Name.1=instance-id */
    @KsYunField(name = "Name")
    private List<String> NameList;
  }

  /**
   * 筛选器 支持如下筛选器名称：<br>
   * InstanceName –主机名称<br>
   * CreationDate –创建时间<br>
   * PrivateIpAddress - 主机内网IP（主网卡）
   */
  @KsYunField(name = "Sort")
  private String Sort;

  /** 搜索条件，模糊匹配 支持字段：实例名（InstanceName）、主网卡私有IP地址（PrivateIpAddress） */
  @KsYunField(name = "Search")
  private String Search;
}
