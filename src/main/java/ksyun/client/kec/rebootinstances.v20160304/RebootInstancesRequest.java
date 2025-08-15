package ksyun.client.kec.rebootinstances.v20160304;

import common.annotation.KsYunField;
import java.util.List;
import lombok.Data;

/**
 * @Classname RebootInstancesRequest @Description 请求参数
 */
@Data
public class RebootInstancesRequest {
  /** 待重启实例ID列表，N的范围为1-100 */
  @KsYunField(name = "InstanceId")
  private List<String> InstanceIdList;

  /** 强制重启 */
  @KsYunField(name = "ForceReboot")
  private Boolean ForceReboot;
}
