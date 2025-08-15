package ksyun.client.kec.describeimagesharepermission.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname DescribeImageSharePermissionResponse @Description DescribeImageSharePermission 返回体
 */
@Data
@ToString
public class DescribeImageSharePermissionResponse extends BaseResponseModel {

  /** 请求id */
  @JsonProperty("RequestId")
  private String requestId;

  // 返回结果，需要按需扩展

}
