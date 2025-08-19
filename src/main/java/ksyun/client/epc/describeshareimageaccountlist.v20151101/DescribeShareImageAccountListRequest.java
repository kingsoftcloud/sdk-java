package ksyun.client.epc.describeshareimageaccountlist.v20151101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeShareImageAccountListRequest
* @Description 请求参数
*/
@Data
public class DescribeShareImageAccountListRequest{
    /**共享的镜像ID*/
    @KsYunField(name="ImageId")
    private String ImageId;

}