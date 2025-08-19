package ksyun.client.epc.createimage.v20151101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreateImageRequest
* @Description 请求参数
*/
@Data
public class CreateImageRequest{
    /**裸金属服务器资源ID*/
    @KsYunField(name="HostId")
    private String HostId;

    /**镜像名称*/
    @KsYunField(name="ImageName")
    private String ImageName;

    /**镜像类型：SystemDisk|AllDisk*/
    @KsYunField(name="ImageMode")
    private String ImageMode;

    /**裸金属服务器自定义镜像初始化选项:Initialization|Uninitialized*/
    @KsYunField(name="ImageInitialization")
    private String ImageInitialization;

}