package ksyun.client.kcf.describefunctions.v20211215;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeFunctionsRequest
* @Description 请求参数
*/
@Data
public class DescribeFunctionsRequest{
    /**命名空间*/
    @KsYunField(name="Namespace")
    private String Namespace;

}
