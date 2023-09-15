package ksyun.client.memcached.describecacheclusters.v20180627;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeCacheClustersRequest
* @Description 请求参数
*/
@Data
public class DescribeCacheClustersRequest{
    /**服务引擎                              	 取固定值memcached*/
    @KsYunField(name="Engine")
    private String Engine;

    /**缓存服务ID*/
    @KsYunField(name="CacheId")
    private String CacheId;

    /**缓存服务名称*/
    @KsYunField(name="Name")
    private String Name;

    /**缓存服务IP地址*/
    @KsYunField(name="Vip")
    private String Vip;

    /**虚拟专用网络ID                         	 只适用于VPC网络下的缓存服务*/
    @KsYunField(name="VpcId")
    private String VpcId;

    /**虚拟专用网路EndpointID，或vpclbID      	 只适用于VPC网络下的缓存服务*/
    @KsYunField(name="VnetId")
    private String VnetId;

    /**查询数据的起始位置                     	 默认为0*/
    @KsYunField(name="Offset")
    private String Offset;

    /**需要从起始位置开始查询的缓存服务的个数 	 取值范围为[1~100]，默认为10*/
    @KsYunField(name="Limit")
    private String Limit;

    /**排序字段                               	 可传值为{name,asc，name,desc，created,asc，created,desc}，默认按照创建时间降序，只有排序字段时，默认按照升序排列*/
    @KsYunField(name="OrderBy")
    private String OrderBy;

    /**项目ID                                 	 默认是0(默认项目),如果查询全部项目，需要传入所有的项目ID，‘,’隔开*/
    @KsYunField(name="IamProjectId")
    private String IamProjectId;


}