package ksyun.client.kead.describekeadip.v20200101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeKeadIpRequest
* @Description 请求参数
*/
@Data
public class DescribeKeadIpRequest{
    /***/
    @KsYunField(name="Ip")
    private String Ip;

    /**项目制id*/
    @KsYunField(name = "ProjectId", type = 1)
    private List<Integer> ProjectIdList;

    /**每页条数*/
    @KsYunField(name="PageSize")
    private Integer PageSize;

    /**开始条数*/
    @KsYunField(name="OffSet")
    private Integer OffSet;

}
