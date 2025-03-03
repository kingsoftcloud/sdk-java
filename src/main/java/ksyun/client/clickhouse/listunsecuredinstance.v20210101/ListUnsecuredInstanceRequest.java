package ksyun.client.clickhouse.listunsecuredinstance.v20210101;

import common.annotation.KsYunField;
import lombok.Data;

import java.util.List;

/**
 * @Classname ListUnsecuredInstanceRequest
 * @Description 请求参数
 */
@Data
public class ListUnsecuredInstanceRequest {
    /**
     * 模糊搜索。
     */
    @KsYunField(name = "FuzzySearch")
    private String FuzzySearch;

    /**
     * 第几页，从0开始。
     */
    @KsYunField(name = "Offset")
    private Integer Offset;

    /**
     * 每页最大记录数。
     */
    @KsYunField(name = "Limit")
    private Integer Limit;

    /**
     * 排序字段。
     */
    @KsYunField(name = "OrderBy")
    private List<String> OrderByList;

}