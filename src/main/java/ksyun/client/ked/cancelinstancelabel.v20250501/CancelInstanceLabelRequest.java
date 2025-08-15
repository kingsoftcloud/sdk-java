package ksyun.client.ked.cancelinstancelabel.v20250501;

import common.annotation.KsYunField;
import java.util.List;
import lombok.Data;

/**
 * @Classname CancelInstanceLabelRequest @Description 请求参数
 */
@Data
public class CancelInstanceLabelRequest {
  /** 标签id */
  @KsYunField(name = "labelId", type = 2)
  private List<Integer> LabelIdList;

  /** 实例id */
  @KsYunField(name = "instanceId")
  private String InstanceId;
}
