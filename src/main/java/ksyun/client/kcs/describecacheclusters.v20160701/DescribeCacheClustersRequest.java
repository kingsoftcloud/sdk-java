package ksyun.client.kcs.describecacheclusters.v20160701;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribeCacheClustersRequest
 * @Description 请求参数
 */
@Data
public class DescribeCacheClustersRequest {
    /**
     * 实例所属az。AvailableZone不作为实例筛选条件。
     */
    @KsYunField(name = "AvailableZone")
    private String AvailableZone;

    /**
     * 缓存服务ID。
     */
    @KsYunField(name = "CacheId")
    private String CacheId;

    /**
     * 缓存服务名称。
     */
    @KsYunField(name = "Name")
    private String Name;

    /**
     * 缓存服务IP。
     */
    @KsYunField(name = "Vip")
    private String Vip;

    /**
     * 虚拟网络ID。   	 只适用于VPC网络下的缓存服务。
     */
    @KsYunField(name = "VpcId")
    private String VpcId;

    /**
     * 终端子网ID 。  	 只适用于VPC网络下的缓存服务。
     */
    @KsYunField(name = "VnetId")
    private String VnetId;

    /**
     * 数据偏移量。   	 默认：0。
     */
    @KsYunField(name = "Offset")
    private String Offset;

    /**
     * 每页查询数量。     	 默认：10，取值范围为[1~100]。
     */
    @KsYunField(name = "Limit")
    private String Limit;

    /**
     * 排序字段。    	 传值为{name,asc，name,desc，created,asc，created,desc}，默认按照创建时间降序，只有排序字段时，默认按照升序排列。
     */
    @KsYunField(name = "OrderBy")
    private String OrderBy;

    /**
     * 项目ID。       	 默认：查询全部项目。可传入多个的项目ID，以‘,’（逗号）隔开。
     */
    @KsYunField(name = "IamProjectId")
    private String IamProjectId;

    /**
     * 模糊条件查询。 	 如：可根据ID，IP，名称进行过滤。
     */
    @KsYunField(name = "FuzzySearch")
    private String FuzzySearch;

    /**
     * 版本号。 	 默认：查询所有，可选版本号：4.0、5.0、6.0。
     */
    @KsYunField(name = "Protocol")
    private String Protocol;

    /**
     * 标签的key，标签名。标签过滤查询（必须同标签值一同传入）。
     */
    @KsYunField(name = "TagKey")
    private String TagKey;

    /**
     * 标签的value，标签值。标签过滤查询（必须同标签名一同传入）。
     */
    @KsYunField(name = "TagValue")
    private String TagValue;

    /**
     * 根据实例的部署方式进行筛选。可选：singledatanode（主从实例），cluster（集群实例），enterprise（企业版）。
     */
    @KsYunField(name = "Mode")
    private String Mode;


}