package ksyun.client.kec.switchimagetype.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname SwitchImageTypeRequest
* @Description 请求参数
*/
@Data
public class SwitchImageTypeRequest{
    /**镜像类型转换*/
    @KsYunField(name="ImageId",type=2)
    private List<String> ImageIdList;

}
