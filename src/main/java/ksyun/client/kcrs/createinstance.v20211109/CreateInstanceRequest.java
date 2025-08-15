package ksyun.client.kcrs.createinstance.v20211109;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname CreateInstanceRequest @Description 请求参数
 */
@Data
public class CreateInstanceRequest {
  /**
   * 实例名称<br>
   * 校验规则：长度为2-30个字符，支持填写小写英文字母、数字，且不能以数字开头
   */
  @KsYunField(name = "InstanceName")
  private String InstanceName;

  /**
   * 实例计费方式，有效值：<br>
   * HourlyInstantSettlement：按量付费<br>
   * Monthly：包年包月<br>
   * 默认值：HourlyInstantSettlement
   */
  @KsYunField(name = "ChargeType")
  private String ChargeType;

  /**
   * 实例规格，有效值：<br>
   * basic：基础版<br>
   * premium：高级版
   */
  @KsYunField(name = "InstanceType")
  private String InstanceType;

  /**
   * 购买时长，单位为月（按年付费请输入12的整数倍）<br>
   * 注：当ChargeType参数设置为Monthly时，此项必填
   */
  @KsYunField(name = "PurchaseTime")
  private String PurchaseTime;

  /** 实例所属项目ID，若不填，则默认为默认项目 */
  @KsYunField(name = "ProjectId")
  private String ProjectId;
}
