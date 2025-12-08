package ksyun.client.cdn.getreqhitratedata.v20200630;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname GetReqHitRateDataRequest
* @Description 请求参数
*/
@Data
public class GetReqHitRateDataRequest{
    /**获取数据起始时间点，日期格式按ISO8601表示法，北京时间，格式为：YYYY-MM-DDThh:mm+0800，例如： 2016-08-01T21:10+0800*/
    @KsYunField(name="StartTime")
    private String StartTime;

    /**结束时间需大于起始时间；获取日期格式按照ISO8601表示法，北京时间，格式为：YYYY-MM-DDThh:mm+0800，例如： 2016-08-01T21:15+0800*/
    @KsYunField(name="EndTime")
    private String EndTime;

    /**统计粒度，取值为 1：1分钟粒度；取值为 5：5分钟粒度；60：1小时粒度；1440：1天粒度；5分钟及以上粒度的值取该粒度时间段内的5分钟粒度的请求数值累加和的命中率，缺省为5分钟粒度。1分钟粒度查询范围最大跨度为24小时，5分钟粒度查询范围最大跨度为31天，其余粒度查询范围最大跨度为90天*/
    @KsYunField(name="Interval")
    private String Interval;

    /**产品类型，只允许输入一种类型，取值为file：大文件下载，video：音视频点播，page：图片小文件，缺省为全部类型，当CdnType和Domains两个条件同时存在时，进行强校验。*/
    @KsYunField(name="CdnType")
    private String CdnType;

    /**当前账户下选择时间段内正在运行状态的加速域名，可输入需要查询的域名，支持批量域名查询，多个域名用逗号（半角）分隔，缺省为全部域名，当CdnType和Domains两个条件同时存在时，进行强校验。*/
    @KsYunField(name="Domains")
    private String Domains;

    /**统计结果数据展示方式，支持不展开（unexpand）、按域名（domain）维度展开共2种展开方式，缺省为 不展开（unexpand）*/
    @KsYunField(name="ResultType")
    private String ResultType;

}
