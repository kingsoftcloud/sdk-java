package ksyun.client.sqlserver.describedbinstances.v20190425;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeDBInstancesRequest
* @Description 请求参数
*/
@Data
public class DescribeDBInstancesRequest{
    /**实例id 传入实例ID，获取的是该实例的详情，否则则获取list*/
    @KsYunField(name="DBInstanceIdentifier")
    private String DBInstanceIdentifier;

    /**查询关键字

```json
支持：名称，ID，IP
```*/
    @KsYunField(name="Keyword")
    private String Keyword;

    /**实例类型


```json
高可用版：HRDS_SS
高可用云盘版：SS_HRDS_E
临时版：TRDS_SS
临时云盘版：SS_TRDS_E
```*/
    @KsYunField(name="DBInstanceType")
    private String DBInstanceType;

    /**实例状态-运行中/请续费

```json
运行中：active
请续费：invalid
注意：此类型为订单计费的情况
注意：控制台执行：状态-运行中，状态-请续费
```*/
    @KsYunField(name="DBInstanceStatus")
    private String DBInstanceStatus;

    /**实例状态-即将过期

```json
按照实例过期时间过滤，取值范围>0

注意：此参数一般用来概览实例计费情况
```*/
    @KsYunField(name="ExpiryDateLessThan")
    private String ExpiryDateLessThan;

    /**记录开始偏移量*/
    @KsYunField(name="Marker")
    private Integer Marker;

    /**每页结果中包含的最大条数*/
    @KsYunField(name="MaxRecords")
    private Integer MaxRecords;

}
