package ksyun.client.iam.updateprojectinfo.v20151101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname UpdateProjectInfoRequest @Description 请求参数
 */
@Data
public class UpdateProjectInfoRequest {
  /** ProjectId */
  @KsYunField(name = "ProjectId")
  private Integer ProjectId;

  /** 项目名称，最多64个字符 */
  @KsYunField(name = "ProjectName")
  private String ProjectName;

  /** 项目描述，最多64个字符 */
  @KsYunField(name = "ProjectDesc")
  private String ProjectDesc;
}
