package ksyun.client.kcs.describehotkeys.v20160701;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeHotKeysRequest
* @Description 请求参数
*/
@Data
public class DescribeHotKeysRequest{
    /**可用区       	 默认：对应机房的a区*/
    @KsYunField(name="AvailableZone")
    private String AvailableZone;

    /**缓存服务ID   	 缓存服务ID*/
    @KsYunField(name="CacheId")
    private String CacheId;

    /**偏移量       	 默认：10*/
    @KsYunField(name="Limit")
    private Integer Limit;

    /**每页数量     	 默认：0*/
    @KsYunField(name="Offset")
    private Integer Offset;

    /**排序字段名		 count*/
    @KsYunField(name="SortKey")
    private String SortKey;

    /**排序方式		 asc,desc*/
    @KsYunField(name="SortDir")
    private String SortDir;


}