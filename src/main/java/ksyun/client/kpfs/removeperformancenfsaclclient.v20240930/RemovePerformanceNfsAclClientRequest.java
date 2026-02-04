package ksyun.client.kpfs.removeperformancenfsaclclient.v20240930;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname RemovePerformanceNfsAclClientRequest
* @Description 请求参数
*/
@Data
public class RemovePerformanceNfsAclClientRequest{
    /**访问授权ID。*/
    @KsYunField(name="NfsAclId")
    private String NfsAclId;

    /**授权IP列表，为计算节点的私网IP，单次最多删除100个。支持IP（示例：10.0.0.1,10.0.0.2）和网段（示例：10.0.0.1/24）*/
    @KsYunField(name="Ips",type=2)
    private List<String> IpsList;

}
