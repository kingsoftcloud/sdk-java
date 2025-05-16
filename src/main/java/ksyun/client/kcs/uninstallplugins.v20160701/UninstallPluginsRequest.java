package ksyun.client.kcs.uninstallplugins.v20160701;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

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