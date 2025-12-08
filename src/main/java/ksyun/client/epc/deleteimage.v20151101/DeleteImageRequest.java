package ksyun.client.epc.deleteimage.v20151101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DeleteImageRequest
* @Description 请求参数
*/
@Data
public class DeleteImageRequest{
    /**原镜像ID*/
    @KsYunField(name="ImageId")
    private String ImageId;

}
