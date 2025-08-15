package ksyun.client.cdn.createuserusagedataexporttask.v20200901;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname CreateUserUsageDataExportTaskResponse @Description CreateUserUsageDataExportTask 返回体
 */
@Data
@ToString
public class CreateUserUsageDataExportTaskResponse extends BaseResponseModel {

  /** 请求id */
  @JsonProperty("RequestId")
  private String requestId;

  // 返回结果，需要按需扩展

}
