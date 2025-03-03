package ksyun.client.clickhouse.listrecycledinstance.v20210101;

import common.annotation.KsYunField;
import lombok.Data;

import java.util.List;

/**
 * @Classname ListRecycledInstanceRequest
 * @Description 请求参数
 */
@Data
public class ListRecycledInstanceRequest {
    /**
     * 商品类型。可选：ClickHouse_Single（单副本）；ClickHouse（高可用）。
     */
    @KsYunField(name = "ProductType")
    private String ProductType;

    /**
     * 项目ID列表，不填表示全部项目。
     */
    @KsYunField(name = "ProjectIds")
    private List<String> ProjectIdsList;

    /**
     * 模糊查询字段。支持：实例ID、实例名称、VIP。
     */
    @KsYunField(name = "FuzzySearch")
    private String FuzzySearch;

    /**
     * 排序字段。
     */
    @KsYunField(name = "OrderBy")
    private List<String> OrderByList;

    /**
     * 第几页，从0开始。默认：0。
     */
    @KsYunField(name = "Offset")
    private Integer Offset;

    /**
     * 每页最大记录数。	默认：10。
     */
    @KsYunField(name = "Limit")
    private Integer Limit;

}