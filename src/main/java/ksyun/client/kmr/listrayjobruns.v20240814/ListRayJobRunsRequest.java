package ksyun.client.kmr.listrayjobruns.v20240814;

import common.annotation.KsYunField;
import java.util.List;
import lombok.Data;

/**
 * @Classname ListRayJobRunsRequest @Description 请求参数
 */
@Data
public class ListRayJobRunsRequest {
  /** 工作空间ID */
  @KsYunField(name = "WorkspaceId")
  private String WorkspaceId;

  /** 作业名称/ID */
  @KsYunField(name = "NameOrId")
  private String NameOrId;

  /** 筛选条件，作业状态 INIT：初始化 RUNNING：运行中 WAITING：等待中 DELETED：已停止 SUBMITTED：已提交 CREATED_FAILED：创建失败 */
  @KsYunField(name = "Status", type = 2)
  private List<String> StatusList;

  /** 分页页码 */
  @KsYunField(name = "PageNumber")
  private Integer PageNumber;

  /** 分页大小 */
  @KsYunField(name = "PageSize")
  private Integer PageSize;
}
