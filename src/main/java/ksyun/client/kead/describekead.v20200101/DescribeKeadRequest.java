package ksyun.client.kead.describekead.v20200101;

import common.annotation.KsYunField;
import java.util.List;
import lombok.Data;

/**
 * @Classname DescribeKeadRequest @Description 请求参数
 */
@Data
public class DescribeKeadRequest {
  /** 高防包ID */
  @KsYunField(name = "KeadId")
  private List<String> KeadIdList;

  /** 项目制id */
  @KsYunField(name = "ProjectId")
  private List<Integer> ProjectId;
}
