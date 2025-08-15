package ksyun.client.vpc.describedirectconnects.v20160304;

import common.annotation.KsYunField;
import java.util.List;
import lombok.Data;

/**
 * @Classname DescribeDirectConnectsRequest @Description 请求参数
 */
@Data
public class DescribeDirectConnectsRequest {
  /** 物理端口ID */
  @KsYunField(name = "DirectConnectId")
  private List<String> DirectConnectIdList;

  /** 单次调用可返回的最大条目数量 */
  @KsYunField(name = "MaxResults")
  private Integer MaxResults;

  /** 获取另一页返回结果的 token. */
  @KsYunField(name = "NextToken")
  private String NextToken;
}
