package ksyun.client.pdns.describepdnsfdzone.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribePdnsFdZoneRequest
* @Description 请求参数
*/
@Data
public class DescribePdnsFdZoneRequest{
    /**转发Zone的ID*/
    @KsYunField(name="FdZoneId",type=1)
    private List<String> FdZoneIdList;

    /**筛选Filter*/
    @KsYunField(name="Filter",type=1)
    private List<FilterDto> FilterList;

    @Data
    @ToString
    public static class FilterDto {
    }

}
