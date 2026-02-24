package ksyun.client.klog.getlogs.v20200731;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname GetLogsRequest
* @Description 请求参数
*/
@Data
public class GetLogsRequest{
    /**工程名称*/
    @KsYunField(name="ProjectName")
    private String ProjectName;

    /**日志池名称*/
    @KsYunField(name="LogPoolName")
    private String LogPoolName;

    /**日志池ID*/
    @KsYunField(name="LogPoolId")
    private String LogPoolId;

    /**查询开始时间，unix时间戳*/
    @KsYunField(name="From")
    private Long From;

    /**查询结束时间，unix时间戳*/
    @KsYunField(name="To")
    private Long To;

    /**查询分析语法。关于查询分析的详细语法，详见查询语法，不填的情况下 返回原始日志*/
    @KsYunField(name="Query")
    private String Query;

    /**偏移页数，从0开始
仅支持运算符语法*/
    @KsYunField(name="Offset")
    private Integer Offset;

    /**查询结果条数
仅支持运算符语法*/
    @KsYunField(name="Size")
    private Integer Size;

    /**是否按时间间隔统计数据行数，当该值为true时，interval参数为必填*/
    @KsYunField(name="HitsOpen")
    private Boolean HitsOpen;

    /**数据统计时间间隔
示例：10s、5m、1h*/
    @KsYunField(name="Interval")
    private String Interval;

}
