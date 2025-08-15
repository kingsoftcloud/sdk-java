package ksyun.client.cdn.deleteuserusagedataexporttask.v20200901;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname DeleteUserUsageDataExportTaskResponse @Description DeleteUserUsageDataExportTask 返回体
 */
@Data
@ToString
public class DeleteUserUsageDataExportTaskResponse extends BaseResponseModel {

  /** 请求id */
  @JsonProperty("RequestId")
  private String requestId;

  // 返回结果，需要按需扩展

}
