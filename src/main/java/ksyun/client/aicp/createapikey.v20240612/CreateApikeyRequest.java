package ksyun.client.aicp.createapikey.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreateApikeyRequest
* @Description 请求参数
*/
@Data
public class CreateApikeyRequest{
    /**API Key 名称*/
    @KsYunField(name="Name")
    private String Name;

    /**API Key 描述*/
    @KsYunField(name="Description")
    private String Description;

    /**项目ID*/
    @KsYunField(name="ProjectId")
    private Integer ProjectId;

    /**关联的模型列表*/
    @KsYunField(name="AssociatedModelIds",type=2)
    private List<String> AssociatedModelIdsList;

    /**是否全选*/
    @KsYunField(name="AllAssociatedModel")
    private Boolean AllAssociatedModel;

    /**IP白名单，空数组表示不设置白名单*/
    @KsYunField(name="AllowedIps",type=2)
    private List<String> AllowedIpsList;

}
