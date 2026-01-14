package ksyun.client.cdn.getpvdata.v3;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname GetPvDataRequest
* @Description 请求参数
*/
@Data
public class GetPvDataRequest{
    /**获取数据起始时间点，日期格式按ISO8601表示法，北京时间，格式为：YYYY-MM-DDThh:mm+0800，例如： 2016-08-01T21:14+0800*/
    @KsYunField(name="StartTime")
    private String StartTime;

    /**结束时间需大于起始时间；获取日期格式按照ISO8601表示法，北京时间，格式为：YYYY-MM-DDThh:mm+0800，例如： 2016-08-01T21:14+0800*/
    @KsYunField(name="EndTime")
    private String EndTime;

    /**产品类型，只允许输入一种类型，取值为file：大文件下载，video：音视频点播，page：图片小文件，live：流媒体直播*/
    @KsYunField(name="CdnType")
    private String CdnType;

    /**域名ID，缺省为当前产品类型下的全部域名，可输入需要查询的域名ID，支持批量域名查询，多个域名ID用逗号（半角）分隔*/
    @KsYunField(name="DomainIds")
    private String DomainIds;

    /**区域名称，枚举类型表见[使用须知](https://docs.ksyun.com/documents/196#36)，支持多区域查询，多个区域用逗号（半角）分隔，缺省为 CN缺省为 CN*/
    @KsYunField(name="Regions")
    private String Regions;

    /**取值为0：多域名多区域数据做合并；1：每个域名每个区域的数据分别返回*/
    @KsYunField(name="ResultType")
    private Long ResultType;

    /**统计粒度，取值为 5（默认）：5分钟粒度；10：10分钟粒度；20：20分钟粒度；60：1小时粒度；240：4小时粒度；480：8小时粒度；1440：1天粒度；以上粒度的请求数均取该粒度时间段的请求数总和*/
    @KsYunField(name="Granularity")
    private Long Granularity;

    /**数据类型， 取值为edge:服务数据; origin:回源数据; 支持多类型选择，多个类型用逗号（半角）分隔，缺省为edge*/
    @KsYunField(name="DataType")
    private String DataType;

    /**协议类型， 取值为http:http协议数据; https:https协议数据（直播不支持区分协议查询），默认返回全部协议数据*/
    @KsYunField(name="ProtocolType")
    private String ProtocolType;

}
