package ksyun.client.kfw.deletebatchhostbook.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DeleteBatchHostbookRequest
* @Description 请求参数
*/
@Data
public class DeleteBatchHostbookRequest{
    /**需要批量删除的域名簿ID列表。域名簿ID是创建域名簿时系统自动生成的唯一标识符，格式为UUID。支持一次性删除多个域名簿，但建议单次删除数量不超过100个。注意：被ACL规则引用的域名簿无法删除。*/
    @KsYunField(name="HostbookIds",type=2)
    private List<String> HostbookIdsList;

    /**云防火墙实例ID。指定要删除域名簿的云防火墙实例，域名簿必须属于该防火墙实例。防火墙实例ID是创建防火墙时系统自动生成的唯一标识符，格式为UUID。*/
    @KsYunField(name="CfwInstanceId")
    private String CfwInstanceId;

}
