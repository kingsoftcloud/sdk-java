package ksyun.client.cdn.getbillingmode.v3;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname GetBillingModeRequest
* @Description 请求参数
*/
@Data
public class GetBillingModeRequest{
    /**获取数据起始时间点，日期格式按ISO8601表示法，北京时间，格式为：YYYY-MM-DDThh:mm+0800，例如： 2016-08-01T21:14+0800*/
    @KsYunField(name="StartTime")
    private String StartTime;

    /**结束时间需大于起始时间；获取日期格式按照ISO8601表示法，北京时间，格式为：YYYY-MM-DDThh:mm+0800，例如： 2016-08-01T21:14+0800*/
    @KsYunField(name="EndTime")
    private String EndTime;

    /**产品类型，只允许输入一种类型，取值为file：大文件下载，video：音视频点播，page：小文件下载，live：流媒体直播，all：所有业务类型汇总*/
    @KsYunField(name="CdnType")
    private String CdnType;

    /**域名ID，缺省为当前产品类型下的全部域名，可输入需要查询的域名ID，支持批量域名查询，多个域名ID用逗号（半角）分隔*/
    @KsYunField(name="DomainIds")
    private String DomainIds;

    /**区域名称，枚举类型表见[使用须知](https://docs.ksyun.com/documents/196#36)，支持多区域查询，多个区域用逗号（半角）分隔，缺省为 CN缺省为 CN*/
    @KsYunField(name="Regions")
    private String Regions;

    /**计费方式， 取值为 peakbw:峰值计费;peak95bw:95峰值计费;averagebw：日峰值平均值计费；monthflow：流量按月，只允许输入一种计费方式，缺省为 peakbw ；*/
    @KsYunField(name="BillingMode")
    private String BillingMode;

}
