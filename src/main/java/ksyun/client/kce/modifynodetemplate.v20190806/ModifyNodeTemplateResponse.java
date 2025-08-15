package ksyun.client.kce.modifynodetemplate.v20190806;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname ModifyNodeTemplateResponse @Description ModifyNodeTemplate 返回体
 */
@Data
@ToString
public class ModifyNodeTemplateResponse extends BaseResponseModel {

  /** 请求id */
  @JsonProperty("RequestId")
  private String requestId;

  // 返回结果，需要按需扩展

}
