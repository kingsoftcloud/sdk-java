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

}
