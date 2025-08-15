package ksyun.client.kce.installrelease.v20190806;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname InstallReleaseRequest @Description 请求参数
 */
@Data
public class InstallReleaseRequest {
  /** 集群 Id */
  @KsYunField(name = "ClusterId")
  private String ClusterId;

  /** 命名空间 */
  @KsYunField(name = "Namespace")
  private String Namespace;

  /** 应用名称 */
  @KsYunField(name = "ReleaseName")
  private String ReleaseName;

  /** Chart 来源 */
  @KsYunField(name = "ChartSource")
  private String ChartSource;

  /** Chart命名空间，ChartSource为KSYUN 时，必填 */
  @KsYunField(name = "ChartNamespace")
  private String ChartNamespace;

  /** Chart 名称，ChartSource为KSYUN 时，必填 */
  @KsYunField(name = "ChartName")
  private String ChartName;

  /** Chart版本，ChartSource为 KSYUN时，必填 */
  @KsYunField(name = "ChartVersion")
  private String ChartVersion;

  /** Chart 仓库地址，ChartSource 为THIRD时，必填 */
  @KsYunField(name = "ChartUrl")
  private String ChartUrl;

  /** 仓库类型 */
  @KsYunField(name = "ChartRepoType")
  private String ChartRepoType;

  /** 仓库的用户名 ChartRepoType 为PRIVATE时，必填 */
  @KsYunField(name = "ChartRepoUsername")
  private String ChartRepoUsername;

  /** 仓库的密码 ChartRepoType为PRIVATE时，必填 */
  @KsYunField(name = "ChartRepoPassword")
  private String ChartRepoPassword;

  /** Values.yaml文件内容 */
  @KsYunField(name = "Values")
  private String Values;
}
