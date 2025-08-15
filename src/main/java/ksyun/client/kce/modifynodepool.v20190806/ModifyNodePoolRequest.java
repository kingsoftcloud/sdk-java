package ksyun.client.kce.modifynodepool.v20190806;

import common.annotation.KsYunField;
import java.util.List;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname ModifyNodePoolRequest @Description 请求参数
 */
@Data
public class ModifyNodePoolRequest {
  /** 集群id */
  @KsYunField(name = "ClusterId")
  private String ClusterId;

  /** 节点池id */
  @KsYunField(name = "NodePoolId")
  private String NodePoolId;

  /** 节点池名称 */
  @KsYunField(name = "NodePoolName")
  private String NodePoolName;

  /**
   * 是否开启弹性伸缩，有效值：<br>
   * - **False**：关闭弹性伸缩
   */
  @KsYunField(name = "EnableAutoScale")
  private Boolean EnableAutoScale;

  /** 最小节点数量，即为最小能缩容的实例数量，范围[0-50]，不大于maxSize */
  @KsYunField(name = "MinSize")
  private Integer MinSize;

  /** 最大节点数量，即为最大能扩容的实例数量，范围[0-50]，不小于minSize */
  @KsYunField(name = "MaxSize")
  private Integer MaxSize;

  /**
   * 期望节点数量，必须在最小节点数量与最大节点数量之间<br>
   * 注：若EnableAutoScale参数为True，不可修改该参数
   */
  @KsYunField(name = "DesiredCapacity")
  private Integer DesiredCapacity;

  /** 节点标签 */
  @KsYunField(name = "Label")
  private List<LabelDto> LabelList;

  @Data
  @ToString
  public static class LabelDto {
    /** 标签名 */
    @KsYunField(name = "Key")
    private String Key;

    /** 标签值 */
    @KsYunField(name = "Value")
    private String Value;
  }

  /** 节点污点 */
  @KsYunField(name = "Taint")
  private List<TaintDto> TaintList;

  @Data
  @ToString
  public static class TaintDto {
    /** 污点名 */
    @KsYunField(name = "Key")
    private String Key;

    /** 污点值 */
    @KsYunField(name = "Value")
    private String Value;

    /** Effect */
    @KsYunField(name = "Effect")
    private String Effect;
  }

  /**
   * Label、Taints更新是否对节点池内所有已有节点生效，有效值：<br>
   * - **True**：对节点池内已有节点以及扩容出来的节点生效<br>
   * - **False**：只对扩容出来的节点生效<br>
   * 默认值：False
   */
  @KsYunField(name = "UpdateExistingNodes")
  private Boolean UpdateExistingNodes;
}
