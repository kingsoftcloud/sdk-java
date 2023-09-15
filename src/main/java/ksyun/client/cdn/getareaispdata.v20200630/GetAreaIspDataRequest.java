package ksyun.client.cdn.getareaispdata.v20200630;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname GetAreaIspDataRequest
* @Description 请求参数
*/
@Data
public class GetAreaIspDataRequest{
    /**获取数据起始时间点，日期格式按ISO8601表示法，北京时间，格式为：YYYY-MM-DDThh:mm+0800，例如： 2016-08-01T21:14+0800*/
    @KsYunField(name="StartTime")
    private String StartTime;

    /**结束时间需大于起始时间；获取日期格式按照ISO8601表示法，北京时间，格式为：YYYY-MM-DDThh:mm+0800，例如： 2016-08-01T21:14+0800*/
    @KsYunField(name="EndTime")
    private String EndTime;

    /**产品类型，取值为file：大文件下载，video：音视频点播，page：图片小文件；all：全部类型*/
    @KsYunField(name="CdnType")
    private String CdnType;

    /**域名，缺省为当前产品类型下的全部域名，可输入需要查询的域名，支持批量域名查询，多个域名用逗号（半角）分隔*/
    @KsYunField(name="Domains")
    private String Domains;


}