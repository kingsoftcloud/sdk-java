package ksyun.client.cdn.getdomainhttpcodedata.v20200630;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname GetDomainHttpCodeDataRequest
 * @Description 请求参数
 */
@Data
public class GetDomainHttpCodeDataRequest {
    /**
     * 获取数据起始时间点，日期格式按ISO8601表示MM-DDThh:mm+0800，例如： 2016-08-01T21:10+0800
     */
    @KsYunField(name = "StartTime")
    private String StartTime;

    /**
     * 结束时间需大于起始时间；获取日期格式按照ISO8601表示法，北京时间，格式为2016-08-01T21:15+0800
     */
    @KsYunField(name = "EndTime")
    private String EndTime;

    /**
     * 产品类型，只允许输入一种类型，取值为file：大文件下载，video：音视频点播，page：图片小文
     */
    @KsYunField(name = "CdnType")
    private String CdnType;

    /**
     * 当前账户下选择时间段内正在运行状态的加速域名，可输入需要查询的域名，支持
     */
    @KsYunField(name = "Domains")
    private String Domains;

    /**
     * 网民分布区域简称，具体见【使用须知】，支持多区域查询，多个区域用逗号（半角）分隔，缺省为全部区
     */
    @KsYunField(name = "Areas")
    private String Areas;

    /**
     * 省份区域名称，【使用须知】；支持省份批量查询，多个省当Areas选项有且仅有中国大陆选项时，此类型生效）
     */
    @KsYunField(name = "Provinces")
    private String Provinces;

    /**
     * 运营商名称，枚举类型表见【使用须知】；只���许输入一种类型，缺省为全部运营商，（当生效）
     */
    @KsYunField(name = "Isps")
    private String Isps;

    /**
     * IP类型，取值为ipv4:ipv4类型数据;ipv6:ipv6类型数据；单选，缺省为全部类型
     */
    @KsYunField(name = "IpType")
    private String IpType;

    /**
     * 协议类型， 取值为http:http协议数据; https:https协议数据；quic：quic协议数据，缺省为全部协议类型
     */
    @KsYunField(name = "Schema")
    private String Schema;

    /**
     * 统计结果数据展示方式，此处表示是否按照域名维度展开，（domain）、按照具体状态码维度展开（code）、展开（expand）缺省为��展开（unexpand）方式
     */
    @KsYunField(name = "ResultType")
    private String ResultType;

}