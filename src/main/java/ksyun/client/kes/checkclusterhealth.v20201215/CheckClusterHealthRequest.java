package ksyun.client.kes.checkclusterhealth.v20201215;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CheckClusterHealthRequest
* @Description 请求参数
*/
@Data
public class CheckClusterHealthRequest{
    /**集群ID*/
    @KsYunField(name="cluster_id")
    private String Cluster_id;

    /**检查范围:
目前仅支持对集群所有节点组进行诊断，请填写：all
*/
    @KsYunField(name="check_list",type=2)
    private List<String> Check_listList;


}