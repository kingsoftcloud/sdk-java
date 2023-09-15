package ksyun.client.krds.describedbinstancepackages.v20160701;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeDBInstancePackagesRequest
* @Description 请求参数
*/
@Data
public class DescribeDBInstancePackagesRequest{
    /**机房code。可从“查看机房列表
（DescribeDBInstanceRegions）”获得*/
    @KsYunField(name="RegionCode")
    private String RegionCode;


}