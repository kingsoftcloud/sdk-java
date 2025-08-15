package ksyun.client.kmr.startflinkjobrun.v20240814;

import common.annotation.KsYunField;
import java.util.List;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname StartFlinkJobRunRequest @Description 请求参数
 */
@Data
public class StartFlinkJobRunRequest {
  /** 工作空间ID */
  @KsYunField(name = "WorkspaceId")
  private String WorkspaceId;

  /** 用于API请求认证 */
  @KsYunField(name = "AccessKeyId")
  private String AccessKeyId;

  /** 用于API请求认证 */
  @KsYunField(name = "AccessKeySecret")
  private String AccessKeySecret;

  /** Flink版本 */
  @KsYunField(name = "ReleaseVersion")
  private String ReleaseVersion;

  /***/
  @KsYunField(name = "SubmitData")
  private SubmitDataDto SubmitDataList;

  @Data
  @ToString
  public static class SubmitDataDto {
    /** 作业名称 */
    @KsYunField(name = "Name")
    private String Name;

    /** 作业使用的镜像 */
    @KsYunField(name = "Image")
    private String Image;

    /** Flink类型 */
    @KsYunField(name = "UpgradeMode")
    private String UpgradeMode;

    /** Flink作业的Job核数 */
    @KsYunField(name = "JobCores")
    private Integer JobCores;

    /** Flink作业的Job内存 */
    @KsYunField(name = "JobMemory")
    private String JobMemory;

    /** Flink作业的Task核数 */
    @KsYunField(name = "TaskCores")
    private Integer TaskCores;

    /** Flink作业的Task内存 */
    @KsYunField(name = "TaskMemory")
    private String TaskMemory;

    /** Flink作业的Task数量 */
    @KsYunField(name = "NumTasks")
    private Integer NumTasks;

    /** 作业配置信息 */
    @KsYunField(name = "FlinkConf")
    private List<String> FlinkConfList;

    /** 作业依赖文件ks3路径 */
    @KsYunField(name = "Dependencies")
    private List<String> DependenciesList;

    /** 运行时环境配置，如依赖、环境变量、工作目录等 */
    @KsYunField(name = "JarUri")
    private String JarUri;

    /** 启动类，需填写类的全称 */
    @KsYunField(name = "EntryClass")
    private String EntryClass;

    /** 启动类所需参数 */
    @KsYunField(name = "MainArgs")
    private List<String> MainArgsList;
  }
}
