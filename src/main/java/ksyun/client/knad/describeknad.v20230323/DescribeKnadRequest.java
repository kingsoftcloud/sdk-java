package ksyun.client.knad.describeknad.v20230323;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeKnadRequest
* @Description 请求参数
*/
@Data
public class DescribeKnadRequest{
    /**项目制id*/
    @KsYunField(name="ProjectId",type=1)
    private List<String> ProjectIdList;

    /***/
    @KsYunField(name="KnadId",type=1)
    private List<String> KnadIdList;

}
