package ksyun.client.clickhouse.describedbinstanceparameters.v20210101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeDBInstanceParametersRequest
* @Description 请求参数
*/
@Data
public class DescribeDBInstanceParametersRequest{
    /**实例ID。*/
    @KsYunField(name="InstanceId")
    private String InstanceId;

    /**参数类型。可选：Users，Config。*/
    @KsYunField(name="ConfigType")
    private String ConfigType;


}