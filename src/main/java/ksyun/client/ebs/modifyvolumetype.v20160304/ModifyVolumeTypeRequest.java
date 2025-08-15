package ksyun.client.ebs.modifyvolumetype.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ModifyVolumeTypeRequest @Description 请求参数
 */
@Data
public class ModifyVolumeTypeRequest {
  /***/
  @KsYunField(name = "VolumeId")
  private String VolumeId;

  /***/
  @KsYunField(name = "PerformanceVolumeSize")
  private String PerformanceVolumeSize;

  /** essd4.0云盘类型 */
  @KsYunField(name = "PerformanceLevelVolumeCategory")
  private String PerformanceLevelVolumeCategory;
}
