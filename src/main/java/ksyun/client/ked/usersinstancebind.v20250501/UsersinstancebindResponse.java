package ksyun.client.ked.usersinstancebind.v20250501;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname UsersinstancebindResponse @Description Usersinstancebind 返回体
 */
@Data
@ToString
public class UsersinstancebindResponse extends BaseResponseModel {

  /** 请求id */
  @JsonProperty("RequestId")
  private String requestId;

  // 返回结果，需要按需扩展

}
