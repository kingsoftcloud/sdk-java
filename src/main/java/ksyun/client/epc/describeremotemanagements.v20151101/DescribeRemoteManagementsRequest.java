package ksyun.client.epc.describeremotemanagements.v20151101;

import common.annotation.KsYunField;
import java.util.List;
import lombok.Data;

/**
 * @Classname DescribeRemoteManagementsRequest @Description 请求参数
 */
@Data
public class DescribeRemoteManagementsRequest {
  /** 远程管理的ID */
  @KsYunField(name = "RemoteManagementId")
  private List<String> RemoteManagementIdList;
}
