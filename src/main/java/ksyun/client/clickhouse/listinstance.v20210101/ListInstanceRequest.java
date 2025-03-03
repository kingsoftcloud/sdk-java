package ksyun.client.clickhouse.listinstance.v20210101;

import common.annotation.KsYunField;
import lombok.Data;

import java.util.List;

/**
 * @Classname ListInstanceRequest
 * @Description 请求参数
 */
@Data
public class ListInstanceRequest {
    /**
     * 商品类型。可选：单副本（ClickHouse_Single）
     * ；高可用（ClickHouse）。
     */
    @KsYunField(name = "ProductType")
    private String ProductType;

    /**
     * 根据TagId进行过滤。
     */
    @KsYunField(name = "TagId")
    private String TagId;

    /**
     * 根据项目ID进行过滤，不填则表示全部项目。
     */
    @KsYunField(name = "ProjectIds")
    private List<String> ProjectIdsList;

    /**
     * 模糊搜索。支持：实例ID、实例名称,VIP。
     */
    @KsYunField(name = "FuzzySearch")
    private String FuzzySearch;

    /**
     * 排序字段列表。
     */
    @KsYunField(name = "OrderBy")
    private List<String> OrderByList;

    /**
     * 第几页，从0开始。
     */
    @KsYunField(name = "Offset")
    private Integer Offset;

    /**
     * 每页最大记录数。默认为10。
     */
    @KsYunField(name = "Limit")
    private Integer Limit;


}