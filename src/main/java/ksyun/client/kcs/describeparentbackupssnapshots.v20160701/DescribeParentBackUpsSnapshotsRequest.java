package ksyun.client.kcs.describeparentbackupssnapshots.v20160701;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeParentBackUpsSnapshotsRequest
* @Description 请求参数
*/
@Data
public class DescribeParentBackUpsSnapshotsRequest{
    /**缓存服务ID		缓存服务ID*/
    @KsYunField(name="CacheId")
    private String CacheId;


}