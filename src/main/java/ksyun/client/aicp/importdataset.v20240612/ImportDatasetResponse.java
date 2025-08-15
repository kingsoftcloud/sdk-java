package ksyun.client.aicp.importdataset.v20240612;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname ImportDatasetResponse @Description ImportDataset 返回体
 */
@Data
@ToString
public class ImportDatasetResponse extends BaseResponseModel {

  /** 请求id */
  @JsonProperty("RequestId")
  private String requestId;

  // 返回结果，需要按需扩展

}
