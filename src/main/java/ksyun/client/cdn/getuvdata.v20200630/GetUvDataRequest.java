package ksyun.client.cdn.getuvdata.v20200630;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname GetUvDataRequest
* @Description 请求参数
*/
@Data
public class GetUvDataRequest{
    /**获取数据起始时间点，日期格式按ISO8601表示法，北京时间，格式为：YYYY-MM-DDThh:mm+0800，例如： 2016-08-01T21:14+0800*/
    @KsYunField(name="StartTime")
    private String StartTime;

    /**结束时间需大于起始时间；获取日期格式按照ISO8601表示法，北京时间，格式为：YYYY-MM-DDThh:mm+0800，例如： 2016-08-01T21:14+0800*/
    @KsYunField(name="EndTime")
    private String EndTime;

    /**产品类型，只允许输入一种类型，取值为file：大文件下载，video：音视频点播，page：图片小文件*/
    @KsYunField(name="CdnType")
    private String CdnType;

    /**域名，缺省为当前产品类型下的全部域名，可输入需要查询的域名，支持批量域名查询，多个域名用逗号（半角）分隔*/
    @KsYunField(name="Domains")
    private String Domains;

    /**统计粒度，取值为 5（默认）：5分钟粒度；1440：1天粒度。<br>注：当选择粒度是 1440：1天粒度 时，  ResultType 必须是 expand ， StartTime 和 EndTime  都必须是 T00:00+0800 结尾，比如：StartTime 是2022-08-01T00:00+0800、EndTime  是2022-08-06T00:00+0800，表示查询2022-08-01 到 2022-08-05 的天粒度数据；可以是多天查询，最大支持31天的跨度查询。天粒度上线较晚，是在2022-07-05迭代上线，故最早可查询 2022-07-05的天粒度数据。*/
    @KsYunField(name="Interval")
    private String Interval;

    /**统计结果数据展示方式，支持不展开（unexpand）和按照域名维度展开（expand），缺省为 不展开*/
    @KsYunField(name="ResultType")
    private String ResultType;

}
