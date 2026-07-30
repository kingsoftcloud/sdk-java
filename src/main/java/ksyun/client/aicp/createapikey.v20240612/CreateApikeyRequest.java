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
    private Long ProjectId;

    /**关联的模型列表*/
    @KsYunField(name="AssociatedModelIds",type=2)
    private List<String> AssociatedModelIdsList;

    /**是否全选*/
    @KsYunField(name="AllAssociatedModel")
    private Boolean AllAssociatedModel;

    /**IP白名单，空数组表示不设置白名单*/
    @KsYunField(name="AllowedIps",type=2)
    private List<String> AllowedIpsList;

    /**允许的接入点列表*/
    @KsYunField(name="AllowEndpoints",type=2)
    private List<String> AllowEndpointsList;

    /**是否全选接入点*/
    @KsYunField(name="AllAssociatedEndpoint")
    private Boolean AllAssociatedEndpoint;

    /**是否项目下资源全选*/
    @KsYunField(name="AllAssociatedProjectResources")
    private Boolean AllAssociatedProjectResources;

    /**低价池(标准池)模型名称列表*/
    @KsYunField(name="LowPriceModels",type=2)
    private List<String> LowPriceModelsList;

    /**高价池模型名称列表*/
    @KsYunField(name="HighPriceModels",type=2)
    private List<String> HighPriceModelsList;

}
