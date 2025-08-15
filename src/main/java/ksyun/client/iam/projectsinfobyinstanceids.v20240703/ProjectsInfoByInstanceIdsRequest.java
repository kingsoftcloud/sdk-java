package ksyun.client.iam.projectsinfobyinstanceids.v20240703;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ProjectsInfoByInstanceIdsRequest @Description 请求参数
 */
@Data
public class ProjectsInfoByInstanceIdsRequest {
  /** 实例ID，多个英文逗号分隔，min:1 max:100 */
  @KsYunField(name = "InstanceIds")
  private String InstanceIds;
}
