package ksyun.client.ebs.describededicatedblockstorageclusters.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeDedicatedBlockStorageClustersRequest
* @Description 请求参数
*/
@Data
public class DescribeDedicatedBlockStorageClustersRequest{
    /***/
    @KsYunField(name="AvailabilityZone")
    private String AvailabilityZone;

    /***/
    @KsYunField(name="DbscName")
    private String DbscName;

    /***/
    @KsYunField(name="Marker")
    private Integer Marker;

    /***/
    @KsYunField(name="MaxResults")
    private Integer MaxResults;

    /***/
    @KsYunField(name="DbscCreateDate")
    private String DbscCreateDate;

    /***/
    @KsYunField(name = "DbscId", type = 1)
    private List<String> DbscIdList;

}
