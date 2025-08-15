package ksyun.client.actiontrail.listoperatelogs.v20190401;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname ListOperateLogsResponse @Description ListOperateLogs 返回体
 */
@Data
@ToString
public class ListOperateLogsResponse extends BaseResponseModel {

  /** 请求id */
  @JsonProperty("RequestId")
  private String requestId;

  // 返回结果，需要按需扩展

}
