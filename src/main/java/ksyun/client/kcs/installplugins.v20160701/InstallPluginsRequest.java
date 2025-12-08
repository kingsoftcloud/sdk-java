package ksyun.client.kcs.installplugins.v20160701;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname InstallPluginsRequest
* @Description 请求参数
*/
@Data
public class InstallPluginsRequest{
    /**实例ID*/
    @KsYunField(name="CacheId")
    private String CacheId;

    /**需安装的插件列表。*/
    @KsYunField(name="Plugins",type=2)
    private List<PluginsDto1> PluginsList;

    @Data
    @ToString
    public static class PluginsDto1 {
        /**插件名称*/
        @KsYunField(name="PluginName")
        private String PluginName;

        /**插件版本*/
        @KsYunField(name="PluginVersion")
        private String PluginVersion;

    }

}
