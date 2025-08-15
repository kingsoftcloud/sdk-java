package ksyun.client.kce.describecluster.v20231115;

import common.annotation.KsYunField;
import java.util.List;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname DescribeClusterRequest @Description 请求参数
 */
@Data
public class DescribeClusterRequest {
  /***/
  @KsYunField(name = "ClusterId")
  private String ClusterId;

  /***/
  @KsYunField(name = "Marker")
  private Integer Marker;

  /** 值范围0-20 */
  @KsYunField(name = "MaxResults")
  private Integer MaxResults;

  /** 集群名称模糊匹配 */
  @KsYunField(name = "Search")
  private String Search;

  /***/
  @KsYunField(name = "Filter")
  private List<FilterDto> FilterList;

  @Data
  @ToString
  public static class FilterDto {
    /** 当前只支持 cluster-manage-mode */
    @KsYunField(name = "Name")
    private String Name;

    /**
     * - ExternalCluster 纳管集群 - ManagedCluster 托管集群 - DedicatedCluster 独立部署集群 - ServerlessCluster
     * serverless集群
     */
    @KsYunField(name = "Value")
    private List<String> ValueList;
  }
}
