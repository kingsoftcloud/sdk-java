package ksyun.client.mongodb.deletemongodbinstance.v20170101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname DeleteMongoDBInstanceResponse @Description DeleteMongoDBInstance 返回体
 */
@Data
@ToString
public class DeleteMongoDBInstanceResponse extends BaseResponseModel {

  /** 请求id */
  @JsonProperty("RequestId")
  private String requestId;

  // 返回结果，需要按需扩展

}
