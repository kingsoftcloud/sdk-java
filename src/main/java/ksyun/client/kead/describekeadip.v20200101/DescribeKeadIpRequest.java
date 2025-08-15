package ksyun.client.kead.describekeadip.v20200101;

import common.annotation.KsYunField;
import java.util.List;
import lombok.Data;

/**
 * @Classname DescribeKeadIpRequest @Description 请求参数
 */
@Data
public class DescribeKeadIpRequest {
  /***/
  @KsYunField(name = "Ip")
  private String Ip;

  /** 项目制id */
  @KsYunField(name = "ProjectId")
  private List<Integer> ProjectId;

  /** 每页条数 */
  @KsYunField(name = "PageSize")
  private Integer PageSize;

  /** 开始条数 */
  @KsYunField(name = "OffSet")
  private Integer OffSet;
}
