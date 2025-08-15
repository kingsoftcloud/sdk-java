package ksyun.client.dmp.deletebatchinstances.v20240101;

import common.annotation.KsYunField;
import java.util.List;
import lombok.Data;

/**
 * @Classname DeleteBatchInstancesRequest @Description 请求参数
 */
@Data
public class DeleteBatchInstancesRequest {
  /** 待从KDMP中删除的实例ID列表。 注意：实例从KDMP中删除并不影响实例本身运行。 */
  @KsYunField(name = "InstanceIds", type = 2)
  private List<String> InstanceIdsList;
}
