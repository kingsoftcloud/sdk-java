package ksyun.client.cen.describecenroutes.v20160304;

import common.annotation.KsYunField;
import java.util.List;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname DescribeCenRoutesRequest @Description 请求参数
 */
@Data
public class DescribeCenRoutesRequest {
  /** 多个云企业网路由的ID */
  @KsYunField(name = "CenRouteId")
  private List<String> CenRouteIdList;

  /** 筛选Filter */
  @KsYunField(name = "Filter")
  private List<FilterDto> FilterList;

  @Data
  @ToString
  public static class FilterDto {
    /**
     * 有效值： - cen-id，云企业网ID - network-instance-id，网络实例ID - instance-type，实例类型 - region，金山云机房Code -
     * destination-cidr-block，目标网段 - instance-route-type，实例路由类型
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
