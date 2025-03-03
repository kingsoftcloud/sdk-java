package ksyun.client.kec.describededicatedhosts.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

import java.util.List;

/**
 * @Classname DescribeDedicatedHostsRequest
 * @Description 请求参数
 */
@Data
public class DescribeDedicatedHostsRequest {
    /**
     * 专属宿主机id
     */
    @KsYunField(name = "DedicatedHostId")
    private String DedicatedHostId;

    /**
     * 查询条件（宿主机id或者名称）
     */
    @KsYunField(name = "search")
    private String Search;

    /**
     * 项目制id列表
     */
    @KsYunField(name = "ProjectId")
    private List<Integer> ProjectId;


}