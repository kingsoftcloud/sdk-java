package ksyun.client.kec.describededicatedcluster.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeDedicatedClusterRequest
* @Description 请求参数
*/
@Data
public class DescribeDedicatedClusterRequest{
    /**专属集群id*/
    @KsYunField(name="DedicatedClusterId")
    private List<String> DedicatedClusterIdList;

}