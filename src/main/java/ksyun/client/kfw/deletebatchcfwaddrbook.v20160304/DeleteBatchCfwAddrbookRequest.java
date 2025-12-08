package ksyun.client.kfw.deletebatchcfwaddrbook.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DeleteBatchCfwAddrbookRequest
* @Description 请求参数
*/
@Data
public class DeleteBatchCfwAddrbookRequest{
    /**要删除的地址簿ID列表，单次删除数量不能超过1000条*/
    @KsYunField(name="AddrbookIds",type=2)
    private List<String> AddrbookIdsList;

    /**防火墙实例ID*/
    @KsYunField(name="CfwInstanceId")
    private String CfwInstanceId;

}
