package ksyun.client.cdn.getsrcdomainhttpcodedata.v20200630;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname GetSrcDomainHttpCodeDataRequest
 * @Description 请求参数
 */
@Data
public class GetSrcDomainHttpCodeDataRequest {
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
     * 协议类型， 取值为http:http协议数据; https:https协议数据；quic：quic协议数据，单选，缺省为全部协议类型
     */
    @KsYunField(name = "Schema")
    private String Schema;

    /**
     * 统计结果数据展示方式，此处表示是否按照域名维度展开，支持不展开（unexpand）、按照具体域名维度展开（domain），按照具体状态码维度展开（code）、展开（expand）缺省为不展开（unexpand）方式
     */
    @KsYunField(name = "ResultType")
    private String ResultType;


}