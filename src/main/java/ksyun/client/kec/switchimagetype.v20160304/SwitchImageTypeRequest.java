package ksyun.client.kec.switchimagetype.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

import java.util.List;

/**
 * @Classname SwitchImageTypeRequest
 * @Description 请求参数
 */
@Data
public class SwitchImageTypeRequest {
    /**
     * 镜像类型转换
     */
    @KsYunField(name = "ImageId")
    private List<String> ImageIdList;

}