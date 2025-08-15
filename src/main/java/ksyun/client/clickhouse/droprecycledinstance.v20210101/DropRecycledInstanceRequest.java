package ksyun.client.clickhouse.droprecycledinstance.v20210101;

import common.annotation.KsYunField;
import java.util.List;
import lombok.Data;

/**
 * @Classname DropRecycledInstanceRequest @Description 请求参数
 */
@Data
public class DropRecycledInstanceRequest {
  /** 实例ID列表。 */
  @KsYunField(name = "InstanceIds")
  private List<String> InstanceIdsList;
}
