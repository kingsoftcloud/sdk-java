package ksyun.client.kcs.uninstallplugins.v20160701;

import common.annotation.KsYunField;
import lombok.Data;

import java.util.List;

/**
 * @Classname UninstallPluginsRequest
 * @Description 请求参数
 */
@Data
public class UninstallPluginsRequest {
    /**
     * 实例ID
     */
    @KsYunField(name = "CacheId")
    private String CacheId;

    /**
     * 插件名称
     */
    @KsYunField(name = "PluginNames", type = 2)
    private List<String> PluginNamesList;

}