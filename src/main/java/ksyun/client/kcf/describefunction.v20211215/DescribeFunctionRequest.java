package ksyun.client.kcf.describefunction.v20211215;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeFunctionRequest
* @Description 请求参数
*/
@Data
public class DescribeFunctionRequest{
    /**函数Id*/
    @KsYunField(name="id")
    private String Id;

}
