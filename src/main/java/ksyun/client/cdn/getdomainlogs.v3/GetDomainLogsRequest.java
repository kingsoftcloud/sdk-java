package ksyun.client.cdn.getdomainlogs.v3;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname GetDomainLogsRequest
* @Description 请求参数
*/
@Data
public class GetDomainLogsRequest{
    /**域名ID，只支持单个域名输入*/
    @KsYunField(name="DomainId")
    private String DomainId;

    /**查询开始时间，格式yyyy-MM-dd，开始时间和结束时间均不指定时，默认是当天*/
    @KsYunField(name="StartTime")
    private String StartTime;

    /**查询结束时间，格式yyyy-MM-dd，开始时间和结束时间均不指定时，默认是当天，若已指定开始时间StartTime，则EndTime为必填项*/
    @KsYunField(name="EndTime")
    private String EndTime;

    /**分页大小，取值为1-500，最大500，默认50*/
    @KsYunField(name="PageSize")
    private Long PageSize;

    /**取得第几页，取值为：1-10000，最大10000，默认1*/
    @KsYunField(name="PageNumber")
    private Long PageNumber;

}
