package ksyun.client.cdn.getserverdata.v20200630;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname GetServerDataRequest
 * @Description 请求参数
 */
@Data
public class GetServerDataRequest {
    /**
     * 获取数据起始时间点，日期格式按ISO8601表示法，北京时间，格式为：YYYY-MM-DDThh:mm+0800，例如： 2016-08-01T21:10+0800
     */
    @KsYunField(name = "StartTime")
    private String StartTime;

    /**
     * 结束时间需大于起始时间；获取日期格式按照ISO8601表示法，北京时间，格式为：YYYY-MM-DDThh:mm+0800，例如： 2016-08-01T21:15+0800
     */
    @KsYunField(name = "EndTime")
    private String EndTime;

    /**
     * 指定查询指标，支持的类型有：**flow**：流量，单位为 byte；**bandwidth**：带宽，单位为 bps；**request**：请求数，单位为次；**qps**：平均每秒请求次数，单位：次，支持批量数据查询，多个类型用逗号（半角）分隔，默认为全部类型
     */
    @KsYunField(name = "Metric")
    private String Metric;

    /**
     * 数据类型，取值为edge：服务数据； origin：回源数据；一次查询只允许查询一个类型，缺省为 edge
     */
    @KsYunField(name = "DataType")
    private String DataType;

    /**
     * 统计粒度，取值为5：5分钟粒度；60：1小时粒度；1440：1天粒度；</br>5分钟及以上粒度的带宽值均取该粒度时间段内的5分钟粒度的峰值点，缺省为5分钟粒度；</br>1分钟粒度查询范围最大跨度为24小时，5分钟粒度查询范围最大跨度为31天其余粒度查询范围最大跨度为90天
     */
    @KsYunField(name = "Interval")
    private String Interval;

    /**
     * 产品类型，只允许输入一种类型，取值为file：大文件下载，video：音视频点播，page：图片小文件
     */
    @KsYunField(name = "CdnType")
    private String CdnType;

    /**
     * 当前账户下选择时间段内正在运行状态的加速域名，可输入需要查询的域名，支持批量域名查询，多个域名用逗号（半角）分隔，缺省为全部域名
     */
    @KsYunField(name = "Domains")
    private String Domains;

    /**
     * 区域简称，具体见【[使用须知](https://docs.ksyun.com/documents/196#36)】，支持多区域查询，多个区域用逗号（半角）分隔，缺省为全部区域
     */
    @KsYunField(name = "Regions")
    private String Regions;

    /**
     * 协议类型， 取值为http:http协议数据; https:https协议数据；quic：quic协议数据，单选，缺省为全部协议类型
     */
    @KsYunField(name = "Schema")
    private String Schema;

    /**
     * 统计结果数据展示方式，支持不展开和展开，缺省为 不展开（unexpand）展开支持全部展开（expand）和按照某个查询维度展开，具体包含：区域（region）（回源不支持按照区域展开）、域名（domain）、协议类型（schema）
     */
    @KsYunField(name = "ResultType")
    private String ResultType;


}