package ksyun.client.tagv2.listresources.v20200901;

import common.annotation.KsYunField;
import java.util.List;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname ListResourcesRequest @Description 请求参数
 */
@Data
public class ListResourcesRequest {
  /** 资源类型英文简称 */
  @KsYunField(name = "ResourceType")
  private String ResourceType;

  /** 项目ID，多个用逗号连接 */
  @KsYunField(name = "ProjectIds")
  private String ProjectIds;

  /** regioncode，多个用逗号连接 */
  @KsYunField(name = "RegionCodes")
  private String RegionCodes;

  /** 资源ID，多个用逗号连接 */
  @KsYunField(name = "ResourceUuids")
  private String ResourceUuids;

  /** 资源类型名称，详见 [各产品线资源类型名称](https://docs.ksyun.com/documents/43391) */
  @KsYunField(name = "ResourceName")
  private String ResourceName;

  /***/
  @KsYunField(name = "TagFilters", type = 2)
  private List<TagFiltersDto> TagFiltersList;

  @Data
  @ToString
  public static class TagFiltersDto {
    /** 标签键 */
    private String Key;

    /** 标签值 */
    @KsYunField(name = "Value", type = 2)
    private List<String> ValueList;
  }

  /** 页码 */
  @KsYunField(name = "Page")
  private Integer Page;

  /** 分页数 */
  @KsYunField(name = "PageSize")
  private Integer PageSize;
}
