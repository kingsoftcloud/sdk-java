package ksyun.client.kfw.deleteservicegroupbatch.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DeleteServiceGroupBatchRequest
* @Description 请求参数
*/
@Data
public class DeleteServiceGroupBatchRequest{
    /**服务组ID集合*/
    @KsYunField(name="ServiceGroupIds",type=2)
    private List<String> ServiceGroupIdsList;

    /**防火墙id*/
    @KsYunField(name="CfwInstanceId")
    private String CfwInstanceId;

}
