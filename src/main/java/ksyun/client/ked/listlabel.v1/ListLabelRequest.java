package ksyun.client.ked.listlabel.v1;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ListLabelRequest
* @Description 请求参数
*/
@Data
public class ListLabelRequest{
    /**标签名*/
    @KsYunField(name="name")
    private String Name;

}
