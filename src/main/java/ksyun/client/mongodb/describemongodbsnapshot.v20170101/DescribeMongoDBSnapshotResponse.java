package ksyun.client.mongodb.describemongodbsnapshot.v20170101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname DescribeMongoDBSnapshotResponse @Description DescribeMongoDBSnapshot 返回体
 */
@Data
@ToString
public class DescribeMongoDBSnapshotResponse extends BaseResponseModel {

  /** 请求id */
  @JsonProperty("RequestId")
  private String requestId;

  // 返回结果，需要按需扩展

}
