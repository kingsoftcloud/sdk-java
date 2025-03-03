package ksyun.client.kcs.describecacheparametergroups.v20160701;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribeCacheParameterGroupsRequest
 * @Description 请求参数
 */
@Data
public class DescribeCacheParameterGroupsRequest {
    /**
     * 可用区     	 默认：对应机房的a区
     */
    @KsYunField(name = "AvailableZone")
    private String AvailableZone;

    /**
     * 参数组名称
     */
    @KsYunField(name = "Name")
    private String Name;

    /**
     * 参数组ID 	 参数组ID
     */
    @KsYunField(name = "CacheParameterGroupId")
    private String CacheParameterGroupId;

    /**
     * 参数组版本 	 参数组版本
     */
    @KsYunField(name = "ParamVersion")
    private String ParamVersion;

    /**
     * 数据偏移量 	 默认：0
     */
    @KsYunField(name = "Offset")
    private String Offset;

    /**
     * 每页数量   	 默认：10，取值范围为[1~10000]
     */
    @KsYunField(name = "Limit")
    private String Limit;


}