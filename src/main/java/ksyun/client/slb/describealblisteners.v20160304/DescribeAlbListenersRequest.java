package ksyun.client.slb.describealblisteners.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeAlbListenersRequest
* @Description 请求参数
*/
@Data
public class DescribeAlbListenersRequest{
    /**多个应用型监听器的ID*/
    @KsYunField(name="AlbListenerId")
    private List<String> AlbListenerIdList;

    /**筛选Filter*/
    @KsYunField(name="Filter")
    private List<FilterDto> FilterList;

    @Data
    @ToString
    public static class FilterDto {
    }

    /**单次调用可返回的最大条目数量*/
    @KsYunField(name="MaxResults")
    private Integer MaxResults;

    /**获取另一页返回结果的 token.*/
    @KsYunField(name="NextToken")
    private String NextToken;


}