package ksyun.client.kcs.deletecacheslavenode.v20170401;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname DeleteCacheSlaveNodeResponse @Description DeleteCacheSlaveNode 返回体
 */
@Data
@ToString
public class DeleteCacheSlaveNodeResponse extends BaseResponseModel {

  /** 请求id */
  @JsonProperty("RequestId")
  private String requestId;

  // 返回结果，需要按需扩展

}
