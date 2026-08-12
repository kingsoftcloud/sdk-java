package ksyun.client.kpfs.describeclusterinfo.v20240930;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeClusterInfoRequest
* @Description 请求参数
*/
@Data
public class DescribeClusterInfoRequest{
    /**查询对应地域下支持的存储池类型。*/
    @KsYunField(name="Region")
    private String Region;

    /**可用区，需与地域参数配合使用。*/
    @KsYunField(name="AvailZone")
    private String AvailZone;

    /**文件系统存储类型。*/
    @KsYunField(name="StoreClass")
    private String StoreClass;

    /**存储RoCE集群名称，仅性能Ⅰ型、性能Ⅱ型支持。传入后返回对应集群下的存储集群信息。*/
    @KsYunField(name="SRoceCluster")
    private String SRoceCluster;

    /**存储池类型。*/
    @KsYunField(name="StorePoolType")
    private String StorePoolType;

}
