package ksyun.client.klog.listlogpools.v20200731;

import common.annotation.KsYunField;
import java.util.List;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname ListLogPoolsRequest @Description 请求参数
 */
@Data
public class ListLogPoolsRequest {
  /** 工程名称 */
  @KsYunField(name = "ProjectName")
  private String ProjectName;

  /** 如果想要根据名称搜索某个日志池，该字段必须填写 */
  @KsYunField(name = "LogPoolName")
  private String LogPoolName;

  /** 页码，从0开始 */
  @KsYunField(name = "Page")
  private Integer Page;

  /** 每页返回最大条目，最大值500 */
  @KsYunField(name = "Size")
  private Integer Size;

  /** 需要筛选的标签 */
  @KsYunField(name = "Tags", type = 2)
  private List<TagsDto> TagsList;

  @Data
  @ToString
  public static class TagsDto {
    /** 标签键 */
    private String Key;

    /** 标签值 */
    private String Value;
  }
}
