package ksyun.client.iam.listvirtualmfadevices.v20151101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ListVirtualMFADevicesRequest @Description 请求参数
 */
@Data
public class ListVirtualMFADevicesRequest {
  /** AssignmentStatus */
  @KsYunField(name = "AssignmentStatus")
  private String AssignmentStatus;

  /** Marker */
  @KsYunField(name = "Marker")
  private String Marker;

  /** MaxItems */
  @KsYunField(name = "MaxItems")
  private Integer MaxItems;
}
