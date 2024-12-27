package ksyun.client.kes.listclusters.v20201215;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ListClustersRequest
* @Description 请求参数
*/
@Data
public class ListClustersRequest{
    /**分页信息：
limit:指定返回的记录数
offset：指定查询起始位置
示例值：
limit=2&offset=0*/
    @KsYunField(name="Marker")
    private String Marker;


}