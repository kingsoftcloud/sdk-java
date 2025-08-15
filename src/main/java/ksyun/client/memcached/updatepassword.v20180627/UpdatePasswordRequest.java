package ksyun.client.memcached.updatepassword.v20180627;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname UpdatePasswordRequest @Description 请求参数
 */
@Data
public class UpdatePasswordRequest {
  /** 缓存服务ID */
  @KsYunField(name = "CacheId")
  private String CacheId;

  /**
   * 缓存服务密码
   * 密码规则：(?=.*[A-Z]+.*)(?=.*[a-z]+.*)(?=.*[\\d]+.*)([A-Za-z\\d!@#$%^&*()_+=-]{8,30})，不传则设置为没有密码
   */
  @KsYunField(name = "Password")
  private String Password;

  /** 缓存服务引擎 取固定值：memcached */
  @KsYunField(name = "Engine")
  private String Engine;
}
