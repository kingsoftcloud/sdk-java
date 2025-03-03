package ksyun.client.klog.getlogs.v20200731;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname GetLogsRequest
 * @Description 请求参数
 */
@Data
public class GetLogsRequest {
    /**
     * 工程名称
     */
    @KsYunField(name = "ProjectName")
    private String ProjectName;

    /**
     * 日志池名称，多个日志池按逗号（,）分隔
     */
    @KsYunField(name = "LogPoolName")
    private String LogPoolName;

    /**
     * 查询开始时间，unix时间戳，单位毫秒
     */
    @KsYunField(name = "From")
    private Integer From;

    /**
     * 查询结束时间，unix时间戳，单位毫秒
     */
    @KsYunField(name = "To")
    private Integer To;

    /**
     * 查询分析语法。关于查询分析的详细语法，详见[查询语法](https://docs.ksyun.com/documents/37865)，不填的情况下 返回原始日志
     */
    @KsYunField(name = "Query")
    private String Query;

    /**
     * 日志池id
     */
    @KsYunField(name = "LogPoolId")
    private String LogPoolId;

    /**
     * 如果需要查询结果展示日志趋势，则需将该字段设为true。默认不会展示日志趋势。
     */
    @KsYunField(name = "HitsOpen")
    private Boolean HitsOpen;

    /**
     * 间隔。单位支持秒(s)、分(m)、时(h)、天(d)、周(w)。示例：10s、2m、4h、1d、1w。
     */
    @KsYunField(name = "Interval")
    private String Interval;

    /**
     * 用于进行结果排序的字段，List<Map<String,String>>，key是需要排序的字段value是排序方式，值为asc或者descValuesKey
     */
    @KsYunField(name = "SortBy")
    private String SortBy;

    /**
     * 表示页数
     */
    @KsYunField(name = "Offset")
    private Integer Offset;

    /**
     * 分页大小
     */
    @KsYunField(name = "Size")
    private Integer Size;


}