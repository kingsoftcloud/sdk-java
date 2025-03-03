package ksyun.client.krds.describedbinstances.v20160701;

import common.annotation.KsYunField;
import lombok.Data;

import java.util.List;

/**
 * @Classname DescribeDBInstancesRequest
 * @Description 请求参数
 */
@Data
public class DescribeDBInstancesRequest {
    /**
     * 实例ID（传入实例ID，获取的是该实例的详情，否则则获取list）
     */
    @KsYunField(name = "DBInstanceIdentifier")
    private String DBInstanceIdentifier;

    /**
     * 实例类型
     * HRDS（高可用）
     * RR（只读实例）
     * TRDS（临时实例）
     * SINGLERDS(单机版)
     * ERDS（三节点企业版）
     * CDS_HRDS(高可用_云盘版)
     * CDS_TRDS（临时云盘版）
     */
    @KsYunField(name = "DBInstanceType")
    private String DBInstanceType;

    /**
     * 按实例状态过滤
     * ACTIVE（运行中）
     * INVALID（请续费）
     */
    @KsYunField(name = "DBInstanceStatus")
    private String DBInstanceStatus;

    /**
     * 按名称/VIP模糊过滤
     */
    @KsYunField(name = "Keyword")
    private String Keyword;

    /**
     * 排序方式
     * 区分大小写，取值范围：DEFAULT（默认排序方式），GROUP（按复制组排序，会把只读实例排在所属主实例的后面）
     */
    @KsYunField(name = "Order")
    private String Order;

    /**
     * 项目制Id
     * 默认值为所有项目
     */
    @KsYunField(name = "ProjectId")
    private String ProjectId;

    /**
     * 记录开始偏移量
     */
    @KsYunField(name = "Marker")
    private Integer Marker;

    /**
     * 每页结果中包含的最大条数
     * 取值范围：10-10000
     */
    @KsYunField(name = "MaxRecords")
    private Integer MaxRecords;

    /**
     * 实例ids
     * 实例id多选筛选   例如：DBInstanceIdentifierIn.0=xxx&DBInstanceIdentifierIn.1=xxx
     */
    @KsYunField(name = "DBInstanceIdentifierIn")
    private List<String> DBInstanceIdentifierInList;

    /**
     * 按实例名称过滤
     * 示例(DBInstanceNameIn.1=test1，DBInstanceNameIn.2=test2)
     */
    @KsYunField(name = "DBInstanceNameIn")
    private List<String> DBInstanceNameInList;

    /**
     * 按vip过滤
     * 示例(VipIn.1=10.9.2.3，VipIn.2=10.9.2.4)
     */
    @KsYunField(name = "VipIn")
    private List<String> VipInList;

    /**
     * 按eip过滤
     */
    @KsYunField(name = "EIPIn")
    private List<String> EIPInList;

    /**
     * 按照实例过期时间过滤
     */
    @KsYunField(name = "ExpiryDateLessThan")
    private Integer ExpiryDateLessThan;

}