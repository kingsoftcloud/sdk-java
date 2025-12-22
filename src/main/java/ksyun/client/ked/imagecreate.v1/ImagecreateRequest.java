package ksyun.client.ked.imagecreate.v1;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ImagecreateRequest
* @Description 请求参数
*/
@Data
public class ImagecreateRequest{
    /**镜像名称
*/
    @KsYunField(name="imageName")
    private String ImageName;

    /**描述信息*/
    @KsYunField(name="description")
    private String Description;

    /**云电脑id*/
    @KsYunField(name="instanceId")
    private String InstanceId;

}
