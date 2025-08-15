package ksyun.client.kce.modifypassword.v20180314;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ModifyPasswordRequest @Description 请求参数
 */
@Data
public class ModifyPasswordRequest {
  /** 镜像仓库密码，限制：8-32个字符，必须包含字母、数字和特殊字符中至少两项，支持英文特殊字符!$%()*+,-./:;<=>?@[]^_`{ */
  @KsYunField(name = "Password")
  private String Password;
}
