package ksyun.client.tagv2.createtag.v20200901;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname CreateTagRequest @Description 请求参数
 */
@Data
public class CreateTagRequest {
  /** Key 最多128字符，仅支持中英文字符 数字 + - = . _ : / @ () {} （） 【】，不能以ksc开头 */
  @KsYunField(name = "Key")
  private String Key;

  /** Value最多255字符，仅支持中英文字符 数字 + - = . _ : / @ () {} （） 【】，不能以ksc开头,多个以","隔开 */
  @KsYunField(name = "Value")
  private String Value;
}
