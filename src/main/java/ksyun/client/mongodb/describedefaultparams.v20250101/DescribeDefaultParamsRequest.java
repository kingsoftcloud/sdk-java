package ksyun.client.mongodb.describedefaultparams.v20250101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeDefaultParamsRequest
* @Description 请求参数
*/
@Data
public class DescribeDefaultParamsRequest{
    /**实例版本*/
    @KsYunField(name="DbVersion")
    private Double DbVersion;

}
