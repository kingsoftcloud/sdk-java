package ksyun.client.kead.describekead.v20200101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeKeadRequest
* @Description 请求参数
*/
@Data
public class DescribeKeadRequest{
    /**高防包ID*/
    @KsYunField(name="KeadId",type=1)
    private List<String> KeadIdList;

    /**项目制id*/
    @KsYunField(name="ProjectId",type=1)
    private List<Integer> ProjectIdList;

}
