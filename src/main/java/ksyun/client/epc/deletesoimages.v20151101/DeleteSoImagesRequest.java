package ksyun.client.epc.deletesoimages.v20151101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DeleteSoImagesRequest
* @Description 请求参数
*/
@Data
public class DeleteSoImagesRequest{
    /**自定义镜像ID，最多支持100个ID。
• 参数 -N：表示镜像的序号。
• 多个Image ID之间用&分隔。*/
    @KsYunField(name="ImageIds")
    private List<String> ImageIdsList;

}