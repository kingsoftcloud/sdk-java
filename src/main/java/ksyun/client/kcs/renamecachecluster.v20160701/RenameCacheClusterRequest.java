package ksyun.client.kcs.renamecachecluster.v20160701;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname RenameCacheClusterRequest
 * @Description 请求参数
 */
@Data
public class RenameCacheClusterRequest {
    /**
     * 可用区       	 默认：对应机房的a区
     */
    @KsYunField(name = "AvailableZone")
    private String AvailableZone;

    /**
     * 缓存服务ID。
     */
    @KsYunField(name = "CacheId")
    private String CacheId;

    /**
     * 缓存服务名称。 	 支持6-64个中文或者英文字符，包括汉字，大小写字母，数字，下划线和中划线。
     */
    @KsYunField(name = "Name")
    private String Name;

}