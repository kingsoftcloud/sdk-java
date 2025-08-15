package ksyun.client.kec.describescalingconfiguration.v20160304;

import common.annotation.KsYunField;
import java.util.List;
import lombok.Data;

/**
 * @Classname DescribeScalingConfigurationRequest @Description 请求参数
 */
@Data
public class DescribeScalingConfigurationRequest {
  /** 启动配置名称 */
  @KsYunField(name = "ScalingConfigurationName")
  private String ScalingConfigurationName;

  /** 待查询的各启动配置ID构成的数组数组下标从0开始，最多可指定20个 */
  @KsYunField(name = "ScalingConfigurationId")
  private List<String> ScalingConfigurationIdList;

  /** 偏移量，默认为0偏移量，默认为0 */
  @KsYunField(name = "Marker")
  private Integer Marker;

  /** 项目组id */
  @KsYunField(name = "ProjectId")
  private List<String> ProjectIdList;

  /** 一次最多可查询的启动配置数量 默认为10，最小为5 */
  @KsYunField(name = "MaxResults")
  private Integer MaxResults;
}
