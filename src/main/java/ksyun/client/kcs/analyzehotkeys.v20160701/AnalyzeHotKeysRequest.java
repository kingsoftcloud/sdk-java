package ksyun.client.kcs.analyzehotkeys.v20160701;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname AnalyzeHotKeysRequest
 * @Description 请求参数
 */
@Data
public class AnalyzeHotKeysRequest {
    /**
     * 可用区       	 默认：对应机房的a区
     */
    @KsYunField(name = "AvailableZone")
    private String AvailableZone;

    /**
     * 缓存服务ID
     */
    @KsYunField(name = "CacheId")
    private String CacheId;

}