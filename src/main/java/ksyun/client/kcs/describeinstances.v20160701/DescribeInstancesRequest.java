package ksyun.client.kcs.describeinstances.v20160701;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribeInstancesRequest
 * @Description 请求参数
 */
@Data
public class DescribeInstancesRequest {
    /**
     * 可用区     	 默认：对应机房的a区
     */
    @KsYunField(name = "AvailableZone")
    private String AvailableZone;

    /**
     * 安全组id
     */
    @KsYunField(name = "SecurityGroupId")
    private String SecurityGroupId;

    /**
     * 数据偏移量 	 默认：0，数据偏移量,
     */
    @KsYunField(name = "Offset")
    private Integer Offset;

    /**
     * 返回结果数量限制
     */
    @KsYunField(name = "Limit")
    private Integer Limit;

    /**
     * 参考值：true|false。
     * <br>FilterCache：true 查询绑定指定安全组的缓存服务列表标识；
     * <br>FilterCache：false 查询未绑定指定安全组的缓存服务列表标识；
     */
    @KsYunField(name = "FilterCache")
    private Boolean FilterCache;

    /**
     * 模糊查找。根据缓存服务名称或者IP进行筛选。
     */
    @KsYunField(name = "SearchKey")
    private String SearchKey;

}