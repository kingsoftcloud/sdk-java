package ksyun.client.mongodb.describeregions.v20170101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeRegionsRequest
* @Description 请求参数
*/
@Data
public class DescribeRegionsRequest{
    /**Action*/
    @KsYunField(name="Action")
    private String Action;


}