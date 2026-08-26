package ksyun.client.vpc.createpathtask.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreatePathTaskRequest
* @Description 请求参数
*/
@Data
public class CreatePathTaskRequest{
    /**路径分析ID*/
    @KsYunField(name="PathId")
    private String PathId;

}
