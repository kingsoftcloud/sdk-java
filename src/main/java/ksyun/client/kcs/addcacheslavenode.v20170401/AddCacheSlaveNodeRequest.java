package ksyun.client.kcs.addcacheslavenode.v20170401;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname AddCacheSlaveNodeRequest
* @Description 请求参数
*/
@Data
public class AddCacheSlaveNodeRequest{
    /**可用区     	 默认：对应机房的a区*/
    @KsYunField(name="AvailableZone")
    private String AvailableZone;

    /**缓存服务ID*/
    @KsYunField(name="CacheId")
    private String CacheId;

    /**只读节点IP 	 默认:自动分配*/
    @KsYunField(name="SlaveVip")
    private String SlaveVip;


}