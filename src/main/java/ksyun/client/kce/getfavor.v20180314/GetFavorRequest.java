package ksyun.client.kce.getfavor.v20180314;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname GetFavorRequest @Description 请求参数
 */
@Data
public class GetFavorRequest {
  /** 单次调用所返回的最大实例数目，默认20，最大99。 */
  @KsYunField(name = "MaxResults")
  private Integer MaxResults;

  /** 分页标识，单次调用未返回全部实例时，标记下次调用的返回值的起点，默认值是0。 */
  @KsYunField(name = "Marker")
  private Integer Marker;

  /** 查询关键字 */
  @KsYunField(name = "Keyword")
  private String Keyword;
}
