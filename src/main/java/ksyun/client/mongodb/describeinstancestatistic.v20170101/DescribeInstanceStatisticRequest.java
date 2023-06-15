package ksyun.client.mongodb.describeinstancestatistic.v20170101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeInstanceStatisticRequest
* @Description 请求参数
*/
@Data
public class DescribeInstanceStatisticRequest{
    /**Action*/
    @KsYunField(name="Action")
    private String Action;


}