package ksyun.client.pdns.describezonerecord.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeZoneRecordRequest
* @Description 请求参数
*/
@Data
public class DescribeZoneRecordRequest{
    /**Zone的ID*/
    @KsYunField(name="ZoneId")
    private String ZoneId;

    /**解析记录的ID*/
    @KsYunField(name="RecordId",type=1)
    private List<String> RecordIdList;

    /**解析记录的主机记录筛选*/
    @KsYunField(name="Filter",type=1)
    private List<String> FilterList;

    /**单次调用可返回的最大条目数量*/
    @KsYunField(name="MaxResults")
    private Integer MaxResults;

    /**获取另一页返回结果的 token*/
    @KsYunField(name="NextToken")
    private String NextToken;

}
