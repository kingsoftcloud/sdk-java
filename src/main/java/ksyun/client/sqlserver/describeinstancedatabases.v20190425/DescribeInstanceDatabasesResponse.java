package ksyun.client.sqlserver.describeinstancedatabases.v20190425;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname DescribeInstanceDatabasesResponse @Description DescribeInstanceDatabases 返回体
 */
@Data
@ToString
public class DescribeInstanceDatabasesResponse extends BaseResponseModel {

  /** 请求id */
  @JsonProperty("RequestId")
  private String requestId;

  // 返回结果，需要按需扩展

}
