package ksyun.client.mongodb.describemongodbinstancenode.v20170101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname DescribeMongoDBInstanceNodeResponse @Description DescribeMongoDBInstanceNode 返回体
 */
@Data
@ToString
public class DescribeMongoDBInstanceNodeResponse extends BaseResponseModel {

  /** 请求id */
  @JsonProperty("RequestId")
  private String requestId;

  // 返回结果，需要按需扩展

}
