package ksyun.client.ked.createlabel.v20250501;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname CreateLabelRequest @Description 请求参数
 */
@Data
public class CreateLabelRequest {
  /** 标签名 */
  @KsYunField(name = "name")
  private String Name;
}
