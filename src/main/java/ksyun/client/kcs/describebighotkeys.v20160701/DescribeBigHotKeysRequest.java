package ksyun.client.kcs.describebighotkeys.v20160701;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname DescribeBigHotKeysRequest
 * @Description 请求参数
 */
@Data
public class DescribeBigHotKeysRequest {
    /**
     * 实例Id。
     */
    @KsYunField(name = "CacheId")
    private String CacheId;

    /**
     * 根据指定节点查询。
     */
    @KsYunField(name = "NodeId")
    private String NodeId;

    /**
     * 查询类型，可选值：RealTime（实时）或History（历史）。默认：RealTime。
     */
    @KsYunField(name = "QueryType")
    private String QueryType;

    /**
     * 查询的Key类型。可选值：1，2，3；默认为1。
     * 1:热key; 2：大key（子元素数量）；3：大key（内存占用）
     */
    @KsYunField(name = "KeyType")
    private Integer KeyType;

    /**
     * 指定查询某个key的全部数据。仅QueryType为History时生效。
     */
    @KsYunField(name = "KeyName")
    private String KeyName;

    /**
     * 查询时间范围的开始时间。默认取当前时间的前30分钟。格式："yyyy-MM-dd HH:mm:ss。仅QueryType为History时生效。
     */
    @KsYunField(name = "StartQueryTime")
    private String StartQueryTime;

    /**
     * 查询时间范围的结束时间。默认取当前时间。格式："yyyy-MM-dd HH:mm:ss。仅QueryType为History时生效。
     */
    @KsYunField(name = "EndQueryTime")
    private String EndQueryTime;

    /**
     * 查询结果每页返回记录数。默认10，范围1-100。
     */
    @KsYunField(name = "PageSize")
    private Integer PageSize;

    /**
     * 页数。默认1. 最小为1
     */
    @KsYunField(name = "PageNum")
    private Integer PageNum;

}