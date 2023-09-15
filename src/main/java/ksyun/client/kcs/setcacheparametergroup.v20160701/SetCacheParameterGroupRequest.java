package ksyun.client.kcs.setcacheparametergroup.v20160701;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname SetCacheParameterGroupRequest
* @Description 请求参数
*/
@Data
public class SetCacheParameterGroupRequest{
    /**可用区     	 默认：对应机房的a区*/
    @KsYunField(name="AvailableZone")
    private String AvailableZone;

    /**参数组ID。*/
    @KsYunField(name="CacheParameterGroupId")
    private String CacheParameterGroupId;

    /**缓存服务ID。*/
    @KsYunField(name="CacheId")
    private String CacheId;


}