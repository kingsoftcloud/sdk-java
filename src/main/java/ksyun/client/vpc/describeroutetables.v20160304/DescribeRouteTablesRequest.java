package ksyun.client.vpc.describeroutetables.v20160304;

import common.annotation.KsYunField;
import java.util.List;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname DescribeRouteTablesRequest @Description 请求参数
 */
@Data
public class DescribeRouteTablesRequest {
  /** 多个路由表的ID */
  @KsYunField(name = "RouteTableId")
  private List<String> RouteTableIdList;

  /** 筛选Filter */
  @KsYunField(name = "Filter")
  private List<FilterDto> FilterList;

  @Data
  @ToString
  public static class FilterDto {
    /** 有效值： - vpc-id，Vpc的ID */
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
