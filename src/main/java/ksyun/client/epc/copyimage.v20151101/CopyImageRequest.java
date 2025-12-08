package ksyun.client.epc.copyimage.v20151101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CopyImageRequest
* @Description 请求参数
*/
@Data
public class CopyImageRequest{
    /**镜像名称*/
    @KsYunField(name="DestinationName")
    private String DestinationName;

    /**自定义镜像ID*/
    @KsYunField(name="ImageId")
    private String ImageId;

    /**目标机房*/
    @KsYunField(name="DestinationRegion")
    private String DestinationRegion;

    /**是否复制Tag,yes|no*/
    @KsYunField(name="CopyTag")
    private String CopyTag;

}
