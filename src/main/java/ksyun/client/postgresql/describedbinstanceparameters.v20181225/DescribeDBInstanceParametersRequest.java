package ksyun.client.postgresql.describedbinstanceparameters.v20181225;

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
    /**实例ID*/
    @KsYunField(name="DBInstanceIdentifier")
    private String DBInstanceIdentifier;

}
