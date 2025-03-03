package ksyun.client.kce2.createaddoninstance.v20230101;

import common.annotation.KsYunField;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * @Classname CreateAddonInstanceRequest
 * @Description 请求参数
 */
@Data
public class CreateAddonInstanceRequest {
    /**
     * 集群ID
     */
    @KsYunField(name = "ClusterId")
    private String ClusterId;

    /***/
    @KsYunField(name = "Addons", type = 2)
    private List<AddonsDto> AddonsList;

    @Data
    @ToString
    public static class AddonsDto {
        /**
         * 插件名称
         */
        private String Name;
        /**
         * 插件类型
         */
        private String Type;
        /**
         * 插件配置参数
         */
        private String Config;
        /**
         * 插件版本
         */
        private String AddonVersion;
    }

}