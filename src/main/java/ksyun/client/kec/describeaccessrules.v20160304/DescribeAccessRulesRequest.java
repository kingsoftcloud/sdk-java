package ksyun.client.kec.describeaccessrules.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeAccessRulesRequest
* @Description 请求参数
*/
@Data
public class DescribeAccessRulesRequest{
    /**权限组ID*/
    @KsYunField(name="AccessGroupId")
    private String AccessGroupId;

    /**权限规则ID*/
    @KsYunField(name="AccessRuleId")
    private String AccessRuleId;

    /**分页查询时，每个分页包含的文件系统个数
取值范围：1~100
默认值：10*/
    @KsYunField(name="PageSize")
    private Integer PageSize;

    /**文件系统列表的分页页码
起始值（默认值）：1*/
    @KsYunField(name="PageNumber")
    private Integer PageNumber;

}
