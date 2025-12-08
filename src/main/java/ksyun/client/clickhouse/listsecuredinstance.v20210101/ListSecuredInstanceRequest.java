package ksyun.client.clickhouse.listsecuredinstance.v20210101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ListSecuredInstanceRequest
* @Description 请求参数
*/
@Data
public class ListSecuredInstanceRequest{
    /**安全组ID。*/
    @KsYunField(name="SecurityGroupId")
    private String SecurityGroupId;

    /**项目组ID列表。不填表示全部项目。*/
    @KsYunField(name="ProjectIds",type=2)
    private List<String> ProjectIdsList;

    /**模糊搜索。支持：实例ID、实例名称、项目名称、VIP。*/
    @KsYunField(name="FuzzySearch")
    private String FuzzySearch;

    /**第几页，从0开始。*/
    @KsYunField(name="Offset")
    private Integer Offset;

    /**每页最大记录数*/
    @KsYunField(name="Limit")
    private Integer Limit;

    /**排序字段。*/
    @KsYunField(name="OrderBy",type=2)
    private List<String> OrderByList;

}
