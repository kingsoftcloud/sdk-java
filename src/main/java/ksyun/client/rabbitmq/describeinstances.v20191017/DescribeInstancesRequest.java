package ksyun.client.rabbitmq.describeinstances.v20191017;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribeInstancesRequest
 * @Description 请求参数
 */
@Data
public class DescribeInstancesRequest {
    /**
     * 实例Id。
     */
    @KsYunField(name = "InstanceId")
    private String InstanceId;

    /**
     * 实例名称。
     */
    @KsYunField(name = "InstanceName")
    private String InstanceName;

    /**
     * VPC网络ID。
     */
    @KsYunField(name = "VpcId")
    private String VpcId;

    /**
     * 终端子网ID。
     */
    @KsYunField(name = "SubnetId")
    private String SubnetId;

    /**
     * 位移量（查询数据的开始位置，默认为0）
     */
    @KsYunField(name = "Offset")
    private Integer Offset;

    /**
     * 每页记录大小, 最小值是1， 最大值100， 默认值是10
     */
    @KsYunField(name = "Limit")
    private Integer Limit;

    /**
     * 排序字段：InstanceId,InstanceName,VpcId,SubnetId,CreateDate
     * <p>
     * 默认为依照实例新建时间由新到旧依次排列，即按创建时间倒序。
     * OrderBy只为排序字段时，默认按升序排列
     * 可按“实例名称“进行升降排序
     * 传值为如下：
     * instanceName,asc
     * instanceName,desc
     * 可按“创建时间”进行升降排序
     * 传值如下：
     * createTime,asc
     * createTime,desc
     */
    @KsYunField(name = "OrderBy")
    private String OrderBy;

    /**
     * 项目Id,多项目id使用‘,’ 分隔。
     */
    @KsYunField(name = "ProjectId")
    private String ProjectId;

}