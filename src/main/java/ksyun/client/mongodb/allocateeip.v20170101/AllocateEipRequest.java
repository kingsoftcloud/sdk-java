package ksyun.client.mongodb.allocateeip.v20170101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname AllocateEipRequest @Description 请求参数
 */
@Data
public class AllocateEipRequest {
  /** 实例id */
  @KsYunField(name = "InstanceId")
  private String InstanceId;

  /** ip地址类型。ipv4默认不用填写,若为ipv6则需要填写 */
  @KsYunField(name = "Type")
  private String Type;
}
