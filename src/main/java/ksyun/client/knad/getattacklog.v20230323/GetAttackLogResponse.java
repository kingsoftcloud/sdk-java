package ksyun.client.knad.getattacklog.v20230323;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname GetAttackLogResponse @Description GetAttackLog 返回体
 */
@Data
@ToString
public class GetAttackLogResponse extends BaseResponseModel {

  /** 请求id */
  @JsonProperty("RequestId")
  private String requestId;

  // 返回结果，需要按需扩展

}
