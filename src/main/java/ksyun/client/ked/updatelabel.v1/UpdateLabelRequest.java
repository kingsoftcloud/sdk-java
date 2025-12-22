package ksyun.client.ked.updatelabel.v1;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname UpdateLabelRequest
* @Description 请求参数
*/
@Data
public class UpdateLabelRequest{
    /**标签id*/
    @KsYunField(name="id")
    private Integer Id;

    /**标签名*/
    @KsYunField(name="name")
    private String Name;

}
