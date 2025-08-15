package ksyun.client.kcf.deletefunction.v20211215;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DeleteFunctionRequest @Description 请求参数
 */
@Data
public class DeleteFunctionRequest {
  /** 函数ID */
  @KsYunField(name = "Id")
  private String Id;
}
