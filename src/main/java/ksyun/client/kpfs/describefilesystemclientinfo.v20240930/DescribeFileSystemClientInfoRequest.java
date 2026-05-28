package ksyun.client.kpfs.describefilesystemclientinfo.v20240930;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeFileSystemClientInfoRequest
* @Description 请求参数
*/
@Data
public class DescribeFileSystemClientInfoRequest{
    /**文件系统实例ID*/
    @KsYunField(name="FileSystemId")
    private String FileSystemId;

    /**客户端所在缓存组，仅容量Ⅰ型、容量Ⅱ型、标准型支持，精确匹配。*/
    @KsYunField(name="CacheGroup")
    private String CacheGroup;

    /**客户端所在缓存组中的角色，仅容量Ⅰ型、容量Ⅱ型、标准型支持，精确匹配。

consumer：代表消费者，即缓存组中的--no-sharing节点

provider：代表提供者*/
    @KsYunField(name="CacheGroupRole")
    private String CacheGroupRole;

    /**客户端对应的主机名称前缀。*/
    @KsYunField(name="HostNamePrefix")
    private String HostNamePrefix;

    /**页码。默认为1。*/
    @KsYunField(name="PageSize")
    private Integer PageSize;

    /**分页大小。默认为10。*/
    @KsYunField(name="PageNum")
    private Integer PageNum;

}
