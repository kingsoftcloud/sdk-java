package ksyun.client.aicp.createnotebook.v20240612;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname CreateNotebookResponse @Description CreateNotebook 返回体
 */
@Data
@ToString
public class CreateNotebookResponse extends BaseResponseModel {

  /** 请求id */
  @JsonProperty("RequestId")
  private String requestId;

  // 返回结果，需要按需扩展

}
