package ksyun.client.iam.getaccountallprojectsbyparams.v20151101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname GetAccountAllProjectsByParamsRequest @Description 请求参数
 */
@Data
public class GetAccountAllProjectsByParamsRequest {
  /** 每页显示条数 */
  @KsYunField(name = "Ps")
  private Integer Ps;

  /** 页码 */
  @KsYunField(name = "Pn")
  private Integer Pn;

  /** 子账号用户名 */
  @KsYunField(name = "ParamUserName")
  private String ParamUserName;

  /** 该主账号下任意一个子账号的AccessKey */
  @KsYunField(name = "ParamAccessKey")
  private String ParamAccessKey;
}
