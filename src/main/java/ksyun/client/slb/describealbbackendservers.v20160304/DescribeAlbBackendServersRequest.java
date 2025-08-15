package ksyun.client.slb.describealbbackendservers.v20160304;

import common.annotation.KsYunField;
import java.util.List;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname DescribeAlbBackendServersRequest @Description 请求参数
 */
@Data
public class DescribeAlbBackendServersRequest {
  /** 筛选Filter */
  @KsYunField(name = "Filter")
  private List<FilterDto> FilterList;

  @Data
  @ToString
  public static class FilterDto {
    /**
     * 有效值： - backend-server-group-id，服务器组ID - backend-server-ip，服务器ip - instance-id，实例id -
     * network-interface-id，网卡id
     */
    @KsYunField(name = "Name")
    private String Name;

    /***/
    @KsYunField(name = "Value")
    private List<String> ValueList;
  }

  /** 单次调用可返回的最大条目数量 */
  @KsYunField(name = "MaxResults")
  private Integer MaxResults;

  /** 获取另一页返回结果的 token. */
  @KsYunField(name = "NextToken")
  private String NextToken;
}
