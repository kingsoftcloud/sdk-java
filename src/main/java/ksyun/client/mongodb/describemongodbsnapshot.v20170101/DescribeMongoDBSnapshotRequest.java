package ksyun.client.mongodb.describemongodbsnapshot.v20170101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribeMongoDBSnapshotRequest @Description 请求参数
 */
@Data
public class DescribeMongoDBSnapshotRequest {
  /** 实例Id */
  @KsYunField(name = "InstanceId")
  private String InstanceId;
}
