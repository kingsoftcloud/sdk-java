package ksyun.client.kscc.describedeptquotalist.v1;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeDeptQuotaListRequest
* @Description 请求参数
*/
@Data
public class DescribeDeptQuotaListRequest{
    /**部门ID或部门名称关键字*/
    @KsYunField(name="Keyword")
    private String Keyword;

    /**页码，默认1*/
    @KsYunField(name="PageNum")
    private Integer PageNum;

    /**每页条数，默认10*/
    @KsYunField(name="PageSize")
    private Integer PageSize;

    /**排序字段，如UsageAmount、UsagePercent*/
    @KsYunField(name="SortKey")
    private String SortKey;

    /**排序方向：asc或desc*/
    @KsYunField(name="SortType")
    private String SortType;

}
