package ksyun.client.epc.modifyimage.v20151101;

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
public class ModifyImageRequest {
    /**
     * 镜像名称
     */
    @KsYunField(name = "ImageName")
    private String ImageName;

    /**
     * 原镜像ID
     */
    @KsYunField(name = "ImageId")
    private String ImageId;

}