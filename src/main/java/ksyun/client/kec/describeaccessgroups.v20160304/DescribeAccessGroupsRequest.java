package ksyun.client.kec.describeaccessgroups.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeAccessGroupsRequest
* @Description 请求参数
*/
@Data
public class DescribeAccessGroupsRequest{
    /**权限组ID*/
    @KsYunField(name="AccessGroupId")
    private String AccessGroupId;

    /**每个分页包含的权限组个数
取值范围：1~200
默认值：10*/
    @KsYunField(name="PageSize")
    private Integer PageSize;

    /**列表的分页页码
起始值（默认值）：1*/
    @KsYunField(name="PageNumber")
    private Integer PageNumber;

}
