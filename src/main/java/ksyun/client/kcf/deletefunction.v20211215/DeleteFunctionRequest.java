package ksyun.client.kcf.deletefunction.v20211215;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DeleteFunctionRequest
* @Description 请求参数
*/
@Data
public class DeleteFunctionRequest{
    /**函数ID*/
    @KsYunField(name="Id")
    private String Id;

}
