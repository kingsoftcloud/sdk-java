package ksyun.client.epc.modifyprocess.v20151101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ModifyProcessRequest @Description 请求参数
 */
@Data
public class ModifyProcessRequest {
  /** 工单id */
  @KsYunField(name = "OperationProcessId")
  private String OperationProcessId;

  /** 确认是否可以重启，只允许从不允许重启调整到允许重启 有效值： • 0：可以重启 */
  @KsYunField(name = "Confirm")
  private String Confirm;

  /** 客户主动修改工单状态，支持客户关闭，用户选择关闭后如已发起NOC工单则需要取消NOC工单 有效值： • UserClose */
  @KsYunField(name = "Status")
  private String Status;

  /** 工单内容 */
  @KsYunField(name = "Content")
  private String Content;
}
