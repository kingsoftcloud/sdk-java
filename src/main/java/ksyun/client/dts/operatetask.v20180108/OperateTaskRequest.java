package ksyun.client.dts.operatetask.v20180108;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname OperateTaskRequest @Description 请求参数
 */
@Data
public class OperateTaskRequest {
  /** 主任务ID */
  @KsYunField(name = "TaskId")
  private String TaskId;

  /** 操作类型。可选范围：Start|Stop|Delete|Pause */
  @KsYunField(name = "ActionName")
  private String ActionName;

  /** 任务类型。默认Transmission，若为数据迁移任务，可不传此参数，其他类型必传。范围：数据迁移Transmission 数据同步Synchron */
  @KsYunField(name = "TaskType")
  private String TaskType;

  /** 任务出错跳过功能。默认0 范围：0不跳过 1跳过 ； 0报错手动修复报错内容，重载任务时选择不跳过错误。 1重载任务时选择跳过当前错误（请自行评估跳过错误的风险） */
  @KsYunField(name = "ErrSkip")
  private Integer ErrSkip;
}
