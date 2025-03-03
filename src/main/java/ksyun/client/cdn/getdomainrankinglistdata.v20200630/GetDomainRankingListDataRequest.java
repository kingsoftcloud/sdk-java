package ksyun.client.cdn.getdomainrankinglistdata.v20200630;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname GetDomainRankingListDataRequest
 * @Description 请求参数
 */
@Data
public class GetDomainRankingListDataRequest {
    /**
     * 获取数据起始时间点，日期格式按ISO8601表示法，北京时间，格式为：YYYY-MM-DDThh:mm+0800，例如： 2016-08-01T21:15+0800
     */
    @KsYunField(name = "StartTime")
    private String StartTime;

    /**
     * 结束时间需大于起始时间；获取日期格式按照ISO8601表示法，北京时间，格式为：YYYY-MM-DDThh:mm+0800，例如： 2016-08-01T21:15+0800
     */
    @KsYunField(name = "EndTime")
    private String EndTime;

    /**
     * 产品类型，取值为all：全部类型，取值为file：大文件下载，video：音视频点播，page：图片小文件
     */
    @KsYunField(name = "CdnType")
    private String CdnType;

    /**
     * 排序方式，取值为bandwidth：带宽峰值，flow：流量，pv：请求数，缺省为flow
     */
    @KsYunField(name = "SortBy")
    private String SortBy;


}