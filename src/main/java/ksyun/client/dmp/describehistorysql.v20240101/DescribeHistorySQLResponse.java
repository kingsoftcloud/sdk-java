package ksyun.client.dmp.describehistorysql.v20240101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname DescribeHistorySQLResponse @Description DescribeHistorySQL 返回体
 */
@Data
@ToString
public class DescribeHistorySQLResponse extends BaseResponseModel {

  /** 请求id */
  @JsonProperty("RequestId")
  private String requestId;

  // 返回结果，需要按需扩展

}
