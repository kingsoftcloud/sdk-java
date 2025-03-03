package ksyun.client.epc.describeshareimageaccountlist.v20151101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribeShareImageAccountListRequest
 * @Description 请求参数
 */
@Data
public class DescribeShareImageAccountListRequest {
    /**
     * 共享的镜像ID
     */
    @KsYunField(name = "ImageId")
    private String ImageId;


}