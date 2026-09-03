package ksyun.client.aicp.modifyapikey.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ModifyApikeyRequest
* @Description 请求参数
*/
@Data
public class ModifyApikeyRequest{
    /***/
    @KsYunField(name="KeyId")
    private String KeyId;

    /**API Key 名称*/
    @KsYunField(name="Name")
    private String Name;

    /**API Key 描述*/
    @KsYunField(name="Description")
    private String Description;

    /**API Key 关联的模型列表*/
    @KsYunField(name="AssociatedModelIds",type=2)
    private List<String> AssociatedModelIdsList;

    /**是否全选*/
    @KsYunField(name="AllAssociatedModel")
    private Boolean AllAssociatedModel;

    /**接入点列表*/
    @KsYunField(name="AllowEndpoints",type=2)
    private List<String> AllowEndpointsList;

    /**项目下所有资源全选*/
    @KsYunField(name="AllAssociatedProjectResources")
    private Boolean AllAssociatedProjectResources;

    /**接入点全选*/
    @KsYunField(name="AllAssociatedEndpoint")
    private Boolean AllAssociatedEndpoint;

    /**低价池(标准池)模型名称列表*/
    @KsYunField(name="LowPriceModels",type=2)
    private List<String> LowPriceModelsList;

    /**高价池模型名称列表*/
    @KsYunField(name="HighPriceModels",type=2)
    private List<String> HighPriceModelsList;

    /**IP白名单列表，有值则启用白名单*/
    @KsYunField(name="AllowedIps",type=2)
    private List<String> AllowedIpsList;

    /**项目制ID*/
    @KsYunField(name="ProjectId")
    private String ProjectId;

}
