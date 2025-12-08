package ksyun.client.kec.removeimages.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname RemoveImagesRequest
* @Description 请求参数
*/
@Data
public class RemoveImagesRequest{
    /**待删除的镜像ID。
标准UUID格式，形如^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$*/
    @KsYunField(name="ImageId")
    private String ImageId;

}
