package ksyun.client.cdn.gettopipdata.v20200630;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname GetTopIpDataRequest
 * @Description 请求参数
 */
@Data
public class GetTopIpDataRequest {
    /**
     * 获取数据起始时间点，日期格式按ISO8601表示法，北京时间，格式为：YYYY-MM-DDThh:mm+0800，例如： 2016-08-01T21:14+0800
     */
    @KsYunField(name = "StartTime")
    private String StartTime;

    /**
     * 结束时间需大于起始时间；获取日期格式按照ISO8601表示法，北京时间，格式为：YYYY-MM-DDThh:mm+0800，例如： 2016-08-01T21:14+0800
     */
    @KsYunField(name = "EndTime")
    private String EndTime;

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
     * 独立请求的IP数，取值为1-200，最大200，默认100
     */
    @KsYunField(name = "LimitN")
    private String LimitN;

    /**
     * 排序方式，取值为flow：流量，pv：请求数，缺省为pv
     */
    @KsYunField(name = "SortBy")
    private String SortBy;


}