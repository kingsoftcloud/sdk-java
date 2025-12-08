package ksyun.client.ebs.resizededicatedblockstorageclusters.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ResizeDedicatedBlockStorageClustersRequest
* @Description 请求参数
*/
@Data
public class ResizeDedicatedBlockStorageClustersRequest{
    /**专属集群id*/
    @KsYunField(name="DbscId")
    private String DbscId;

    /**集群扩容大小*/
    @KsYunField(name="Size")
    private Integer Size;

    /**集群可用区*/
    @KsYunField(name="AvailabilityZone")
    private String AvailabilityZone;

}
