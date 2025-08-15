package ksyun.client.tidb.describedatabases.v20210520;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribeDatabasesRequest @Description 请求参数
 */
@Data
public class DescribeDatabasesRequest {
  /** 实例id */
  @KsYunField(name = "InstanceId")
  private String InstanceId;
}
