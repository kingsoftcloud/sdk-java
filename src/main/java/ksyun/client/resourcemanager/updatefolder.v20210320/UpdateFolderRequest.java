package ksyun.client.resourcemanager.updatefolder.v20210320;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname UpdateFolderRequest
* @Description 请求参数
*/
@Data
public class UpdateFolderRequest{
    /**资源夹ID*/
    @KsYunField(name="FolderId")
    private String FolderId;

    /**父级资源夹ID*/
    @KsYunField(name="ParentId")
    private String ParentId;

    /**新的资源夹名称*/
    @KsYunField(name="Name")
    private String Name;

    /**新的备注*/
    @KsYunField(name="Desc")
    private String Desc;


}