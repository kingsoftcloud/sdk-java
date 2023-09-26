package ksyun.client.clickhouse.recoverrecycledinstance.v20210101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname RecoverRecycledInstanceRequest
* @Description 请求参数
*/
@Data
public class RecoverRecycledInstanceRequest{
    /**实例ID列表。*/
    @KsYunField(name="InstanceIds",type=2)
    private List<String> InstanceIdsList;


}