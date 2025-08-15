package ksyun.client.kcs.installplugins.v20160701;

import common.annotation.KsYunField;
import java.util.List;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname InstallPluginsRequest @Description 请求参数
 */
@Data
public class InstallPluginsRequest {
  /** 实例ID */
  @KsYunField(name = "CacheId")
  private String CacheId;

  /** 需安装的插件列表。 */
  @KsYunField(name = "Plugins", type = 2)
  private List<PluginsDto> PluginsList;

  @Data
  @ToString
  public static class PluginsDto {
    /** 插件名称 */
    private String PluginName;

    /** 插件版本 */
    private String PluginVersion;
  }
}
