package ksyun.client.epc.describeepcmanagements.v20151101;

import common.annotation.KsYunField;
import java.util.List;
import lombok.Data;

/**
 * @Classname DescribeEpcManagementsRequest @Description 请求参数
 */
@Data
public class DescribeEpcManagementsRequest {
  /** 单次调用可返回的最大条目数量 */
  @KsYunField(name = "MaxResults")
  private Integer MaxResults;

  /** 获取另一页返回结果的 token. */
  @KsYunField(name = "NextToken")
  private String NextToken;

  /** 手机动态码 */
  @KsYunField(name = "DynamicCode")
  private String DynamicCode;

  /** 个人识别码 */
  @KsYunField(name = "Pin")
  private String Pin;

  /** 远程管理的ID */
  @KsYunField(name = "EpcManagementId")
  private List<String> EpcManagementIdList;

  /** 带外管理的ID */
  @KsYunField(name = "RemoteManagementId")
  private String RemoteManagementId;
}
