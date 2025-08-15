package ksyun.client.dmp.updatedatabasetable.v20240101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname UpdateDatabaseTableResponse @Description UpdateDatabaseTable 返回体
 */
@Data
@ToString
public class UpdateDatabaseTableResponse extends BaseResponseModel {

  /** 请求id */
  @JsonProperty("RequestId")
  private String requestId;

  // 返回结果，需要按需扩展

}
