package ksyun.client.knad.modifyblocklocation.v20230323;

import common.annotation.KsYunField;
import java.util.List;
import lombok.Data;

/**
 * @Classname ModifyBlockLocationRequest @Description 请求参数
 */
@Data
public class ModifyBlockLocationRequest {
  /***/
  @KsYunField(name = "KnadId")
  private String KnadId;

  /** 是否开启封禁(1:封禁; 0:不封禁) */
  @KsYunField(name = "LocationBlock")
  private Integer LocationBlock;

  /** 要封禁的位置（例：['BeiJing','Other']） */
  @KsYunField(name = "Location", type = 2)
  private List<String> LocationList;
}
