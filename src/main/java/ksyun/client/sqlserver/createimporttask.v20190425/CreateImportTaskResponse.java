package ksyun.client.sqlserver.createimporttask.v20190425;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname CreateImportTaskResponse @Description CreateImportTask 返回体
 */
@Data
@ToString
public class CreateImportTaskResponse extends BaseResponseModel {

  /** 请求id */
  @JsonProperty("RequestId")
  private String requestId;

  // 返回结果，需要按需扩展

}
