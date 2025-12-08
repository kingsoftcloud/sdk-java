package ksyun.client.kcs.deletecacheslavenode.v20170401;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DeleteCacheSlaveNodeRequest
* @Description 请求参数
*/
@Data
public class DeleteCacheSlaveNodeRequest{
    /**可用区     	 默认：对应机房的a区*/
    @KsYunField(name="AvailableZone")
    private String AvailableZone;

    /**缓存服务ID。*/
    @KsYunField(name="CacheId")
    private String CacheId;

    /**只读节点ID。*/
    @KsYunField(name="NodeId")
    private String NodeId;

}
