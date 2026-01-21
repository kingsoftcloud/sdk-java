package ksyun.client.aicp.modifyimage.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ModifyImageRequest
* @Description 请求参数
*/
@Data
public class ModifyImageRequest{
    /**自定义镜像ID*/
    @KsYunField(name="ImageId")
    private String ImageId;

    /**镜像名称*/
    @KsYunField(name="ImageName")
    private String ImageName;

    /**镜像权限*/
    @KsYunField(name="ImagePermission")
    private String ImagePermission;

}
