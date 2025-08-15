package ksyun.client.clickhouse.recoverrecycledinstance.v20210101;

import common.annotation.KsYunField;
import java.util.List;
import lombok.Data;

/**
 * @Classname RecoverRecycledInstanceRequest @Description 请求参数
 */
@Data
public class RecoverRecycledInstanceRequest {
  /** 实例ID列表。 */
  @KsYunField(name = "InstanceIds", type = 2)
  private List<String> InstanceIdsList;
}
