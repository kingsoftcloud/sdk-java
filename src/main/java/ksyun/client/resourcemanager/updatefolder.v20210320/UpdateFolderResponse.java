package ksyun.client.resourcemanager.updatefolder.v20210320;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname UpdateFolderResponse @Description UpdateFolder 返回体
 */
@Data
@ToString
public class UpdateFolderResponse extends BaseResponseModel {

  /** 请求id */
  @JsonProperty("RequestId")
  private String requestId;

  // 返回结果，需要按需扩展

}
