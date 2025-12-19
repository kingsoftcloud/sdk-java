package ksyun.client.cdn.getvaliddomainlist.v20250503;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname GetValidDomainListRequest
* @Description 请求参数
*/
@Data
public class GetValidDomainListRequest{
    /**获取数据起始时间点，日期格式按ISO8601表示法，北京时间，格式为：YYYY-MM-DDThh:mm+0800，例如： 2016-08-01T21:14+0800*/
    @KsYunField(name="StartTime")
    private String StartTime;

    /**结束时间需大于起始时间；获取日期格式按照ISO8601表示法，北京时间，格式为：YYYY-MM-DDThh:mm+0800，例如： 2016-08-01T21:14+0800*/
    @KsYunField(name="EndTime")
    private String EndTime;

    /**产品类型，取值为file：大文件下载，video：音视频点播，page：小文件下载，live：流媒体直播；all：全部类型，即用户维度*/
    @KsYunField(name="CdnType")
    private String CdnType;

}
