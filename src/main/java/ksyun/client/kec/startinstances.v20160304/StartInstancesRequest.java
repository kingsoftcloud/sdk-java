package ksyun.client.kec.startinstances.v20160304;

import common.annotation.KsYunField;
import java.util.List;
import lombok.Data;

/**
 * @Classname StartInstancesRequest @Description 请求参数
 */
@Data
public class StartInstancesRequest {
  /** 待启动实例ID列表，N的范围为1-100 */
  @KsYunField(name = "InstanceId")
  private List<String> InstanceIdList;
}
