package ksyun.client.vpc.deletenetworkpath.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DeleteNetworkPathRequest
* @Description 请求参数
*/
@Data
public class DeleteNetworkPathRequest{
    /**路径分析ID*/
    @KsYunField(name="PathId")
    private String PathId;

}
