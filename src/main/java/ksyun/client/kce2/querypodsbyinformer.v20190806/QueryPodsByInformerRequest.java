package ksyun.client.kce2.querypodsbyinformer.v20190806;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname QueryPodsByInformerRequest @Description 请求参数
 */
@Data
public class QueryPodsByInformerRequest {
  /***/
  @KsYunField(name = "ClusterId")
  private String ClusterId;

  /***/
  @KsYunField(name = "Namespace")
  private String Namespace;

  /***/
  @KsYunField(name = "PodName")
  private String PodName;

  /***/
  @KsYunField(name = "NodeIp")
  private String NodeIp;

  /***/
  @KsYunField(name = "PodIp")
  private String PodIp;

  /***/
  @KsYunField(name = "Labels")
  private String Labels;

  /***/
  @KsYunField(name = "Page")
  private Integer Page;

  /***/
  @KsYunField(name = "PageSize")
  private Integer PageSize;
}
