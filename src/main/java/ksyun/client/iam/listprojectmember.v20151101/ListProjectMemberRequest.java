package ksyun.client.iam.listprojectmember.v20151101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ListProjectMemberRequest @Description 请求参数
 */
@Data
public class ListProjectMemberRequest {
  /** 项目ID */
  @KsYunField(name = "ProjectId")
  private Integer ProjectId;
}
