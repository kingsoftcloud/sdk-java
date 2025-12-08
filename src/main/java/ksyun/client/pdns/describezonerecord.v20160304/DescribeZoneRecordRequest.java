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
    @KsYunField(name="RecordId",type=2)
    private List<String> RecordIdList;

    /**解析记录的主机记录筛选*/
    @KsYunField(name="Filter",type=2)
    private List<String> FilterList;

}
