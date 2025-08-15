package ksyun.client.aicp.describenotebooks.v20240612;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname DescribeNotebooksResponse @Description DescribeNotebooks 返回体
 */
@Data
@ToString
public class DescribeNotebooksResponse extends BaseResponseModel {

  /** 请求id */
  @JsonProperty("RequestId")
  private String requestId;

  // 返回结果，需要按需扩展

}
