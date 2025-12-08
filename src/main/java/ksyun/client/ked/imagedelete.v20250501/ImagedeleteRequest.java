package ksyun.client.ked.imagedelete.v20250501;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ImagedeleteRequest
* @Description 请求参数
*/
@Data
public class ImagedeleteRequest{
    /**镜像 id*/
    @KsYunField(name="imageId")
    private String ImageId;

}
