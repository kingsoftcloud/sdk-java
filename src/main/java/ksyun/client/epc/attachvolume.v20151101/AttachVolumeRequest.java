package ksyun.client.epc.attachvolume.v20151101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname AttachVolumeRequest @Description 请求参数
 */
@Data
public class AttachVolumeRequest {
  /** 裸金属服务器资源ID */
  @KsYunField(name = "HostId")
  private String HostId;

  /** EBS的ID */
  @KsYunField(name = "VolumeId")
  private String VolumeId;
}
