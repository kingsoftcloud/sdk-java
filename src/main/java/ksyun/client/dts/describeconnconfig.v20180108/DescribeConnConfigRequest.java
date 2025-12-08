package ksyun.client.dts.describeconnconfig.v20180108;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeConnConfigRequest
* @Description 请求参数
*/
@Data
public class DescribeConnConfigRequest{
    /**任务配置ID*/
    @KsYunField(name="ConnConfigId")
    private String ConnConfigId;

}
