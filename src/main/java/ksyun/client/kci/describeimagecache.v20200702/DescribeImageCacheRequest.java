package ksyun.client.kci.describeimagecache.v20200702;

import common.annotation.KsYunField;
import java.util.List;
import lombok.Data;

/**
 * @Classname DescribeImageCacheRequest @Description 请求参数
 */
@Data
public class DescribeImageCacheRequest {
  /** 指定镜像缓存ID查询，其它参数ImageCacheName、Image则无效 */
  @KsYunField(name = "ImageCacheId")
  private List<String> ImageCacheIdList;

  /** 镜像缓存名称关键字模糊匹配，最长63个字符，必须满足 `^[a-zA-Z0-9]([-a-zA-Z0-9._]*[a-zA-Z0-9])?$` 格式 */
  @KsYunField(name = "ImageCacheName")
  private String ImageCacheName;

  /** 镜像字符串格式，模糊匹配，如nginx */
  @KsYunField(name = "Image")
  private String Image;

  /** 记录起始值 */
  @KsYunField(name = "Marker")
  private Integer Marker;

  /** 单次查询最大记录数，默认20，最大100 */
  @KsYunField(name = "MaxResults")
  private Integer MaxResults;
}
