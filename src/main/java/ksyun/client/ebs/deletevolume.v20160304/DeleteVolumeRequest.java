package ksyun.client.ebs.deletevolume.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DeleteVolumeRequest @Description 请求参数
 */
@Data
public class DeleteVolumeRequest {
  /** 硬盘ID 长度36个字符，包括字母、数字、- */
  @KsYunField(name = "VolumeId")
  private String VolumeId;

  /** true直接彻底删除，false进入回收站，回收中云盘传true会从回收站删除；默认为false */
  @KsYunField(name = "ForceDelete")
  private Boolean ForceDelete;
}
