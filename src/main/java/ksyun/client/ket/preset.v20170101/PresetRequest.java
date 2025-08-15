package ksyun.client.ket.preset.v20170101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname PresetRequest @Description 请求参数
 */
@Data
public class PresetRequest {
  /***/
  @KsYunField(name = "UniqName")
  private String UniqName;

  /***/
  @KsYunField(name = "App")
  private String App;

  /***/
  @KsYunField(name = "Preset")
  private String Preset;

  /***/
  @KsYunField(name = "Description")
  private String Description;

  /***/
  @KsYunField(name = "Output")
  private String Output;

  /***/
  @KsYunField(name = "Video")
  private String Video;
}
